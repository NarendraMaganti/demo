package com.capgemini.hibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp1.dto.Demo;
import com.capgemini.hibernateapp1.dto.Emp_Primary;
import com.capgemini.hibernateapp1.onetoone.Emp_Secondary;

public class TestOneToOne {
	public static void main(String[] args) {
		Emp_Secondary emp = new Emp_Secondary();
		Emp_Primary primary = new Emp_Primary();
		primary.setDepartment_id(104);
		primary.setEmp_id(5);
		primary.setDesignation("Junior developer");
		primary.setDob("01/06/1997");
		primary.setEmp_name("gopi");
		primary.setExperience(5);
		primary.setJoining_date("10/5/2020");
		primary.setManager_id(204);
		primary.setOfficial_mail("gopitutha123@gmail.com");
		primary.setPhone_number("9642859585");
		primary.setSalary("35000");
		emp.setBlood_group("B Positive");
		emp.setEmergency_contact_no("8969585964");
		emp.setGender("male");
		emp.setGovt_id("719595118352");
		emp.setGuardian_name("arunkumar");
		emp.setIs_married("no");
		emp.setIs_phsically_challanged("no");
		emp.setJob_location("bangalore");
		emp.setKnown_languages("Telugu,English");
		emp.setNationality("indian");
		emp.setPersonal_mail("abcxyz@gmail.com");
		emp.setPrimary(primary);
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("testdemo");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
		//	manager.persist(emp);
			Emp_Primary primaryinfo=manager.find(Emp_Primary.class,5);
			System.out.println(primaryinfo.getEmp().getGovt_id());
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
