package com.capgemini.hibernateapp1.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="emp_primary_info")
public class Demo implements Serializable {
	@Id
	@Column(name="emp_id")
	private int emp_id;
	@Column(name="emp_name")
	private String name;
	@Column(name="salary")
	 private String sal;
	@Column(name="department_id")
	private int deptid;
	@Column(name="joining_date")
	private String joindate;
	@Column(name="phone_number")
	private String phno;
	@Column(name="official_mail")
	private String emailid;
	@Column(name="designation")
	private String desg;
	@Column(name="dob")
	private String dob;
	@Column(name="manager_id")
	private int mgrid;
	@Column(name="experience")
	private double exp;
	public int getId() {
		return emp_id;
	}
	public void setId(int id) {
		this.emp_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getMgrid() {
		return mgrid;
	}
	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	
	
	
	
	

}
