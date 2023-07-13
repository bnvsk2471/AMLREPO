package com.aml.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.CardTransactionDetails;
@Repository
public interface CardTransactionDetailsRepo extends JpaRepository<CardTransactionDetails, Integer>{
public List<CardTransactionDetails> findByCardNumber(Long cardNumber);
	
}
