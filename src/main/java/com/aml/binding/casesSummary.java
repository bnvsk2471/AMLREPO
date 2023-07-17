package com.aml.binding;

import lombok.Data;

@Data
public class casesSummary {
	
	private Integer newCases;
	private Integer amberZoneCases;
	private Integer aboutToDueCases;
	private Integer newAlerts;
	private Integer rfiRespReceived;
	private Integer rfaRespReceived;
	
	private Integer openCases;
	private Integer closedCases;
	private Integer overDueCases;
	
}
