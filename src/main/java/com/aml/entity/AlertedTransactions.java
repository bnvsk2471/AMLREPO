package com.aml.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AML_SAS_ALERTED_TRANSACTIONS")
public class AlertedTransactions {
	
	    @Id
	    @Column(name = "SAS_ALERT_ID")
	    private Integer sasAlertId;
	    
	    @Column(name = "DATA_ID")
	    private Integer dataId;
	    
	    @Column(name = "AGEING")
	    private Integer ageing;
	    
	    @Column(name = "PRIMARY_ENTITY_NAME")
	    private String primaryEntityName;
	    
	    @Column(name = "ALERTED_ENTITY_NUMBER")
	    private String alertedEntityName;
	    
	    @Column(name = "ALERT_DATE")
	    private Timestamp alertDate;
	    
	    @Column(name = "SCENARIO_NAME")
	    private String scenarioName;
	    
	    @Column(name = "SCENARIO_DESCRIPTION")
	    private String scenarioDescription;
	    
	    @Column(name = "CIF_NO")
	    private String cifNo;
	    
	    @Column(name = "SEGMENT")
	    private String segment;
	    
	    @Column(name = "STATUS")
	    private String status;
	    
	    @Column(name = "ACTUAL_VALUES_TEXT")
	    private String actualValuesText;
	    
	    @Column(name = "AMOUNT")
	    private Double amount;
}
