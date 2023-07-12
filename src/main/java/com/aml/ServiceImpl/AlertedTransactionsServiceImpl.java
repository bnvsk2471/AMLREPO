package com.aml.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.AlertedTransactions;
import com.aml.repository.AlertedTranactionsRepo;
import com.aml.service.AlertedTransactionsService;

@Service
public class AlertedTransactionsServiceImpl implements AlertedTransactionsService {

	@Autowired
	private AlertedTranactionsRepo alertedTranactionsRepo;
	
	@Override
	public List<AlertedTransactions> getTransactions(Integer DataId) {
		List<AlertedTransactions> transactions=alertedTranactionsRepo.findByDataId(DataId);
		return transactions;
	}
}
