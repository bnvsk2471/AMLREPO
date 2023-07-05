package com.aml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.CardDetails;
import com.aml.service.CardDetailsService;

@RestController
@RequestMapping("/carddetails")
public class CardDetailsController {
	@Autowired
	private CardDetailsService cardDetailsService;
    
	@GetMapping("/getcardDetails")
	public List<CardDetails> getAllCardDetails(){
	     return	cardDetailsService.getCardDetails();
	}
}
