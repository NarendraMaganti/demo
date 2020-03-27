package com.capgemini.hibernate.assignment.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.hibernate.manytomany.Project_info;
import com.capgemini.hibernate.manytoone.Emp_address_info;
import com.capgemini.hibernate.onetoone.Emp_secondary_info;

import lombok.Data;

@Data
@Entity
@Table(name="emp_primary_info")
public class Emp_primary_info implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  //for auto generated values
	@Column
	private int emp_id;
	@Column
	private String emp_name;
	@Column
	private double salary;
	@Column(name="department_id")
	private int dept_id;
	@Column(name="joining_date")
	private Date date;
	@Column
	private long phone_number;
	@Column
	private String official_mail;
	@Column
	private String designation;
	@Column
	private Date date_of_birth;
	@Column
	private int manager_id;
	@Column
	private double experience;
	@OneToOne(cascade=CascadeType.ALL,mappedBy = "primary")
	private Emp_secondary_info secondary;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "primary")
	private  List<Emp_address_info> addressInfo;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "primary")
	private List<Project_info> projectInfo;

		

}
