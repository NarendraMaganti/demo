package com.capgemini.hibernateapp1.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.hibernateapp1.dto.Emp_Primary;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table
public class Employee_Project implements Serializable {
	@Id
	@Column
	private int pid;
	@Column
	private String proj_name;
	@Column
	private String technology;
	@Column
	private String location;
	@Column
	private String startdate;
	@Column
	private String endate;
	@Exclude
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="EmployeeProjectPk",joinColumns=@JoinColumn(name="pid"),
	inverseJoinColumns=@JoinColumn(name="emp_id"))
	private List<Emp_Primary> primary;


}
