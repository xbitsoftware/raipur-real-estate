package com.sbit.homeatraipur.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sbit.homeatraipur.dto.IndependentHouseDetailDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="independent_house_detail")
@NoArgsConstructor
@Getter
@Setter
public class IndependentHouseDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "furnishing")
	private String furnishing;

	@Column(name = "flooring")
	private String flooring;
	
	@Column(name = "facing")
	private String facing;
	
	@Column(name = "age")
	private byte age;
	
	@Column(name = "width_of_facing_road_in_ft")
	private byte widthOfFacingRoadInFt;
	
	@Column(name = "water_supply")
	private String waterSupply;
	
	@Column(name = "power_supply")
	private String powerSupply;
	
	@Column(name = "power_backup")
	private String powerBackup;
	
	@Column(name = "parking")
	private String parking;
	
	@Column(name = "no_of_floor")
	private byte numberOfFloor;
	
    public IndependentHouseDetail(IndependentHouseDetailDto houseDetailDto) {
    	
    	furnishing = houseDetailDto.getFurnishing();
    	
    	flooring = houseDetailDto.getFlooring();
    	
    	facing = houseDetailDto.getFacing();
    	
    	age = houseDetailDto.getAge();
    	
    	widthOfFacingRoadInFt = houseDetailDto.getWidthOfFacingRoadInFt();
    	
    	waterSupply = houseDetailDto.getWaterSupply();
    	
    	powerSupply = houseDetailDto.getPowerSupply();
    	
    	powerBackup = houseDetailDto.getPowerBackup();
    	
    	parking = houseDetailDto.getParking();
    	
    	numberOfFloor = houseDetailDto.getNumberOfFloor();
		
	}
	
	
	@OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, mappedBy = "houseDetail")
	@JsonIgnore
	private IndependentHouse house;
}
