package com.aml.binding;

import lombok.Data;

@Data
public class RiskScore {
	
	private String Quarter;
	private Integer total;
	private Integer high;
	private Integer medium;
	private Integer low;
//	private Integer year;
}
