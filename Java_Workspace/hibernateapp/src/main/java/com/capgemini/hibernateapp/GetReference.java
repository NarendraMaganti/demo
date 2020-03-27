package com.capgemini.hibernateapp;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp.dto.Movie;

public class GetReference {
	public static void main(String[] args) {
        
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		//Movie result = manager.find(Movie.class, 1);
		Movie result=manager.getReference(Movie.class, 1);
		System.out.println(result.getClass());
		System.out.println(result.getId());
		System.out.println(result.getName());
		System.out.println(result.getRating());
		manager.close();
		factory.close();
	}// End of the method

}
