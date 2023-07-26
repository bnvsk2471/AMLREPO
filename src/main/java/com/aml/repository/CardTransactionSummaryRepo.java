package com.aml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.CardTransactionSummary;
@Repository
public interface CardTransactionSummaryRepo extends JpaRepository<CardTransactionSummary, Integer>{
	public List<CardTransactionSummary> findByCardNumber(Long cardNumber);
}
