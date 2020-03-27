package com.capgemini.hibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp1.dto.Demo;

public class UpdateDemo1 {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("testdemo");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	transaction.begin();
	Demo demo=manager.find(Demo.class,1);
	demo.setName("Updated SaiKumar");
	transaction.commit();
	System.out.println("Successfully updated");
	manager.close();
	factory.close();
	
}
}
