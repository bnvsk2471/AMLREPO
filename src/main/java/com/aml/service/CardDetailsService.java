package com.aml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.CardDetails;
import com.aml.repository.CardDetailsRepository;

@Service
public class CardDetailsService {
    @Autowired
	private CardDetailsRepository  cardDetailsRepository;
    
    public List<CardDetails> getCardDetails(){
    	return cardDetailsRepository.findAll();
    }
	
}
