package com.capgemini.hibernateapp1.onetomany;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.capgemini.hibernateapp1.dto.Emp_Primary;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table
public class Employee_Address implements Serializable {
	@EmbeddedId
	private EmployeeAddressPk addresspk;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
    private String landmark;
	@Column
    private String city;
	@Column
    private int pincode;
	@Column
    private String flatno;
	@Exclude
	@MapsId("emp_id")
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Emp_Primary primary;
    
}
