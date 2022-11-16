package com.sbit.homeatraipur.service;

import com.sbit.homeatraipur.dto.IndependentHouseDetailDto;
import com.sbit.homeatraipur.entity.IndependentHouseDetail;

public interface IndependentHouseDetailService {

	public void createHouseDetail(IndependentHouseDetailDto houseDetailDto);
	
	public IndependentHouseDetail getHouseDetail(int houseId);
	
	public void updateHouseDetail(IndependentHouseDetailDto houseDetailDto);
	
	public void deleteHouseDetail(int houseId);
}
