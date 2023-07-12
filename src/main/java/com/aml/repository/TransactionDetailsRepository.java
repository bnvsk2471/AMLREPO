package com.aml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.TransactionDetails;
@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Integer>{
  public List<TransactionDetails> findByAccountNumber(Integer accountNumber);
}
