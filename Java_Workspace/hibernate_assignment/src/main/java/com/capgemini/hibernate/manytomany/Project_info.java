package com.capgemini.hibernate.manytomany;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.hibernate.assignment.dto.Emp_primary_info;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Data
@Entity
@Table(name="project_info")
public class Project_info implements Serializable {
	@Id
	@Column
	private  int project_id;
	@Column
	private String project_name;
	@Column
	private String technology;
	@Column
	private String location;
	@Column
	private Date start_date;
	@Column
	private Date end_date;
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="project_employee",joinColumns = @JoinColumn(name="project_id"),
	inverseJoinColumns = @JoinColumn(name="emp_id"))
	private List<Emp_primary_info> primary;
	

}
