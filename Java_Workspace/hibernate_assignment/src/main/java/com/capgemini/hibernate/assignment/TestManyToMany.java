package com.capgemini.hibernate.assignment;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernate.assignment.dto.Emp_primary_info;
import com.capgemini.hibernate.manytomany.Project_info;
import com.capgemini.hibernate.manytoone.Emp_address_info;
import com.capgemini.hibernate.manytoone.EmployeeAddressPk;

public class TestManyToMany {
	
	public static void main(String[] args) {
		
		Emp_primary_info emp = new Emp_primary_info();
		Emp_primary_info emp1 = new Emp_primary_info();
		Project_info pro = new Project_info();
		Project_info pro1 = new Project_info();
		ArrayList<Project_info> arraylist = new ArrayList<Project_info>();
		arraylist.add(pro);
		arraylist.add(pro1);

		emp.setEmp_id(109);
		emp.setEmp_name("seetha");
		emp.setSalary(67000);
		emp.setDate(Date.valueOf("2016-04-08"));
		emp.setDept_id(30);
		emp.setPhone_number(975867567);
		emp.setOfficial_mail("seethamahv@gmail.com");
		emp.setDesignation("software_tester");
		emp.setDate_of_birth(Date.valueOf("1998-12-26"));
		emp.setManager_id(201);		
		emp.setExperience(4);
		
		
		
		emp1.setEmp_id(111);
		emp1.setEmp_name("ramana");
		emp1.setSalary(24000);
		emp1.setDate(Date.valueOf("2018-04-08"));
		emp1.setDept_id(40);
		emp1.setPhone_number(889009767);
		emp1.setOfficial_mail("geethamma@gmail.com");
		emp1.setDesignation("data_analyst");
		emp1.setDate_of_birth(Date.valueOf("1997-01-06"));
		emp1.setManager_id(202);		
		emp1.setExperience(2);
		emp1.setProjectInfo(arraylist);
		
		
		pro.setProject_id(30);
		pro.setProject_name("one2many");
		pro.setStart_date(java.sql.Date.valueOf("2009-02-13"));
		pro.setStart_date(java.sql.Date.valueOf("2023-07-19"));
		pro.setTechnology("jpql");
		pro.setLocation("Uk");
	
		
		
		pro1.setProject_id(40);
		pro1.setProject_name("one2one");
		pro1.setStart_date(java.sql.Date.valueOf("2015-02-13"));
		pro1.setStart_date(java.sql.Date.valueOf("2022-07-19"));
		pro1.setTechnology("jpql");
		pro1.setLocation("Uk");
		
		

		

		EntityManagerFactory factory =null;
		EntityManager manager =null;
		EntityTransaction transaction =null;
		try {
			factory = Persistence.createEntityManagerFactory("test1");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
//			Emp_primary_info info = manager.find(Emp_primary_info.class, 108);
//			System.out.println(info.getAddressInfo().get(0).getAddresspk().getAddress_type()); 
			//emad.setPrimary(info);
			manager.persist(pro);
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
