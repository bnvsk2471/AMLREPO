package com.aml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.CustomerDetails;
import com.aml.service.CustomerDetailsService;

@RestController
@RequestMapping("/AML")
public class customerDetails {
	
	
	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	
	@GetMapping("/Customer-Details/{dataId}")
	public ResponseEntity<CustomerDetails> getCustomerdetails(
			@PathVariable Integer dataId){
		CustomerDetails customerDetails=customerDetailsService.getCustomerDetails(dataId);
		return ResponseEntity.ok(customerDetails);
	}
	

}
