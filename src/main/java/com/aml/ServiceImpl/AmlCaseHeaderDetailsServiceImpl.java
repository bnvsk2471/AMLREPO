package com.aml.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aml.entity.AmlCaseHeaderDetails;
import com.aml.exception.AmlCaseHeaderDetailsNotFound;
import com.aml.repository.AmlCaseHeaderDetailsRepo;
import com.aml.service.AmlCaseHeaderDetailsService;

@Service
public class AmlCaseHeaderDetailsServiceImpl implements AmlCaseHeaderDetailsService {
	
	@Autowired
	private AmlCaseHeaderDetailsRepo amlCaseHeaderDetailsRepo;

	@Override
	public AmlCaseHeaderDetails getAmlCaseHeaderDetails(Integer dataId) {
		return amlCaseHeaderDetailsRepo.findByDataId(dataId);
//				.orElseThrow(()->new AmlCaseHeaderDetailsNotFound
//						("Aml Case Header Details are not found with provided Id"));
	}

}
