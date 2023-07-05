package com.aml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.CardDetails;

@Repository
public interface CardDetailsRepository extends JpaRepository<CardDetails, Integer>{

}
