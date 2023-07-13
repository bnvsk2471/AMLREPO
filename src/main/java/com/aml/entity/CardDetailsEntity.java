package com.aml.entity;

import javax.persistence.Column;
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
@Table(name = "CARD_DETAILS")
public class CardDetailsEntity {
    @Column(name = "ID")
    @Id
	private Integer id;
    @Column(name = "CARD_TYPE")
	private String cardType;
    @Column(name = "CARD_COMPANY")
	private String cardCompany;
    @Column(name = "CARD_NUMBER")
	private Long cardNumber;
    @Column(name = "DATA_ID")
	private Integer dataId;
}
