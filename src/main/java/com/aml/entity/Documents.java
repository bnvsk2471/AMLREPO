package com.aml.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AML_DOCUMENT_DATA")
public class Documents {
	
	@Id
	@Column(name = "DOC_INFO_ID")
	private Integer docInfoId;
	@Column(name = "DATA_ID")
	private Integer dataId;
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "URL")
	private String url;

}
