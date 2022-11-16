package com.sbit.homeatraipur.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbit.homeatraipur.dto.IndependentHouseDto;
import com.sbit.homeatraipur.entity.IndependentHouse;
import com.sbit.homeatraipur.service.IndependentHouseService;

@RestController
@RequestMapping("/api")
public class IndependentHouseController {

	@Autowired
	private IndependentHouseService independentHouseService;
	
	
	@PostMapping("/independent-house")
	public void createIndependenthouse(@RequestBody @Valid IndependentHouseDto house) {

		independentHouseService.createIndependentHouse(house);
	}

	@GetMapping("/independent-house/{id}")
	public IndependentHouse getIndependentHouse(@PathVariable int id) {
		return independentHouseService.getIndependentHouse(id);
	}
	
	@GetMapping("/independent-houses")
	public Page<IndependentHouse> getIndependentHouses(@RequestParam int page, @RequestParam int size) {
		Pageable pageable = PageRequest.of(page, size);
		
		return independentHouseService.getIndependentHouses(pageable);
	}
	
	@PutMapping("/independent-house")
	public void  updateIndependenthouse(@RequestBody @Valid IndependentHouseDto house) {

	   independentHouseService.UpdateIndependentHouse(house);
	}
	
	@DeleteMapping("/independent-house/{id}")
	public void DeleteIndependentHouse(@PathVariable int id) {
		independentHouseService.deleteIndependentHouse(id);
	}
	

}
