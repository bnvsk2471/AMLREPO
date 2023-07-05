package com.aml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.AppDetails;
@Repository
public interface AppDetailsRepository extends JpaRepository<AppDetails, Integer>{
	
}
