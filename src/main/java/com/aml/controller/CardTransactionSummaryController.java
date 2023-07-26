package com.aml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.CardTransactionSummary;
import com.aml.service.CardTransactionSummaryService;

@RestController
@RequestMapping("/cardtransactionsummary")
public class CardTransactionSummaryController {

	@Autowired
	private CardTransactionSummaryService cardTransactionSummaryService;
	
	@GetMapping("/{cardNumber}")
	public List<CardTransactionSummary> fetchByCardNumber(@PathVariable Long cardNumber){
		return cardTransactionSummaryService.fetchByCardNumber(cardNumber);
	}
}
