package com.capgemini.hibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp1.dto.Demo;

public class InsertDemo1 {
	public static void main(String[] args) {
	/*	Demo demo=new Demo();
		demo.setDeptid(101);
		demo.setDesg("software engineer");
		demo.setDob("01/06/1997");
		demo.setEmailid("adusumalli555@gmail.com");
		demo.setExp(4);
		demo.setId(1);
		demo.setJoindate("01-jan-2020");
		demo.setMgrid(201);
		demo.setName("Saikumar");
		demo.setPhno("9642997747");
		demo.setSal("20000");*/
		Demo demo1=new Demo();
		demo1.setDeptid(102);
		demo1.setDesg("HR");
		demo1.setDob("01/10/1990");
		demo1.setEmailid("abcxyz@gmail.com");
		demo1.setExp(8);
		demo1.setId(2);
		demo1.setJoindate("05-10-2018");
		demo1.setMgrid(202);
		demo1.setName("Phani");
		demo1.setPhno("8142187577");
		demo1.setSal("50000");
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
			factory=Persistence.createEntityManagerFactory("testdemo");
			manager=factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			//manager.persist(demo);
			manager.persist(demo1);
			System.out.println("Data inserted Successfully");
			transaction.commit();
			manager.close();
			factory.close();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
