package com.aml.service;

import java.util.List;

import com.aml.entity.Documents;

public interface DocumentsService {
	
	public List<Documents> fetchAllDocuments(Integer dataId);

}
