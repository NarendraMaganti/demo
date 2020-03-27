package com.capgemini.hibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capgemini.hibernateapp.dto.Movie;

public class ReadDemo {
	public static void main(String[] args) {
		
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	EntityManager manager=factory.createEntityManager();
	/*String jpql="select mv from Movie mv";
	Query query=manager.createQuery(jpql);
	List<Movie> list=query.getResultList();
	for (Movie movie : list) {
		System.out.println("Movie ID: " +movie.getId());
		System.out.println("Movie NAME: " +movie.getName());
		System.out.println("Movie RATING: " +movie.getRating());
		System.out.println("--------------");
	}
	*/
	//Dynamic query
	  String jpql="select mv from Movie mv where mv.id=:mid";
	  TypedQuery<Movie> result= manager.createQuery(jpql, Movie.class);
	  result.setParameter("mid", 3);
	  Movie movie=result.getSingleResult();
	  System.out.println(movie.getName());
	  System.out.println(movie.getId());
	  System.out.println(movie.getRating());
		
		
		
		
	}

}
