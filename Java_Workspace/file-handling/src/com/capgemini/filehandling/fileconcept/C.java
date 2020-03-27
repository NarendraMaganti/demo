package com.capgemini.filehandling.fileconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("C:\\Jspider btm  programs\\Maintcs.java");
			int i=fin.read();
			while(i!=-1) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
