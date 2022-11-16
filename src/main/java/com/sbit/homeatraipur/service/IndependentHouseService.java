package com.sbit.homeatraipur.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sbit.homeatraipur.dto.IndependentHouseDto;
import com.sbit.homeatraipur.entity.IndependentHouse;

public interface IndependentHouseService {

	void createIndependentHouse(IndependentHouseDto houseDto);

	IndependentHouse getIndependentHouse(int id);
	
	Page<IndependentHouse> getIndependentHouses(Pageable pageable);
	
	void UpdateIndependentHouse(IndependentHouseDto houseDto);
	
	void deleteIndependentHouse(int id);

}
