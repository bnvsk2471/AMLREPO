package com.aml.binding;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class getCases {
	
	private int dataId;
	private String caseRefNo;
	private String sasCaseId;
	private String cifNo;
	private String alertedEntityNumber;
	private String primaryEntityName;
	private Integer ageing;
	private Date alertCreationDate;
	private String assignedUser;
	private LocalDate createdDate;
	private String caseStatus;
	

}
