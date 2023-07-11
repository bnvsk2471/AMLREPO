package com.aml.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.binding.RiskScore;
import com.aml.entity.AllCases;
import com.aml.entity.Quarter;
import com.aml.enums.MonthEnum;
import com.aml.repository.AllCasesRepository;
import com.aml.util.QuarterDateUtil;
@Service
public class AllCasesService {

	@Autowired
	private AllCasesRepository allCasesRepository;
	@Autowired
	private QuarterDateUtil quarterDateUtil;
	
	public List<AllCases> getAllCases(){
		
		return allCasesRepository.findAll();
	}
	
	public List<AllCases> fetchDataByDateRange(){
		Map<String, LocalDate> datesMap = quarterDateUtil.getQuarterlyDates();
		LocalDate currentQuarterStartDate =datesMap.get("currentQuaterstartDate");
		List<AllCases> all = allCasesRepository.findByCreatedDateBetween(currentQuarterStartDate , LocalDate.now());
		return all;
	}
	
	
	public List<RiskScore> fetchRiskScore(){
		
		Map<String, LocalDate> datesMap = quarterDateUtil.getQuarterlyDates();
		
		RiskScore riskScorecurent=new RiskScore();
		//currentQuaterstartDate
		LocalDate currentQuaterstartDate=datesMap.get("currentQuaterstartDate");
		List<AllCases> all = allCasesRepository.findByCreatedDateBetween(currentQuaterstartDate, LocalDate.now());
		List<AllCases> high = allCasesRepository.findByCreatedDateBetweenAndRiskScore(currentQuaterstartDate, LocalDate.now(),"HIGH");
		List<AllCases> medium = allCasesRepository.findByCreatedDateBetweenAndRiskScore(currentQuaterstartDate, LocalDate.now(),"MEDIUM");
		List<AllCases> low = allCasesRepository.findByCreatedDateBetweenAndRiskScore(currentQuaterstartDate, LocalDate.now(),"LOW");
		
		riskScorecurent.setQuarter(quarterInfo(datesMap.get("currentQuaterstartDate").getMonth()) + datesMap.get("currentQuaterstartDate").getYear());
		riskScorecurent.setTotal(all.size());
		riskScorecurent.setHigh(high.size());
		riskScorecurent.setMedium(medium.size());
		riskScorecurent.setLow(low.size());
		//riskScorecurent.setYear(datesMap.get("currentQuaterstartDate").getYear());
		
		RiskScore riskScoreprevious=new RiskScore();
		LocalDate lastQuaterStartdate=datesMap.get("lastQuaterStartdate");
		LocalDate lastQuaterEnddate=datesMap.get("lastQuaterEnddate");
		List<AllCases> all1 = allCasesRepository.findByCreatedDateBetween(lastQuaterStartdate, lastQuaterEnddate);
		List<AllCases> high1 = allCasesRepository.findByCreatedDateBetweenAndRiskScore(lastQuaterStartdate, lastQuaterEnddate,"HIGH");
		List<AllCases> medium1 = allCasesRepository.findByCreatedDateBetweenAndRiskScore(lastQuaterStartdate, lastQuaterEnddate,"MEDIUM");
		List<AllCases> low1 = allCasesRepository.findByCreatedDateBetweenAndRiskScore(lastQuaterStartdate, lastQuaterEnddate,"LOW");
		riskScoreprevious.setQuarter(quarterInfo(datesMap.get("lastQuaterStartdate").getMonth()) + datesMap.get("lastQuaterStartdate").getYear());
		riskScoreprevious.setTotal(all1.size());
		riskScoreprevious.setHigh(high1.size());
		riskScoreprevious.setMedium(medium1.size());
		riskScoreprevious.setLow(low1.size());
		//riskScoreprevious.setYear(datesMap.get("lastQuaterStartdate").getYear());
		
		List<RiskScore> list=new ArrayList<>();
		list.add(riskScorecurent);
		list.add(riskScoreprevious);
		
		return list;
	}
	
	public String quarterInfo(Month month) {
		
		
		if(month.equals("JANUARY")||month.equals("FEBRUARY")||month.equals("MARCH")) {
			return "Q4";
		}else if(month.equals("APRIL")||month.equals("MAY")||month.equals("JUNE")) {
			return "Q1";
		}else if(month.equals("JULY")||month.equals("AUGUST")||month.equals("SEPTEMBER")) {
			return "Q2";
		}else {
			return "Q3";
		}
		
	}
}
