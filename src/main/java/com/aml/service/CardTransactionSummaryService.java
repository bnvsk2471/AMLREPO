package com.aml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.CardTransactionSummary;
import com.aml.repository.CardTransactionSummaryRepo;

@Service
public class CardTransactionSummaryService {
	@Autowired
	private CardTransactionSummaryRepo cardTransactionSummaryRepo;

	public List<CardTransactionSummary> fetchByCardNumber(Long accountNumber){
		
		return cardTransactionSummaryRepo.findByCardNumber(accountNumber);
	}
}
