package com.sbit.homeatraipur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sbit.homeatraipur.dto.IndependentHouseDetailDto;
import com.sbit.homeatraipur.entity.IndependentHouseDetail;
import com.sbit.homeatraipur.exceptions.ExceptionMessage;
import com.sbit.homeatraipur.exceptions.IndependentHouseNotFoundException;
import com.sbit.homeatraipur.service.IndependentHouseDetailService;

@RestController
@RequestMapping("/api")
public class IndependentHouseDetailController {

	@Autowired
	private IndependentHouseDetailService houseDetailService;
	

	@PostMapping("/house-detail")
	public void creatHouseDetail(@RequestBody IndependentHouseDetailDto houseDto) {
		
		houseDetailService.createHouseDetail(houseDto);
	}
	
	@GetMapping("/house-detail/{houseId}")
	public IndependentHouseDetail getHouseDetail(@PathVariable int houseId) {
		return houseDetailService.getHouseDetail(houseId);
	}
	
	@PutMapping("/house-detail")
	public void  updateHouseDetail(@RequestBody IndependentHouseDetailDto houseDto) {
		houseDetailService.updateHouseDetail(houseDto);
	}
	
	@DeleteMapping("/house-detail/{houseId}")
	public void  deleteHouseDetail(@PathVariable int houseId) {
		houseDetailService.deleteHouseDetail(houseId);
	}
}
