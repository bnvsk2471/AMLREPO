package com.aml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.AllCases;
import com.aml.repository.AllCasesRepository;

@Service
public class AllCasesService {

	@Autowired
	private AllCasesRepository allCasesRepository;
	
	public List<AllCases> getAllCases(){
		
		return allCasesRepository.findAll();
	}
}
