package com.aml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.AccountDetails;

@Repository
public interface AccountDetailsRepo extends JpaRepository<AccountDetails, Long> {
             public List<AccountDetails> findByDataId(Long dataId);
}
