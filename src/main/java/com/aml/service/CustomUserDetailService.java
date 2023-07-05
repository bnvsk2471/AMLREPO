package com.aml.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aml.entity.LoginUser;
import com.aml.repository.LoginUserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private LoginUserRepository loginUserrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LoginUser loginUser=loginUserrepo.findByUserName(username);
		System.out.println(loginUser);
		return new User(loginUser.getUserName(), loginUser.getPassword(), new ArrayList<>());
	
	}

	}


