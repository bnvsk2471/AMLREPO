package com.aml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.AlertedTransactions;
import com.aml.service.AlertedTransactionsService;

@RestController
@RequestMapping("/aml")
public class AlertedTransactionController {
	@Autowired
	private AlertedTransactionsService alertedTransactionsService;
    
	@GetMapping("/AlertedTransactions/{dataId}")
	public List<AlertedTransactions> getTransactions(
			@PathVariable Integer dataId
			){
	     return	alertedTransactionsService.getTransactions(dataId);
	}
}
