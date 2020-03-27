package com.capgemini.hibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.capgemini.hibernateapp.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager manager = factory.createEntityManager();
		String jpql = "select m from Movie m";
		Query query = manager.createQuery(jpql);
		List<Movie> record = query.getResultList();
		for(Movie movie :record) {
			System.out.println("Movie Id :"+movie.getId());
			System.out.println("Movie Name : "+movie.getMname());
			System.out.println("Movie Rating : "+movie.getRating());
			System.out.println("==================================");
		}
		
	}

}
