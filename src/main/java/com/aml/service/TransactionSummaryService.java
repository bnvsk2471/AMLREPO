package com.aml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.TransactionSummary;
import com.aml.repository.TransactionSummaryRepository;
@Service
public class TransactionSummaryService {
	@Autowired
	private TransactionSummaryRepository summaryRepository;
	
	public List<TransactionSummary> fetchByAccountNumber(Integer accountNumber) {
		return summaryRepository.findByAccountNumber(accountNumber);
	}

}
