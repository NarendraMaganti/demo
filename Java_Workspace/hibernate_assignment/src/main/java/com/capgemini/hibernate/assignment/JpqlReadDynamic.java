package com.capgemini.hibernate.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.capgemini.hibernate.assignment.dto.Emp_primary_info;

public class JpqlReadDynamic {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test1");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from Emp_primary_info e where e.emp_id=:no";
		TypedQuery<Emp_primary_info> query = manager.createQuery(jpql, Emp_primary_info.class);
		query.setParameter("no", 104);
		Emp_primary_info record = query.getSingleResult();

		System.out.println("employee Name : "+record.getEmp_name());


	}

}
