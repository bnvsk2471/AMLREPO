package com.aml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.AmlCaseHeaderDetails;

@Repository
public interface AmlCaseHeaderDetailsRepo extends JpaRepository<AmlCaseHeaderDetails, Integer> {
     public AmlCaseHeaderDetails findByDataId(Integer dataId);
}
