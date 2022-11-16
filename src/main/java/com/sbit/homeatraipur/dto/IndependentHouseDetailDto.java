package com.sbit.homeatraipur.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class IndependentHouseDetailDto {
	
	@Min(value = 0, message = "house id must not be less than 0")
	@Max(value=2147483647, message = "house id must be less than 2,14,74,83,647 ")
	private int houseId;
	
	@Min(value = 0, message = "id must not be less than 0")
	@Max(value=2147483647, message = "id must be less than 2,14,74,83,647 ")
	private int id;
	
	@NotBlank(message = "furnishing must not be blank")
	@Size(min=2, max=45, message = "furnishing must be written within 2 to 45 characters")
	private String furnishing;

	@NotBlank(message = "flooring must not be blank")
	@Size(min=2, max=45, message = "flooring must be written within 2 to 45 characters")
	private String flooring;
	
	@NotBlank(message = "facing must not be blank")
	@Size(min=1, max=11, message = "facing must be written within 1 to 11 characters")
	private String facing;
	
	@Min(value = 0, message = "age must not be less than 0")
	@Max(value = 127, message = "age must not be more than 127")
	private byte age;
	
	@Min(value = 1,  message = "age must not be less than 1")
	@Max(value = 127,  message = "age must not be more than 127")
	private byte widthOfFacingRoadInFt;
	
	@NotBlank(message = "water supply must not be blank")
	@Size(min=2,max=45, message = "water supply must be described within 2 to 45 characters")
	private String waterSupply;
	
	@NotBlank(message = "power supply must not be blank")
	@Size(min=2,max=45, message = "power supply must be described within 2 to 45 characters")
	private String powerSupply;
	
	@NotBlank(message = "power backup must not be blank")
	@Size(min=2,max=45, message = "power backup must be described within 2 to 45 characters")
	private String powerBackup;
	
	@NotBlank(message = "parking must not be blank")
	@Size(min=2,max=45, message = "parking must be described within 2 to 45 characters")
	private String parking;
	
	@Min(value = 1, message = "number of floor must not be less than 1")
	@Max(value = 127, message = "number of floor must not be more than 127")
	private byte numberOfFloor;
	

}
