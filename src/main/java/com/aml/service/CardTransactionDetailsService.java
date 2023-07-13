package com.aml.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.CardTransactionDetails;
import com.aml.repository.CardTransactionDetailsRepo;

@Service
public class CardTransactionDetailsService {
    @Autowired
	private CardTransactionDetailsRepo cardTransactionDetailsRepo;
	
	public List<CardTransactionDetails> fetchByCardNumber(Long cardNumber) {
		return cardTransactionDetailsRepo.findByCardNumber(cardNumber);
	}
	
}
