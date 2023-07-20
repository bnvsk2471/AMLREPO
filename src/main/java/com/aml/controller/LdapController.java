package com.aml.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class LdapController {

	@GetMapping("/secure")
	public String secureMethod() {
		return "secure rest endpoint";
	}

}
