package com.aml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.binding.getCasesSummery;
import com.aml.service.AllCasesService;

@RestController
@RequestMapping("/allcases")
public class AllCasesController {
    @Autowired
	private AllCasesService allCasesService;
	
    @GetMapping("/getallcases/{username}/{userrole}")
	public getCasesSummery getgetAllCases(
			@PathVariable String username,
			@PathVariable String userrole
			){
		return allCasesService.getAllCases(username,userrole);
	}
    
	/*
	 * @GetMapping("/quarterdetails") public List<AllCases> quarterDate(){ return
	 * allCasesService.fetchDataByDateRange(); }
	 */
    
	/*
	 * @GetMapping("/riskscore") public List<RiskScore> getRiskScore(){ return
	 * allCasesService.fetchRiskScore(); }
	 */
}
