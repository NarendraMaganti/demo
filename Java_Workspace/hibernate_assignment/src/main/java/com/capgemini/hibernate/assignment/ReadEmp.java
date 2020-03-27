package com.capgemini.hibernate.assignment;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capgemini.hibernate.assignment.dto.Emp_primary_info;

public class ReadEmp {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test1");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from Emp_primary_info e where e.emp_id=no";
		//Query query = manager.createQuery(jpql);
		TypedQuery<Emp_primary_info> query = manager.createQuery(jpql, Emp_primary_info.class);
		
		Emp_primary_info record = query.getSingleResult();
		//		for(Emp_primary_info empl : record) {
		//			System.out.println("employee Name : "+empl);
		//			
		//		} 

		System.out.println("employee Names : "+record.getEmp_name());


	}

}
