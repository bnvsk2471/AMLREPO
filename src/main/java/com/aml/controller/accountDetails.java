package com.aml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.AccountDetails;
import com.aml.entity.AmlCaseHeaderDetails;
import com.aml.entity.CustomerDetails;
import com.aml.entity.TransactionDetails;
import com.aml.entity.TransactionSummary;
import com.aml.service.AccountDetailsService;
import com.aml.service.AmlCaseHeaderDetailsService;
import com.aml.service.CustomerDetailsService;
import com.aml.service.TransactionDetailsService;
import com.aml.service.TransactionSummaryService;

@RestController
@RequestMapping("/AML")
public class accountDetails {
	
	@Autowired
	private AccountDetailsService accountDetailsService;
	@Autowired
	private TransactionDetailsService transactionDetailsService;
	@Autowired
	private TransactionSummaryService summaryService;
	
	@GetMapping("/Account-Detais/{dataId}")
	public List<AccountDetails> getAccountDetails(
			@PathVariable Long dataId){
		return accountDetailsService.getAccountDetails(dataId);
	}
    
	@GetMapping("/transactiontetails/{accountNumber}")
	public List<TransactionDetails> fetchAccountNumber(@PathVariable Integer accountNumber) {
		return transactionDetailsService.fetchByAccountNumber(accountNumber);
	}

    @GetMapping("/transactionsummary/{accountNumber}")
	public  List<TransactionSummary> fetchByAccontNumber(@PathVariable Integer accountNumber) {
		return summaryService.fetchByAccountNumber(accountNumber);
	}
	
}
