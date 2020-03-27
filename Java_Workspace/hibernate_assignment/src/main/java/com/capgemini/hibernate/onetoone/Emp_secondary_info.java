package com.capgemini.hibernate.onetoone;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.capgemini.hibernate.assignment.dto.Emp_primary_info;

import lombok.Data;
@Data
@Entity
@Table(name="emp_secondary_info")
public class Emp_secondary_info implements Serializable {
	@Id
	private int emp_id;
	@Column
	private String gender;
	@Column(name="personal_email")
	private String email;
	@Column
	private String job_location;
	@Column
	private boolean is_married;
	@Column(name="Nationality")
	private String nationality;
	@Column
	private String gaurdian_name;
	@Column
	private long gaurdian_number;
	@Column
	private String government_id;
	@Column
	private String blood_group;
	@Column
	private long emergency_contact_number;
	@Column
	private boolean is_physically_challenged;
	@Column(name="known_languages")
	private String knownlanguages;
	
	@MapsId
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Emp_primary_info primary;
}
