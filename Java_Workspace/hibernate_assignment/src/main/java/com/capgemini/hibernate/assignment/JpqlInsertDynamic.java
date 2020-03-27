package com.capgemini.hibernate.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlInsertDynamic {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction =null;

		try {
		factory = Persistence.createEntityManagerFactory("test1");
		manager = factory.createEntityManager();
		transaction =manager.getTransaction();
		transaction.begin();		
		String jpql = "insert into Emp_primary_info "
				+ " (emp_id,emp_name,salary,department_id,joining_date,phone_number,official_mail,designation,date_of_birth,manager_id,experience) "
				+ " values(:empid,:empname,:salary,:dept_id,:joindate,:phno,:offmail,:desgn,:dob,:mgrid,:expr) ";
		Query query = manager.createNativeQuery(jpql);
		query.setParameter("empid", "103");
		query.setParameter("empname", "sai_nalini");
		query.setParameter("salary", "45000");
		query.setParameter("dept_id", "30");
		query.setParameter("joindate", "2016-09-26");
		query.setParameter("phno", "78998909");
		query.setParameter("offmail", "sainalini@gmail.com");
		query.setParameter("desgn", "softwareTester");
		query.setParameter("dob", "1996-05-29");
		query.setParameter("mgrid", "201");
		query.setParameter("expr", "3.2");
		int result = query.executeUpdate();
		System.out.println("no of rows affected "+result);
		transaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			factory.close();
			manager.close();
		}


	}

}
