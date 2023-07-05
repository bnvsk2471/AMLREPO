package com.aml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.AppDetails;
import com.aml.repository.AppDetailsRepository;

@Service
public class AppDetailsService {
    
	@Autowired
	private AppDetailsRepository appDetailsRepository;
	
	public List<AppDetails> getAllDetails(){
		
		return appDetailsRepository.findAll();
		
	}
}
