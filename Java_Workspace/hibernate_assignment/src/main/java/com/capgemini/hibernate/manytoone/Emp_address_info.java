package com.capgemini.hibernate.manytoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.capgemini.hibernate.assignment.dto.Emp_primary_info;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Data
@Entity
@Table(name="emp_address_info")
public class Emp_address_info implements Serializable {
	@EmbeddedId
	private EmployeeAddressPk addresspk;
	@Column
	private int house_no;
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
	@Exclude
	@MapsId("emp_id")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Emp_primary_info primary;

}
