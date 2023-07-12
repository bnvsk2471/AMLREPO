package com.aml.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TRANSACTION_SUMMARY_DETAILS")
public class TransactionSummary {
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
	@Column(name = "ACCOUNT_NUMBER")
	private Integer accountNumber;
	@Column(name = "ACCOUNT_DESCRIPTION")
	private String accountDescription;
	@Column(name = "CUSTOMER_NUMBER")
	private String customerNumber;
	@Column(name = "CURRENCY")
	private String currency;
	@Column(name = "ACCOUNT_CLASS")
	private String accountClass;
	@Column(name = "NO_OF_DEBITS")
	private Integer noOfDebits;
	@Column(name = "NO_OF_CREDITS")
	private Integer noOfCredits;
	@Column(name = "FROZEN")
	private boolean frozen;
	
}
