package com.aml.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.CustomerDetails;
import com.aml.repository.CustomerDetailsRepo;
import com.aml.service.CustomerDetailsService;


@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
	
	@Autowired
	private CustomerDetailsRepo customerDetailsRepo;
	 
	@Override
	public CustomerDetails getCustomerDetails(Integer dataId)  {
		
		return customerDetailsRepo.findByDataId(dataId);
					//.orElseThrow(()->new CustomerDetailsNotFound("Customer details not found for the given Id"));
	}

}
