package com.capgemini.OnlineMedicalStore.dto;

import lombok.Data;
@Data
public class UserBean {
	
	private int id;
	private String userType;
	private String name;
	private String password;
	private long mobileNumber;
	private String email;
	private String address;

}
