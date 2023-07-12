package com.aml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.TransactionDetails;
import com.aml.repository.TransactionDetailsRepository;
@Service
public class TransactionDetailsService {
    @Autowired
	private TransactionDetailsRepository transactionDetailsRepository;
    
    public List<TransactionDetails> fetchByAccountNumber(Integer accountNumber) {
    	return transactionDetailsRepository.findByAccountNumber(accountNumber);
    }
}
