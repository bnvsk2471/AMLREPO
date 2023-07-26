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
@Table(name = "CARD_TRANSACTION_SUMMARY_DETAILS")
public class CardTransactionSummary {
	@Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
	@Column(name = "CARD_NUMBER")
	private Long cardNumber;
	@Column(name = "CARD_DESCRIPTION")
	private String cardDescription;
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

