package com.sbit.homeatraipur.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbit.homeatraipur.dao.IndependentHouseRepository;
import com.sbit.homeatraipur.dto.IndependentHouseDto;
import com.sbit.homeatraipur.entity.IndependentHouse;

@Service
public class IndependentHouseServiceImpl implements IndependentHouseService {
	
	@Autowired
	private IndependentHouseRepository houseRepository;

	@Override
	@Transactional
	public void createIndependentHouse(IndependentHouseDto houseDto) {
		
		IndependentHouse house = new IndependentHouse(houseDto);
		house.setId(0);
		
		houseRepository.save(house);
		
		
	}

	@Override
	@Transactional
	public IndependentHouse getIndependentHouse(int id) {
		
		Optional<IndependentHouse> house = houseRepository.findById(id);
	
		return house.get();
	}

	@Override
	@Transactional
	public Page<IndependentHouse> getIndependentHouses(Pageable pageable) {
	
		return houseRepository.findAll(pageable);
	}

	@Override
	@Transactional
	public void UpdateIndependentHouse(IndependentHouseDto houseDto) {
		
		IndependentHouse house = new IndependentHouse(houseDto);
		
		house.setId(houseDto.getId());
		
		houseRepository.save(house);
		
		
	}

	@Override
	@Transactional
	public void deleteIndependentHouse(int id) {
	
		houseRepository.deleteById(id);
		
	
	}



}
