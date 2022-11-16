package com.sbit.homeatraipur.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sbit.homeatraipur.dto.IndependentHouseDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "independent_house")
@NoArgsConstructor
@Getter
@Setter
public class IndependentHouse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "no_of_room")
	private byte numberOfRoom;
	

	@Column(name = "no_of_hall")
	private byte numberOfHall;
	
	@Column(name = "no_of_kitchen")
	private byte numberOfKitchen;

	@Column(name = "no_of_bathroom")
	private byte numberOfBathroom;
	
	
	@Column(name = "no_of_balcony")
	private byte numberOfBalcony;
	
	@Column(name = "builtup_area_in_sqft")
	private short builtupAreaInSqFt;
	
	@Column(name = "carpet_area_in_sqft")
	private short cartpetAreaInSqFt;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "possession_status")
	private String possessionStatus;
	
	@Column(name = "transaction_type")
	private String transactionType;
	
	@Column(name = "brokerage")
	private String brokerage;
	
	@Column(name = "address")
	private String address;
	
    public IndependentHouse(IndependentHouseDto house) {
    	numberOfRoom = house.getNumberOfRoom();
    	numberOfHall = house.getNumberOfHall();
    	numberOfKitchen = house.getNumberOfKitchen();
    	numberOfBathroom = house.getNumberOfBathroom();
    	numberOfBalcony = house.getNumberOfBalcony();
    	
    	builtupAreaInSqFt = house.getBuiltupAreaInSqFt();
    	cartpetAreaInSqFt = house.getCartpetAreaInSqFt();
    	
    	price = house.getPrice();
    	
    	possessionStatus = house.getPossessionStatus();
    	
    	transactionType = house.getTransactionType();
    	
    	brokerage = house.getBrokerage();
    	
    	address = house.getAddress();
    	
    }

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "independent_house_detail_id")
	private IndependentHouseDetail houseDetail;
	

}
