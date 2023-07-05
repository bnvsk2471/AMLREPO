package com.aml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.AllCases;
@Repository
public interface AllCasesRepository extends JpaRepository<AllCases, Integer>{
	

}
