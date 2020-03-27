package com.capgemini.hibernate.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.hibernate.assignment.dto.Emp_primary_info;

public class FindEmpPrimaryInfo {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test1");
		EntityManager manager = factory.createEntityManager();
		Emp_primary_info result = manager.find(Emp_primary_info.class, 101);
		System.out.println(result.getEmp_id());
		System.out.println(result.getEmp_name());
		System.out.println(result.getDept_id());
		System.out.println(result.getSalary());
		System.out.println(result.getDate());
		System.out.println(result.getPhone_number());
		System.out.println(result.getOfficial_mail());
		System.out.println(result.getDesignation());
		System.out.println(result.getDate_of_birth());
		System.out.println(result.getManager_id());
		System.out.println(result.getExperience());
		manager.close();
		factory.close();


		
		

	}

}
