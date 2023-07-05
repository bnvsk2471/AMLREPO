package com.aml.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.AccountDetails;
import com.aml.exception.AccountDetailsNotFound;
import com.aml.repository.AccountDetailsRepo;
import com.aml.service.AccountDetailsService;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService {
	
	@Autowired
	private AccountDetailsRepo accountDetailsRepo;

	@Override
	public AccountDetails getAccountDetails(Long accountDetailsId) {
		
		return accountDetailsRepo.findById(accountDetailsId)
				.orElseThrow(()->new AccountDetailsNotFound(""));
	}
}
