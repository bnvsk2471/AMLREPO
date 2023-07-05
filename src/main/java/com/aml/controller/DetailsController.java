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
public class DetailsController {
	
	@Autowired
	private AmlCaseHeaderDetailsService amlCaseHeaderDetailsService;
	
	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@Autowired
	private AccountDetailsService accountDetailsService;
	
	
	@GetMapping("/Case-Header-Details/{dataId}")
	public ResponseEntity<AmlCaseHeaderDetails> getAmlCaseHeaderDetails(
			@PathVariable Integer dataId){
		
		AmlCaseHeaderDetails amlCaseHeaderDetails
				=amlCaseHeaderDetailsService.getAmlCaseHeaderDetails(dataId);
		return ResponseEntity.ok(amlCaseHeaderDetails);
	}
	
	@GetMapping("/Customer-Detais/{custId}")
	public ResponseEntity<CustomerDetails> getCustomerDetails(
			@PathVariable Long custId){
		CustomerDetails customerDetails=customerDetailsService.getCustomerDetails(custId);
		return ResponseEntity.ok(customerDetails);
	}
	
	@GetMapping("/Account-Detais/{accountDetailsId}")
	public ResponseEntity<AccountDetails> getAccountDetails(
			@PathVariable Long accountDetailsId){
		AccountDetails accountDetails=accountDetailsService.getAccountDetails(accountDetailsId);
		return ResponseEntity.ok(accountDetails);
	}

}
