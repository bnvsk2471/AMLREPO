package com.aml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.AllCases;
import com.aml.service.AllCasesService;

@RestController
@RequestMapping("/allcases")
public class AllCasesController {
    @Autowired
	private AllCasesService allCasesService;
	
    @GetMapping("/getallcases")
	public List<AllCases> getgetAllCases(){
		return allCasesService.getAllCases();
	}
}
