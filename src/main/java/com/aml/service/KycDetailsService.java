package com.aml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.KycDetails;
import com.aml.repository.KycDetailsRepository;

@Service
public class KycDetailsService {
    @Autowired
	private KycDetailsRepository kycDetailsRepository;
    
    public List<KycDetails> getKycDetails(){
    	return kycDetailsRepository.findAll();
    }
}
