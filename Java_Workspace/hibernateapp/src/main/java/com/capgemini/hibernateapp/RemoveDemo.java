package com.capgemini.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp.dto.Movie;

public class RemoveDemo {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		EntityManagerFactory factory =null;
		EntityManager manager =null;
		EntityTransaction transaction =null;
		try {
		factory = Persistence.createEntityManagerFactory("test");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		Movie record = manager.find(Movie.class, 650);
		manager.remove(record);
		System.out.println("record deleted");
		transaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
		manager.close();
		factory.close();
		}


	}

}
