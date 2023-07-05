package com.aml.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aml.entity.AuthRequest;
import com.aml.exception.UnauthorizedException;
import com.aml.util.JwtUtil;

@RestController
@CrossOrigin
public class LoginUserController {
	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/")
	public String user() {
		return "Wel come to Login User!";
	}

	@PostMapping("/authenticate")
	public ResponseEntity<Object> generateToken(@RequestBody AuthRequest authRequest) {
		try {
			System.out.println(authRequest);
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		} catch (Exception e) {
			throw new UnauthorizedException("Invalid Username or Password");
		}
		String token = jwtUtil.generateToken(authRequest.getUserName());

		Map<String, Object> response = new HashMap<>();
		response.put("statusCode", HttpStatus.OK.value());
		response.put("message", "Authentication successful");
		response.put("token", token);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
