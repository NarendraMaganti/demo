package com.capgemini.hibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("test");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
//			String jpql="delete from Movie m where m.id=2";
			String jpql="delete from Movie m where m.id=:mid";
			Query query=manager.createQuery(jpql);
			query.setParameter("mid", 3);
			int result=query.executeUpdate();
			System.out.println("Deleted Successfully"+result);
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
