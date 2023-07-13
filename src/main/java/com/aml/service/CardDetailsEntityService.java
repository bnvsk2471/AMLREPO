package com.aml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.CardDetailsEntity;
import com.aml.repository.CardDetailsEntityRepo;

@Service
public class CardDetailsEntityService {
    @Autowired
	private CardDetailsEntityRepo cardDetailsEntityRepo;
    
    public List<CardDetailsEntity> fetchByDataId(Integer dataId) {
    	return cardDetailsEntityRepo.findByDataId(dataId);
    }
}
