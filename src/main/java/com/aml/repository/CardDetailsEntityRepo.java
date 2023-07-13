package com.aml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aml.entity.CardDetailsEntity;
@Repository
public interface CardDetailsEntityRepo extends JpaRepository<CardDetailsEntity, Integer>{

	public List<CardDetailsEntity> findByDataId(Integer dataId);
}
