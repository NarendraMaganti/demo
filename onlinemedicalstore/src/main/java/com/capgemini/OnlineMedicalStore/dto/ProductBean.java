package com.capgemini.OnlineMedicalStore.dto;
import java.sql.Date;
import lombok.Data;
@Data
public class ProductBean {
	int itemCode;
	String categoryType;
	String itemName;
	double price;
	String manufacturingDate;
	String expiryDate;
	int stock;
	String supplierName;
}
