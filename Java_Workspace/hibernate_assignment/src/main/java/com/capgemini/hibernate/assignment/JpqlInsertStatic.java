package com.capgemini.hibernate.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlInsertStatic {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction =null;

		try {
		factory = Persistence.createEntityManagerFactory("test1");
		manager = factory.createEntityManager();
		transaction =manager.getTransaction();
		transaction.begin();		
		String jpql = "insert into emp_primary_info "
				+ " (emp_id,emp_name,salary,department_id,joining_date,phone_number,official_mail,designation,date_of_birth,manager_id,experience)"
				+ " values(105,'sanjana',38000,30,'2017-02-17',796677788,'sanjanar@gmail.com','data_analyst','1995-12-24',201,2) ";
		Query query = manager.createNativeQuery(jpql);
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
