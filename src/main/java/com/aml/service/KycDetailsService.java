package com.aml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.KycDetails;
import com.aml.repository.KycDetailsRepository;

@Service
public class KycDetailsService {
    @Autowired
	private KycDetailsRepository kycDetailsRepository;
    
    public KycDetails getKycDetails(Integer dataId){
    	return kycDetailsRepository.findByDataId(dataId);
    }
}
