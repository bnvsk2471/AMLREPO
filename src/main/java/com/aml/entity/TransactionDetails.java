package com.aml.entity;

import java.sql.Timestamp;
import java.util.Date;

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
@Table(name = "TRANSACTION_DETAILS")
public class TransactionDetails {


	@Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
	@Column(name = "ACCOUNT_NUMBER")
	private Integer accountNumber;
	@Column(name = "TXN_DATE")
	private Date txnDate;
	@Column(name = "TELLER_ID")
	private Integer tellerId;
	@Column(name = "REFERENCE_NUMBER")
	private Integer referenceNumber;
	@Column(name = "PRIMARY_DESCRIPTION")
	private String primaryDescription;
	@Column(name = "TRANSACTION_TIME")
	private Timestamp transactionTime;
	@Column(name = "DR")
	private String dr;
	@Column(name = "CR")
	private String cr;
	@Column(name = "BALANCE")
	private Long balance;
}
