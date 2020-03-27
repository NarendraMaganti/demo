package com.capgemini.hibernate.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernate.assignment.dto.Emp_primary_info;


public class RemoveEmpPrimaryInfo {

	public static void main(String[] args) {
		
		Emp_primary_info emp = new Emp_primary_info();
		EntityManagerFactory factory =null;
		EntityManager manager =null;
		EntityTransaction transaction =null;
		try {
			factory = Persistence.createEntityManagerFactory("test1");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Emp_primary_info record = manager.find(Emp_primary_info.class, 105);
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
