package io.swagger.repository;

import io.swagger.model.Fund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundRepo extends JpaRepository<Fund, Integer> {
    Fund findById(int id);
}
