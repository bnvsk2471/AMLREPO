package com.aml.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.CardDetails;
import com.aml.entity.CardDetailsEntity;
import com.aml.entity.CardTransactionDetails;
import com.aml.service.CardDetailsEntityService;
import com.aml.service.CardDetailsService;
import com.aml.service.CardTransactionDetailsService;

@RestController
@RequestMapping("/carddetails")
public class CardDetailsController {
	@Autowired
	private CardDetailsService cardDetailsService;
	@Autowired
	private CardTransactionDetailsService cardTransactionDetailsService;
	@Autowired
	private CardDetailsEntityService cardDetailsEntityService;
    
	@GetMapping("/getcardDetails")
	public List<CardDetails> getAllCardDetails(){
	     return	cardDetailsService.getCardDetails();
	}
	@GetMapping("/{cardNumber}")
	public List<CardTransactionDetails> fetchByAccountNumber(@PathVariable Long cardNumber){
	     return	cardTransactionDetailsService.fetchByCardNumber(cardNumber);
	}
	@GetMapping("/card/{dataId}")
	public List<CardDetailsEntity> fetchByDataId(@PathVariable Integer dataId){
	     return	cardDetailsEntityService.fetchByDataId(dataId);
	}
	
}
