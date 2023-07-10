package com.aml.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AML_APP_DETAILS")
public class AppDetails {
	@Id
	private int id;
	private double openCases;
	private double closedCases;
	private double overdueCases;
	
	private int tot;
	private int high;
	private int medium;
	private int low;
	
	private int newCases;
	private int amberZoneCases;
	private int aboutToDueCases;
	private int rfiResReceived;
	private int rfaResReceived;
	private int newAlerts;

}
