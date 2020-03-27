package com.capgemini.hibernateapp1.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.hibernateapp1.dto.Demo;
import com.capgemini.hibernateapp1.dto.Emp_Primary;

import lombok.ToString.Exclude;
@Entity
@Table(name="emp_secondary_info")
public class Emp_Secondary implements Serializable {
	@Id
	//@Column
    private int emp_id;
	@Column
	private String gender;
	@Column
	private String personal_mail;
	@Column
	private String job_location;
	@Column
	private String is_married;
	@Column
	private String nationality;
	@Column
	private String guardian_name;
	@Column
	private String guardian_number;
	@Column
	private String govt_id;
	@Column
	private String blood_group;
	@Column
	private String emergency_contact_no;
	@Column
	private String is_phsically_challanged;
	@Column
	private String known_languages;
	@MapsId
    @OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Emp_Primary primary;
	
	public Emp_Primary getPrimary() {
		return primary;
	}
	public void setPrimary(Emp_Primary primary) {
		this.primary = primary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPersonal_mail() {
		return personal_mail;
	}
	public void setPersonal_mail(String personal_mail) {
		this.personal_mail = personal_mail;
	}
	public String getIs_married() {
		return is_married;
	}
	public void setIs_married(String is_married) {
		this.is_married = is_married;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGuardian_name() {
		return guardian_name;
	}
	public void setGuardian_name(String guardian_name) {
		this.guardian_name = guardian_name;
	}
	public String getGuardian_number() {
		return guardian_number;
	}
	public void setGuardian_number(String guardian_number) {
		this.guardian_number = guardian_number;
	}
	public String getGovt_id() {
		return govt_id;
	}
	public void setGovt_id(String govt_id) {
		this.govt_id = govt_id;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getEmergency_contact_no() {
		return emergency_contact_no;
	}
	public void setEmergency_contact_no(String emergency_contact_no) {
		this.emergency_contact_no = emergency_contact_no;
	}
	public String getIs_phsically_challanged() {
		return is_phsically_challanged;
	}
	public void setIs_phsically_challanged(String is_phsically_challanged) {
		this.is_phsically_challanged = is_phsically_challanged;
	}
	public String getKnown_languages() {
		return known_languages;
	}
	public void setKnown_languages(String known_languages) {
		this.known_languages = known_languages;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	
	
	
	
		
		
		
		
		
		
	
}
