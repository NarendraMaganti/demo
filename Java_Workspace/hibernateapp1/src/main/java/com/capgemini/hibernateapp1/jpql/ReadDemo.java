package com.capgemini.hibernateapp1.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capgemini.hibernateapp1.dto.Demo;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("testdemo");
		EntityManager manager=factory.createEntityManager();
	/*	String jpql="select d from Demo d";
		Query query=manager.createQuery(jpql);
		List<Demo> list=query.getResultList();
		for (Demo demo : list) {
		System.out.println(demo.getName());
		}*/
		String jpql="select d from Demo d where d.id=1";
		TypedQuery<Demo> query=manager.createQuery(jpql,Demo.class);
		Demo demo=query.getSingleResult();
		System.out.println(demo.getDeptid());
		System.out.println(demo.getName());
		
		
		
		
		
		
		
	}

}
