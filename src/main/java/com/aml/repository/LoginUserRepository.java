package com.aml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.LoginUser;

@Repository
public interface LoginUserRepository extends JpaRepository<LoginUser, Integer>{
	LoginUser findByUserName(String username);

}
