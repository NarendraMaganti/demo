package com.capgemini.hibernate.assignment;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernate.assignment.dto.Emp_primary_info;
import com.capgemini.hibernate.manytoone.Emp_address_info;
import com.capgemini.hibernate.manytoone.EmployeeAddressPk;
import com.capgemini.hibernate.onetoone.Emp_secondary_info;

public class TestManyToOne {
	public static void main(String[] args) {
		Emp_primary_info emp = new Emp_primary_info();
		emp.setEmp_id(108);
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
		EmployeeAddressPk addresspk = new EmployeeAddressPk();
		addresspk.setEmp_id(109);
		addresspk.setAddress_type("present");
		Emp_address_info emad = new Emp_address_info();
		emad.setAddresspk(addresspk);
		emad.setHouse_no(5172);
		emad.setAddress1("H M Street");
		emad.setAddress2("gooty fort");
		emad.setLandmark("irrigation section office");
		emad.setCity("gooty");
		emad.setPincode(515401);
		emad.setPrimary(emp);

		
		EntityManagerFactory factory =null;
		EntityManager manager =null;
		EntityTransaction transaction =null;
		try {
			factory = Persistence.createEntityManagerFactory("test1");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Emp_primary_info info = manager.find(Emp_primary_info.class, 108);
			System.out.println(info.getAddressInfo().get(0).getAddresspk().getAddress_type()); 
			//emad.setPrimary(info);
			//manager.persist(emad);
			System.out.println("row is inserted");
			//			Emp_primary_info records = manager.find(Emp_primary_info.class, 107);
			//			System.out.println(records.getSecondary().getEmail());
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
