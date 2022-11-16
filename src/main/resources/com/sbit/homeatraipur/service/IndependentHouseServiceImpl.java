package com.sbit.homeatraipur.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbit.homeatraipur.dao.IndependentHouseRepository;
import com.sbit.homeatraipur.dto.IndependentHouseDto;
import com.sbit.homeatraipur.entity.IndependentHouse;

@Service
public class IndependentHouseServiceImpl implements IndependentHouseService {

	@Autowired
	private IndependentHouseRepository independentHouseRepository;

	@Override
	@Transactional
	public int createIndependentHouse(IndependentHouseDto houseDto ){
		
		IndependentHouse house = new IndependentHouse(houseDto);
		
		house.setId(0);
		
		independentHouseRepository.save(house);
		
		return 1;
	}

	@Override
	@Transactional
	public IndependentHouse getIndependentHouse(int id) {
		Optional<IndependentHouse> house = independentHouseRepository.findById(id);
		
		
		
		return house.get();
	}

	@Override
	public List<IndependentHouse> getIndependentHouses() {
        
		List<IndependentHouse> houses = independentHouseRepository.findAll();
		
		return houses;
	}



}
