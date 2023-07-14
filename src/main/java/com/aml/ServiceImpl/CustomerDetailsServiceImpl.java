package com.aml.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.CustomerDetails;
import com.aml.exception.CustomerDetailsNotFound;
import com.aml.repository.CustomerDetailsRepo;
import com.aml.service.CustomerDetailsService;


@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService { 
	
	@Autowired
	private CustomerDetailsRepo customerDetailsRepo;
	 
	  
	@Override
	public CustomerDetails getCustomerDetails(Integer dataId)  {
		
		CustomerDetails customerDetails = Optional.ofNullable(customerDetailsRepo.findByDataId(dataId))		
				.orElseThrow(()->new CustomerDetailsNotFound("Customer details not found for the given "+dataId));
		
		return customerDetails;
	}

}
