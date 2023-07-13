package com.aml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.FileData;


@Repository
public interface FileDataRepo extends JpaRepository<FileData, Integer> {
	
	 FileData findByDataId(Integer dataId);

}
