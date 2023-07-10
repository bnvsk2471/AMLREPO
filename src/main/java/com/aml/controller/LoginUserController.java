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
import com.aml.entity.LoginUser;
import com.aml.exception.UnauthorizedException;
import com.aml.repository.LoginUserRepository;
import com.aml.util.JwtUtil;

@RestController
@CrossOrigin
public class LoginUserController {
	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private LoginUserRepository logiUserRepository;

	@GetMapping("/")
	public String user() {
		return "Wel come to Login User!";
	}

	@PostMapping("/authenticate")
	public ResponseEntity<Object> generateToken(@RequestBody AuthRequest authRequest) {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		} catch (Exception e) {
			throw new UnauthorizedException("Invalid Username or Password");
		}
		LoginUser user = logiUserRepository.findByUserName(authRequest.getUserName());
		String token = jwtUtil.generateToken(authRequest.getUserName());

		Map<String, Object> response = new HashMap<>();
		response.put("StatusCode", HttpStatus.OK.value());
		response.put("Message", "Authentication successful");
		response.put("Token", token);
		response.put("UserName", authRequest.getUserName());
		response.put("UserRole", user.getUserRole());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
