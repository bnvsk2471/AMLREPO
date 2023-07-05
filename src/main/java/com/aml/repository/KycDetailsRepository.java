package com.aml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.KycDetails;
@Repository
public interface KycDetailsRepository extends JpaRepository<KycDetails, Integer>{

}
