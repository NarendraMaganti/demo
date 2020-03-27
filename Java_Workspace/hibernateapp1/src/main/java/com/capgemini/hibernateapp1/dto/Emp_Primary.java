package com.capgemini.hibernateapp1.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.hibernateapp1.manytomany.Employee_Project;
import com.capgemini.hibernateapp1.onetomany.Employee_Address;
import com.capgemini.hibernateapp1.onetoone.Emp_Secondary;

import lombok.Data;
@Data
@Entity
@Table(name="emp_primary_info")
public class Emp_Primary implements Serializable {
	@Id
	@Column
	private int emp_id;
	@Column
	private String emp_name;
	@Column
	 private String salary;
	@Column
	private int department_id;
	@Column
	private String joining_date;
	@Column
	private String phone_number;
	@Column
	private String official_mail;
	@Column
	private String designation;
	@Column
	private String dob;
	@Column
	private int manager_id;
	@Column
	private double experience;
	@OneToOne(cascade=CascadeType.ALL,mappedBy="primary")
	private Emp_Secondary emp;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="primary")
	private List<Employee_Address> address;
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="primary")
	private List<Employee_Project> project;

	
}
