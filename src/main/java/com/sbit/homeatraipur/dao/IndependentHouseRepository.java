package com.sbit.homeatraipur.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sbit.homeatraipur.entity.IndependentHouse;

public interface IndependentHouseRepository extends JpaRepository<IndependentHouse, Integer> {
	
	@Override
	Page<IndependentHouse> findAll(Pageable pageable);

}
