package com.sbit.homeatraipur.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbit.homeatraipur.dao.IndependentHouseDetailRepository;
import com.sbit.homeatraipur.dao.IndependentHouseRepository;
import com.sbit.homeatraipur.dto.IndependentHouseDetailDto;
import com.sbit.homeatraipur.entity.IndependentHouse;
import com.sbit.homeatraipur.entity.IndependentHouseDetail;
import com.sbit.homeatraipur.exceptions.IndependentHouseNotFoundException;

@Service
public class IndependentHouseDetailServiceImpl implements IndependentHouseDetailService {
	
	@Autowired
	private IndependentHouseRepository houseRepository;
	
	@Autowired
	private IndependentHouseDetailRepository houseDetailRepository;
	
	@Override
	@Transactional
	public void createHouseDetail(IndependentHouseDetailDto houseDetailDto) {
		
		IndependentHouseDetail houseDetail = new IndependentHouseDetail(houseDetailDto);
		houseDetail.setId(0);
		
		int houseId = houseDetailDto.getHouseId();
		
		IndependentHouse house = houseRepository.findById(houseId).get();
		
		if(house == null) {
			throw new IndependentHouseNotFoundException("independent house not found with id : " + houseId);
		}
		
		
	    house.setHouseDetail(houseDetail);
		
		
		houseDetail.setHouse(house);
		
		houseDetailRepository.save(houseDetail);

	}

	@Override
	@Transactional
	public IndependentHouseDetail getHouseDetail(int houseId) {
		
		IndependentHouse house = null;
		
		try {
			house = houseRepository.findById(houseId).get();
		}
		catch(NoSuchElementException ex) {
			System.out.println("exception");
			throw new IndependentHouseNotFoundException("independent house not found with id : " + houseId);
		}
		
		IndependentHouseDetail houseDetail =house.getHouseDetail();
		
		
		return houseDetail;
	}

	@Override
	@Transactional
	public void updateHouseDetail(IndependentHouseDetailDto houseDetailDto) {
		IndependentHouseDetail houseDetail = new IndependentHouseDetail(houseDetailDto);
		houseDetail.setId(houseDetailDto.getId());
			
		houseDetailRepository.save(houseDetail);

		
	}

	@Override
	@Transactional
	public void deleteHouseDetail(int houseId) {
	
		IndependentHouse house = houseRepository.findById(houseId).get();
		
		if(house == null) {
			throw new IndependentHouseNotFoundException("independent house not found with id : " + houseId);
		}
		
		IndependentHouseDetail houseDetail = house.getHouseDetail();
		
		house.setHouseDetail(null);
		
		houseDetailRepository.delete(houseDetail);
		
	}

}
