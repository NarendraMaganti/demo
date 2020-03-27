package com.capgemini.my_properties.jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class FirstPropertyFile {

	public static void main(String[] args) {
		
	try {
		FileOutputStream stream = new FileOutputStream("first.properties");
		Properties pro = new Properties();
		pro.setProperty("name", "narendra");
		pro.setProperty("mobileno", "7207458824");
		pro.store(stream, "newfile");
		System.out.println("done");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	}

}
