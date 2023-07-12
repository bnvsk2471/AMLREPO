package com.aml.service;

import java.util.List;

import com.aml.entity.AccountDetails;

public interface AccountDetailsService {
	
	public List<AccountDetails> getAccountDetails(Long dataId);

}
