package io.swagger.service;

import io.swagger.model.Fund;
import io.swagger.repository.FundRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@ComponentScan(basePackages = { "io.swagger" })
@CacheConfig(cacheNames = "fund-rediscache-demo-cache")
public class DataService {
    @Autowired
    private FundRepo fundRepo;

//    public static final String KEY = "THE_KEY";

    @Cacheable(key = "#Id")
    public Fund save(Integer Id, Fund fund ) {
        return fundRepo.save(fund);
    }

//    @Cacheable
//    public List<Fund> findAll() {
//        try{ Thread.sleep(10000); } catch (Exception e){}
//        return fundRepo.findAll();
//    }

    @Cacheable(key = "#Id")
    public Fund findByID(Integer Id) {
        //try{ Thread.sleep(10000); } catch (Exception e){}
        return fundRepo.findById(Id).orElse(null);
    }


    @CacheEvict(key = "#Id")
    public Fund deleteById(Integer Id) {
//        int Id = fund.getId();
        fundRepo.deleteById(Id);
        return null;
    }

    @CacheEvict(allEntries = true)
    public void deleteCache() {
        log.info("CacheEvict invoked for all entries");
    }

    @CachePut(key = "#Id")
    public Fund update(Integer Id,Fund fund) {
        //int Id = fund.getId();
        if (fundRepo.existsById(Id)) {
            Fund fundByID = fundRepo.findById(Id).orElse(null);
            fundByID.setFundName(fund.getFundName());
            fundByID.setCategoryId(fund.getCategoryId());
            fundByID.setFundMangerName(fund.getFundMangerName());
            fundByID.setLongName(fund.getLongName());
            fundByID.setShortName(fund.getShortName());
            fundByID.setCusipID(fund.getCusipID());
            return fundRepo.save(fundByID);
        }
        return null;
    }

    //This Method is created to test the RedisCache
    public Fund updateNoCache(Integer Id,Fund fund) {
        //int Id = fund.getId();
        if (fundRepo.existsById(Id)) {
            Fund fundByID = fundRepo.findById(Id).orElse(null);
            fundByID.setFundName(fund.getFundName());
            fundByID.setCategoryId(fund.getCategoryId());
            fundByID.setFundMangerName(fund.getFundMangerName());
            fundByID.setLongName(fund.getLongName());
            fundByID.setShortName(fund.getShortName());
            fundByID.setCusipID(fund.getCusipID());
            return fundRepo.save(fundByID);
        }
        return null;
    }

    public boolean isValidFund(Integer Id){
        if (fundRepo.existsById(Id)) {
            return true;
        }
        return false;
    }

}
