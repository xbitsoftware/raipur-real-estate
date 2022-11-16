package com.sbit.homeatraipur.service;

import java.util.List;

import com.sbit.homeatraipur.dto.IndependentHouseDto;
import com.sbit.homeatraipur.entity.IndependentHouse;

public interface IndependentHouseService {
	
	public int createIndependentHouse(IndependentHouseDto houseDto);
	
	public IndependentHouse getIndependentHouse(int id);
	
	public List<IndependentHouse> getIndependentHouses();

}
