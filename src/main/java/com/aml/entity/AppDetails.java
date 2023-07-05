package com.aml.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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
	public AppDetails() {
		super();
	}
	public AppDetails(int id, double openCases, double closedCases, double overdueCases, int tot, int high, int medium,
			int low, int newCases, int amberZoneCases, int aboutToDueCases, int rfiResReceived, int rfaResReceived,
			int newAlerts) {
		super();
		this.id = id;
		this.openCases = openCases;
		this.closedCases = closedCases;
		this.overdueCases = overdueCases;
		this.tot = tot;
		this.high = high;
		this.medium = medium;
		this.low = low;
		this.newCases = newCases;
		this.amberZoneCases = amberZoneCases;
		this.aboutToDueCases = aboutToDueCases;
		this.rfiResReceived = rfiResReceived;
		this.rfaResReceived = rfaResReceived;
		this.newAlerts = newAlerts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getOpenCases() {
		return openCases;
	}
	public void setOpenCases(double openCases) {
		this.openCases = openCases;
	}
	public double getClosedCases() {
		return closedCases;
	}
	public void setClosedCases(double closedCases) {
		this.closedCases = closedCases;
	}
	public double getOverdueCases() {
		return overdueCases;
	}
	public void setOverdueCases(double overdueCases) {
		this.overdueCases = overdueCases;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getMedium() {
		return medium;
	}
	public void setMedium(int medium) {
		this.medium = medium;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getNewCases() {
		return newCases;
	}
	public void setNewCases(int newCases) {
		this.newCases = newCases;
	}
	public int getAmberZoneCases() {
		return amberZoneCases;
	}
	public void setAmberZoneCases(int amberZoneCases) {
		this.amberZoneCases = amberZoneCases;
	}
	public int getAboutToDueCases() {
		return aboutToDueCases;
	}
	public void setAboutToDueCases(int aboutToDueCases) {
		this.aboutToDueCases = aboutToDueCases;
	}
	public int getRfiResReceived() {
		return rfiResReceived;
	}
	public void setRfiResReceived(int rfiResReceived) {
		this.rfiResReceived = rfiResReceived;
	}
	public int getRfaResReceived() {
		return rfaResReceived;
	}
	public void setRfaResReceived(int rfaResReceived) {
		this.rfaResReceived = rfaResReceived;
	}
	public int getNewAlerts() {
		return newAlerts;
	}
	public void setNewAlerts(int newAlerts) {
		this.newAlerts = newAlerts;
	}
	@Override
	public String toString() {
		return "AppDetails [id=" + id + ", openCases=" + openCases + ", closedCases=" + closedCases + ", overdueCases="
				+ overdueCases + ", tot=" + tot + ", high=" + high + ", medium=" + medium + ", low=" + low
				+ ", newCases=" + newCases + ", amberZoneCases=" + amberZoneCases + ", aboutToDueCases="
				+ aboutToDueCases + ", rfiResReceived=" + rfiResReceived + ", rfaResReceived=" + rfaResReceived
				+ ", newAlerts=" + newAlerts + "]";
	}
	

}
