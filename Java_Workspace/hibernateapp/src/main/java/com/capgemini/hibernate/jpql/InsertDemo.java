package com.capgemini.hibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertDemo {
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
			String jpql="insert into Movie m values(m.id=:id,m.name=:nm,m.rating=:r)";
			Query query=manager.createQuery(jpql);
			query.setParameter("id", 2);
			query.setParameter("nm", "phanindra");
			query.setParameter("r", "five star");
			int result=query.executeUpdate();
			System.out.println("Inserted Successfully"+result);
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
