package com.aml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.Documents;
import com.aml.service.DocumentsService;

@RestController
public class DocumentsController {
	
	@Autowired
	private DocumentsService documentsService;
	
	
	@GetMapping("/documents/{dataId}")
	public ResponseEntity<List<Documents>> getDocuments(
			@PathVariable Integer dataId
			){
		List<Documents> documentsList=documentsService.fetchAllDocuments(dataId);
		return new ResponseEntity<List<Documents>>(documentsList,HttpStatus.OK);
		
	}

}
