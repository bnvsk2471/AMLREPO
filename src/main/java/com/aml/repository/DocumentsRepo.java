package com.aml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.Documents;

@Repository
public interface DocumentsRepo extends JpaRepository<Documents, Integer>{
	List<Documents> findByDataId(Integer dataId);

}
