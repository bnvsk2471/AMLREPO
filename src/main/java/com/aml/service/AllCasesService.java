package com.aml.service;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.binding.RiskScore;
import com.aml.binding.casesSummary;
import com.aml.binding.getCases;
import com.aml.binding.getCasesSummery;
import com.aml.entity.AllCases;
import com.aml.repository.AllCasesRepository;
import com.aml.util.QuarterDateUtil;
@Service
public class AllCasesService {

	@Autowired
	private AllCasesRepository allCasesRepository;
	@Autowired
	private QuarterDateUtil quarterDateUtil;

	
	public getCasesSummery getAllCases(String username, String role){
		List<String> users=Arrays.asList(username,role);
		List<AllCases> allCases=allCasesRepository.findByAssignedUserIn(users);
		List<getCases> getallcases=new ArrayList<>();
		int countAgeing = 0;
		int amberZoneCases=0;
		int group=0;
		int open=0;
		int close=0;
		for(AllCases cases:allCases) {
			getCases getcases=new getCases();
			getcases.setDataId(cases.getDataId());
			getcases.setCaseRefNo(cases.getCaseRefNo());
			getcases.setSasCaseId(cases.getSasCaseId());
			getcases.setCifNo(cases.getCifNo());
			getcases.setAlertedEntityNumber(cases.getAlertedEntityNumber());
			getcases.setPrimaryEntityName(cases.getPrimaryEntityName());
			int daysDifference = (int) ChronoUnit.DAYS.between(cases.getCreatedDate(), LocalDate.now());
			getcases.setAgeing(daysDifference);
			getcases.setAlertCreationDate(cases.getAlertCreationDate());
			getcases.setAssignedUser(cases.getAssignedUser());
			getcases.setCreatedDate(cases.getCreatedDate());
			getcases.setCaseStatus(cases.getCaseStatus());
			
			if (daysDifference >= 25 && daysDifference <= 30) {
	            countAgeing++;
	        }
			if(daysDifference >= 25) {
				amberZoneCases++;
			}
			if(cases.getAssignedUser().equals(role)) {
				group++;
			}
			if(cases.getCaseStatus().equalsIgnoreCase("open")) {
				open++;
			}else if(cases.getCaseStatus().equalsIgnoreCase("close")){
				close++;
			}
			
			if(cases.getCaseStatus().equalsIgnoreCase("close")) {
			}else {
			getallcases.add(getcases);
			}
		}
		casesSummary casesSummary=new casesSummary();
		casesSummary.setNewCases(group);
		casesSummary.setAmberZoneCases(amberZoneCases);
		casesSummary.setAboutToDueCases(countAgeing);
		casesSummary.setRfaRespReceived(50);
		casesSummary.setRfiRespReceived(50);
		casesSummary.setNewAlerts(63);
		casesSummary.setOpenCases(open);
		casesSummary.setClosedCases(close);
		casesSummary.setOverDueCases(amberZoneCases);
		

		getCasesSummery getCasesSummery=new getCasesSummery();
		getCasesSummery.setGetCases(getallcases);
		getCasesSummery.setCasesSummary(casesSummary);
		getCasesSummery.setRiskScores(fetchRiskScore());
		
		

		return getCasesSummery;
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
		
		riskScorecurent.setQuarter( datesMap.get("currentQuaterstartDate").getYear()+" "+quarterInfo(LocalDate.now().getMonth()) );
		System.out.println(LocalDate.now().getMonth());
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
		riskScoreprevious.setQuarter( datesMap.get("lastQuaterStartdate").getYear() +" "+ quarterInfo(datesMap.get("lastQuaterStartdate").getMonth()) );
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
		String month2 =month.name();
		if(month2.equals("JANUARY")||month2.equals("FEBRUARY")||month2.equals("MARCH")) {
			return "Q4";
		}else if(month2.equals("APRIL")||month2.equals("MAY")||month2.equals("JUNE")) {
			return "Q1";
		}else if(month2.equals("JULY")||month2.equals("AUGUST")||month2.equals("SEPTEMBER")) {
			return "Q2";
		}else {
			return "Q3";
		}
		
	}
}
