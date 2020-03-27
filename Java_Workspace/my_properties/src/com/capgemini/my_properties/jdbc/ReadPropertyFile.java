package com.capgemini.my_properties.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) {
		
		try {
			FileInputStream input = new FileInputStream("db.properties");
			Properties pro = new Properties();
			pro.load(input);
			System.out.println(pro.getProperty("user"));
			System.out.println(pro.getProperty("password"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
