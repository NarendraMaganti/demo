package com.capgemini.hibernate.assignment;

import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.capgemini.hibernate.assignment.dto.Emp_primary_info;
import com.capgemini.hibernate.onetoone.Emp_secondary_info;

public class TestOneToOne {

	public static void main(String[] args) {
		
		Emp_primary_info emp = new Emp_primary_info();
		emp.setEmp_id(107);
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
		Emp_secondary_info ems = new Emp_secondary_info();
		ems.setGender("male");
		ems.setEmail("rajshiv@gmail.com");
		ems.setJob_location("bangalore");
		ems.set_married(false);
		ems.setNationality("indian");
		ems.setGaurdian_name("sharukkhan");
		ems.setGaurdian_number(897878789);
		ems.setGovernment_id("6567677787878");
		ems.setBlood_group("a+");
		ems.setEmergency_contact_number(977899789);
		ems.set_physically_challenged(false);
		ems.setKnownlanguages("english,hindi");
		ems.setPrimary(emp);
		
		EntityManagerFactory factory =null;
		EntityManager manager =null;
		EntityTransaction transaction =null;
		try {
			factory = Persistence.createEntityManagerFactory("test1");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
//			manager.persist(ems);
//			System.out.println("row is inserted");
			Emp_primary_info records = manager.find(Emp_primary_info.class, 107);
			System.out.println(records.getSecondary().getEmail());
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
