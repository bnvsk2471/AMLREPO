package com.aml.service;

import java.util.List;

import com.aml.entity.AlertedTransactions;

public interface AlertedTransactionsService {
	
	public List<AlertedTransactions> getTransactions(Integer DataId);

}
