package com.aml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.aml.entity.AppDetails;
import com.aml.service.AppDetailsService;

@RestController
@RequestMapping("/appdetails")
public class AppDetailsController {

	@Autowired
	private AppDetailsService appDetailsService;

	@GetMapping("/getallappdetails")
	public List<AppDetails> getAppDetails() {
		return appDetailsService.getAllDetails();
	}

}
