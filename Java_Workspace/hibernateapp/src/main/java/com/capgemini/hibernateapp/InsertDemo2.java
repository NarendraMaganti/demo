package com.capgemini.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp.dto.Movie;

public class InsertDemo2 {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setId(4);
		movie.setName("D");
		movie.setRating("five star");
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("test");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(movie);
			System.out.println("Record is inserted");
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
