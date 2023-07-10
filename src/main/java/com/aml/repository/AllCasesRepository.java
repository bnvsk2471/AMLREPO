package com.aml.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.AllCases;
@Repository
public interface AllCasesRepository extends JpaRepository<AllCases, Integer>{
	public List<AllCases> findByCreatedDateBetween(LocalDate startdate1,LocalDate endDate);
	public List<AllCases> findByCreatedDateBetweenAndRiskScore(LocalDate startdate,LocalDate endDate,String risk);
}
