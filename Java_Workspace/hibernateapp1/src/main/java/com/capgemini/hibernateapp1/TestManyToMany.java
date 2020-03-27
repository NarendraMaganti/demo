package com.capgemini.hibernateapp1;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp1.dto.Emp_Primary;
import com.capgemini.hibernateapp1.manytomany.Employee_Project;

public class TestManyToMany {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		Emp_Primary primary=new Emp_Primary();
		primary.setDepartment_id(101);
		primary.setEmp_id(4);
		primary.setDesignation("senior developer");
		primary.setDob("03-06-1997");
		primary.setEmp_name("hari");
		primary.setExperience(6);
		primary.setJoining_date("11-08-2020");
		primary.setManager_id(201);
		primary.setOfficial_mail("hari123@gmail.com");
		primary.setPhone_number("8585895658");
		primary.setSalary("45000");
		Emp_Primary primary1=new Emp_Primary();
		primary1.setDepartment_id(101);
		primary1.setEmp_id(6);
		primary1.setDesignation("senior developer");
		primary1.setDob("03-06-1997");
		primary1.setEmp_name("narpath");
		primary1.setExperience(6);
		primary1.setJoining_date("11-08-2020");
		primary1.setManager_id(201);
		primary1.setOfficial_mail("narpath123@gmail.com");
		primary1.setPhone_number("8585895658");
		primary1.setSalary("45000");
		ArrayList<Emp_Primary> arraylist=new ArrayList<Emp_Primary>();
		arraylist.add(primary);
		arraylist.add(primary1);
		Employee_Project project=new Employee_Project();
		project.setPid(16);
		project.setProj_name("ems");
		project.setLocation("USA");
		project.setStartdate("01-06-2020");
		project.setEndate("01-06-2021");
		project.setTechnology("Java");
		project.setPrimary(arraylist);
		Employee_Project project1=new Employee_Project();
		project1.setPid(12);
		project1.setProj_name("ems");
		project1.setLocation("Japan");
		project1.setStartdate("01-06-2020");
		project1.setEndate("01-06-2021");
		project1.setTechnology("JavaFullStack");
		project1.setPrimary(arraylist);
		try {
			factory = Persistence.createEntityManagerFactory("testdemo");
			manager = factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(project);
			manager.persist(project1);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			    manager.close();
				factory.close();
			}

		
		
		
		
		
		
	}

}
