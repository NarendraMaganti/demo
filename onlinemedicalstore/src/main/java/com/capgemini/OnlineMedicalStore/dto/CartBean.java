package com.capgemini.OnlineMedicalStore.dto;


import lombok.Data;
@Data
public class CartBean {
	
	private int id;
	private int itemCode;
	private String itemName;
	private String categoryType;
	private int quantity;
	private double orderPrice;

}
