package com.aml.util;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class QuarterDateUtil {
	@Bean
	public Map<String, LocalDate> getQuarterlyDates() {
		LocalDate endDate = LocalDate.now();
		LocalDate currentQuaterstartDate = null;
		LocalDate lastQuaterStartdate=null;
		LocalDate lastQuaterEnddate=null;
		
		int currentMonthValue = endDate.getMonthValue();
		currentQuaterstartDate = endDate.minusMonths(currentMonthValue % 3 == 0 ? 2 : (currentMonthValue % 3 == 1 ? 0 : 1));
		currentQuaterstartDate = currentQuaterstartDate.withDayOfMonth(1);

		lastQuaterStartdate=endDate.minusMonths(currentMonthValue % 3 == 0 ? 5 : (currentMonthValue % 3 == 1 ? 3 : 4));
		lastQuaterStartdate=lastQuaterStartdate.withDayOfMonth(1);
		lastQuaterEnddate=lastQuaterStartdate.plusMonths(2).with(TemporalAdjusters.lastDayOfMonth());
		
		//int quarter = (startDate.getMonthValue() + 2) / 3; // Calculate the quarter based on the start date
	//	System.out.println("Quater is:"+quarter+"   "+"StartDate is:"+startDate);
       // return new Quarter(quarter, startDate);
		
		Map<String, LocalDate> datesmap= new HashMap<>();
		datesmap.put("currentQuaterstartDate", currentQuaterstartDate);
		datesmap.put("lastQuaterStartdate", lastQuaterStartdate);
		datesmap.put("lastQuaterEnddate", lastQuaterEnddate);
		return datesmap;
	}
}
