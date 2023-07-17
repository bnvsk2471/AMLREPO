package com.aml.binding;

import java.util.List;

import lombok.Data;

@Data
public class getCasesSummery {
	private casesSummary casesSummary;
	private List<getCases> getCases;
	private List<RiskScore> riskScores;
}
