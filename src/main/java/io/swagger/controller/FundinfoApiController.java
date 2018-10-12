package io.swagger.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.model.Fund;
import io.swagger.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-07T18:54:41.253Z")

@Controller
@Slf4j
class FundinfoApiController implements FundinfoApi {

    //    private static final Logger log = LoggerFactory.getLogger(FundinfoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private DataService dataService ;

    @Autowired
    public FundinfoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Fund> addfund(@ApiParam(value = "Fund object that needs to be added" ,required=true )@PathVariable("Id") Integer Id, @Valid @RequestBody Fund body) {
        FundinfoApiController.log.info("Addfund method called");
        String accept = request.getHeader("Accept");

        if (dataService.isValidFund(Id)){
            FundinfoApiController.log.error("Fund already exist -  Addfund method failed");
            return new ResponseEntity<Fund>(HttpStatus.BAD_REQUEST);
        }

        Fund fund =  dataService.save(Id,body);
        ResponseEntity<Fund> responseEntity = new ResponseEntity<Fund>(fund, HttpStatus.OK);
        FundinfoApiController.log.info("Addfund method executed");
        return responseEntity;

    }

    public ResponseEntity<Void> deleteFund(@ApiParam(value = "Id",required=true) @PathVariable("Id") Integer Id) {
        String accept = request.getHeader("Accept");
        FundinfoApiController.log.info("DeleteFund method called");

        if (!dataService.isValidFund(Id)){
            FundinfoApiController.log.error("Fund not exist -  DeleteFund method failed");
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }

        Fund fund =  dataService.deleteById(Id);
        ResponseEntity<Void> responseEntity = new ResponseEntity<Void>(HttpStatus.OK);
        FundinfoApiController.log.info("DeleteFund method executed");
        return responseEntity;
    }

    //public ResponseEntity<Void> deleteCache(@ApiParam(value = "All'",required=true) @PathVariable("All") String All) {
    public ResponseEntity<Void> deleteCache() {
        FundinfoApiController.log.info("DeleteCache method called");
        dataService.deleteCache();

        ResponseEntity<Void> responseEntity = new ResponseEntity<Void>(HttpStatus.OK);
        FundinfoApiController.log.info("DeleteCache method executed");
        return responseEntity;
    }

    //ResponseEntity<Fund> getFund(@ApiParam(value = "Id",required=true) @PathVariable("categoryId") Integer Id);
    public ResponseEntity<Fund> getFund(@ApiParam(value = "Id",required=true) @PathVariable("Id") Integer Id) {
        String accept = request.getHeader("Accept");
        FundinfoApiController.log.info("GetFund method called");

        if (!dataService.isValidFund(Id)){
            FundinfoApiController.log.error("Fund not exist -  GetFund method failed");
            return new ResponseEntity<Fund>(HttpStatus.BAD_REQUEST);
        }

        Fund fund =  dataService.findByID(Id);

        ResponseEntity<Fund> responseEntity = new ResponseEntity<Fund>(fund,HttpStatus.OK);
        FundinfoApiController.log.info("GetFund method executed");
        return responseEntity;
    }


    public ResponseEntity<Fund> updateFund(@ApiParam(value = "Fund object that needs to be added" ,required=true )@PathVariable("Id") Integer Id,  @Valid @RequestBody Fund body) {
        String accept = request.getHeader("Accept");
        FundinfoApiController.log.info("UpdateFund method called");

        if (!dataService.isValidFund(Id)){
            FundinfoApiController.log.error("Fund not exist -  UpdateFund method failed");
            return new ResponseEntity<Fund>(HttpStatus.BAD_REQUEST);
        }


        Fund fund =  dataService.update(Id,body);

        ResponseEntity<Fund> responseEntity = new ResponseEntity<Fund>(fund,HttpStatus.OK);
        FundinfoApiController.log.info("UpdateFund method executed");
        return responseEntity;
    }

    public ResponseEntity<Fund> updateFundNoCache(@ApiParam(value = "Fund object that needs to be added" ,required=true )@PathVariable("Id") Integer Id,  @Valid @RequestBody Fund body) {
        String accept = request.getHeader("Accept");
        FundinfoApiController.log.info("UpdateFund method called");

        if (!dataService.isValidFund(Id)){
            FundinfoApiController.log.error("Fund not exist -  UpdateFund method failed");
            return new ResponseEntity<Fund>(HttpStatus.BAD_REQUEST);
        }


        Fund fund =  dataService.updateNoCache(Id,body);

        ResponseEntity<Fund> responseEntity = new ResponseEntity<Fund>(fund,HttpStatus.OK);
        FundinfoApiController.log.info("UpdateFund method executed");
        return responseEntity;
    }



}