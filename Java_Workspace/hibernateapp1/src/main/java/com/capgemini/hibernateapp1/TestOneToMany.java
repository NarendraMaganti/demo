package com.capgemini.hibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernateapp1.dto.Emp_Primary;
import com.capgemini.hibernateapp1.onetomany.EmployeeAddressPk;
import com.capgemini.hibernateapp1.onetomany.Employee_Address;

public class TestOneToMany {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager manager=null;
		EntityTransaction transaction=null;
		Emp_Primary primary=new Emp_Primary();
		primary.setDepartment_id(101);
		primary.setEmp_id(1);
		primary.setDesignation("senior developer");
		primary.setDob("03-06-1997");
		primary.setEmp_name("pavan");
		primary.setExperience(6);
		primary.setJoining_date("11-08-2020");
		primary.setManager_id(201);
		primary.setOfficial_mail("pavaan123@gmail.com");
		primary.setPhone_number("8585895658");
		primary.setSalary("45000");
		EmployeeAddressPk addresspk=new EmployeeAddressPk();
		//addresspk.setAddress_type("present");
		addresspk.setAddress_type("permanent");
		addresspk.setEmp_id(1);
		Employee_Address address=new Employee_Address();
		address.setAddresspk(addresspk);
		address.setAddress1("jp nagara");
		address.setAddress2("13th phase");
		address.setFlatno("1-10");
		address.setCity("Bangalore");
		address.setLandmark("near tvs showroom");
		address.setPincode(522212);
		address.setPrimary(primary);
		
		try {
			factory = Persistence.createEntityManagerFactory("testdemo");
			manager = factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			Emp_Primary info=manager.find(Emp_Primary.class, 1);
			//address.setPrimary(info);
			//manager.persist(address);
			System.out.println(info.getAddress().get(0).getAddresspk().getAddress_type());
			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			    manager.close();
				factory.close();
			}
		
		
		
		
		
		
		
	}

}
