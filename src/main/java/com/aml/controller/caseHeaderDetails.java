package com.aml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.AmlCaseHeaderDetails;
import com.aml.service.AmlCaseHeaderDetailsService;

@RestController
@RequestMapping("/AML")
public class caseHeaderDetails {
	
	@Autowired
	private AmlCaseHeaderDetailsService amlCaseHeaderDetailsService;
	
	
	@GetMapping("/Case-Header-Details/{dataId}")
	public ResponseEntity<AmlCaseHeaderDetails> getAmlCaseHeaderDetails(
			@PathVariable Integer dataId){
		
		AmlCaseHeaderDetails amlCaseHeaderDetails
				=amlCaseHeaderDetailsService.getAmlCaseHeaderDetails(dataId);
		return ResponseEntity.ok(amlCaseHeaderDetails);
	}
	
}
