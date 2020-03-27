package com.capgemini.hibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp.dto.Movie;

public class InsertDemo {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setId(4);
		movie.setName("D");
		movie.setRating("five star");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(movie);
		System.out.println("Record is inserted");
		transaction.commit();
		manager.close();
		factory.close();

	}

}
