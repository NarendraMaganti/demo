package com.capgemini.hibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			 factory=Persistence.createEntityManagerFactory("test");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
//			String jpql="update Movie m set m.name='kamal' where m.id=2";
			String jpql="update Movie m set m.name=:name where m.id=:id";
			Query query=manager.createQuery(jpql);
			query.setParameter("id", 1);
			query.setParameter("name", "Adusumalli");
			int result=query.executeUpdate();
			System.out.println("Updates Successfully"+result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		finally {
			manager.close();
			factory.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
