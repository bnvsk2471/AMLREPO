package com.aml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.KycDetails;
import com.aml.service.KycDetailsService;

@RestController
@RequestMapping("/kycDetails")
public class KycDetailsController {
    @Autowired
	private KycDetailsService kycDetailsService;
	
	@GetMapping("/getkycDetails")
	private List<KycDetails> getKycDetails(){
		return kycDetailsService.getKycDetails();
	}
}
