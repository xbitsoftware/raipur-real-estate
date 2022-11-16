package com.sbit.homeatraipur.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class IndependentHouseDto {
	
	@Min(value = 0, message = "id must not be less than 0")
	@Max(value=2147483647, message = "id must be less than 2,14,74,83,647 ")
	private int id;

	@Min(value = 1, message = "number of room must not be less than 1")
	@Max(value = 50, message = "number of room must not be more than 50")
	private byte numberOfRoom;
	

	@Min(value = 0, message = "number of hall must not be less than 0")
	@Max(value = 50, message = "number of hall must not be more than 50")
	private byte numberOfHall;
	
	@Min(value = 0, message = "number of kitchen must not be less than 0")
	@Max(value = 50, message = "number of kitchen must not be more than 50")
	private byte numberOfKitchen;

	@Min(value = 1, message = "number of bathroom must not be less than 1")
	@Max(value = 50, message = "number of bathroom must not be more than 50")
	private byte numberOfBathroom;
	
	@Min(value = 0, message = "number of balcony must not be less than 0")
	@Max(value = 50, message = "number of balcony must not be more than 50")
	private byte numberOfBalcony;
	
	@Min(value = 10, message = "builtup area must not be less than 10 square feet")
	@Max(value = 32767, message = "builtup area must not be more than 32,767 square feet" )
	private short builtupAreaInSqFt;
	
	@Min(value = 0, message = "carpet area must not be less than 0 square feet")
	@Max(value = 32767, message = "carpet area must not be more than 32,767 square feet" )
	private short cartpetAreaInSqFt;
	
	@Min(value = 1000, message = "price must not be less than Rs1,000")
	@Max(value = 2147483647, message = "price must not be more than Rs2,14,74,83,647")
	private int price;
	
	@NotBlank(message = "possession status must not be blank")
	@Size(min=4, max=45, message = "posession status must be written within 4 to 45 characters")
	private String possessionStatus;
	
	@NotBlank(message = "transaction type status must not be blank")
	@Size(min=3, max=6, message = "transaction type must be written within 3 to 6 characters" )
	private String transactionType;
	
	@NotBlank(message = "brokerage must not be blank")
	@Size(min=1, max=45, message = "brokerage must be written within 1 to 45 characters" )
	private String brokerage;
	
	@NotBlank(message = "address must not be blank")
	@Size(min=5, max=250, message = "address must be written within 5 to 250 characters")
	private String address;

}
