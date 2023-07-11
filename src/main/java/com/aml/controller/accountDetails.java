package com.aml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.AccountDetails;
import com.aml.entity.AmlCaseHeaderDetails;
import com.aml.entity.CustomerDetails;
import com.aml.service.AccountDetailsService;
import com.aml.service.AmlCaseHeaderDetailsService;
import com.aml.service.CustomerDetailsService;

@RestController
@RequestMapping("/AML")
public class accountDetails {
	
	@Autowired
	private AccountDetailsService accountDetailsService;
	
	
	
	@GetMapping("/Account-Detais/{accountDetailsId}")
	public ResponseEntity<AccountDetails> getAccountDetails(
			@PathVariable Long accountDetailsId){
		AccountDetails accountDetails=accountDetailsService.getAccountDetails(accountDetailsId);
		return ResponseEntity.ok(accountDetails);
	}

}
