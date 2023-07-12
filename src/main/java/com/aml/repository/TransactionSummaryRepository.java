package com.aml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.TransactionSummary;

@Repository
public interface TransactionSummaryRepository extends JpaRepository<TransactionSummary, Integer>{
	public List<TransactionSummary> findByAccountNumber(Integer accountNumber);
}
