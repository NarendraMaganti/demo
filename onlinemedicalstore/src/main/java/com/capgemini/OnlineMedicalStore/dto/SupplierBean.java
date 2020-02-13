package com.capgemini.OnlineMedicalStore.dto;

import lombok.Data;

@Data
public class SupplierBean {

	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	private long supplierPhoneNo;
	private String supplierEmailId;
}
