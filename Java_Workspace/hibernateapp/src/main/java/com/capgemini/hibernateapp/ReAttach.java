package com.capgemini.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp.dto.Movie;

public class Reattach {
	public static void main(String[] args) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Movie record=manager.find(Movie.class, 1);
			System.out.println("before detached---"+manager.contains(record));
			manager.detach(record);
			System.out.println("before detached---"+manager.contains(record));
			Movie rs=manager.merge(record);
			rs.setName("Pavan");
			
			record.setName("Updated");
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
