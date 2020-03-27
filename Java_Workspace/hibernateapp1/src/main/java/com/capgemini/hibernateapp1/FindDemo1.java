package com.capgemini.hibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp1.dto.Demo;

public class FindDemo1 {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("testdemo");
	EntityManager manager = factory.createEntityManager();
	Demo demo=manager.find(Demo.class,1);
	System.out.println(demo.getDeptid());
	System.out.println(demo.getDesg());
	System.out.println(demo.getDob());
	System.out.println(demo.getEmailid());
	System.out.println(demo.getId());
	System.out.println(demo.getName());
	System.out.println(demo.getPhno());
	System.out.println(demo.getSal());
	manager.close();
	factory.close();
}
}
