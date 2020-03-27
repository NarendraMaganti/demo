package com.capgemini.hibernate.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlUpdateDynamic {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction =null;

		try {
		factory = Persistence.createEntityManagerFactory("test1");
		manager = factory.createEntityManager();
		transaction =manager.getTransaction();
		transaction.begin();		
		String jpql = "update Emp_primary_info e set e.emp_name='rajni' where e.emp_id=:id";
		Query query = manager.createQuery(jpql);
		query.setParameter("id", 101);
		int result = query.executeUpdate();
		System.out.println("no of count "+result);
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
