package com.capgemini.hibernate.assignment;

import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.capgemini.hibernate.assignment.dto.Emp_primary_info;

public class InsertPrimaryInfo {

	public static void main(String[] args) {

		Emp_primary_info emp = new Emp_primary_info();
		emp.setEmp_id(106);
		emp.setEmp_name("rajath");
		emp.setSalary(50000);
		emp.setDate(Date.valueOf("2019-07-28"));
		emp.setDept_id(20);
		emp.setPhone_number(778667567);
		emp.setOfficial_mail("rajathsv@gmail.com");
		emp.setDesignation("software_developer");
		emp.setDate_of_birth(Date.valueOf("1998-12-26"));
		emp.setManager_id(204);		
		emp.setExperience(3);
		EntityManagerFactory factory =null;
		EntityManager manager =null;
		EntityTransaction transaction =null;
		try {
			factory = Persistence.createEntityManagerFactory("test1");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(emp);
			System.out.println("row is inserted");
			transaction.commit();			
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
			factory.close();
		}


	}

}
