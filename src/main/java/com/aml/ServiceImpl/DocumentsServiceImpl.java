package com.aml.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.Documents;
import com.aml.repository.DocumentsRepo;
import com.aml.service.DocumentsService;

@Service
public class DocumentsServiceImpl implements DocumentsService {
	
	@Autowired
	private DocumentsRepo documentsRepo;

	@Override
	public List<Documents> fetchAllDocuments(Integer dataId) {
		return documentsRepo.findByDataId(dataId);
	}

}
