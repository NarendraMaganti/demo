package com.capgemini.hibernateapp1.onetomany;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class EmployeeAddressPk implements Serializable {
	private int emp_id;
	private String address_type;

}
