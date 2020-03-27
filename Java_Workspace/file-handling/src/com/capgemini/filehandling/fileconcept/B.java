package com.capgemini.filehandling.fileconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class B {
	
	public static void main(String[] args) {
		
		
		try(FileInputStream fi=new FileInputStream("C:\\Users\\ADUSUMALLI SAIKUMAR\\Desktop\\Filehandling.txt")) {
			int i=0;
			while((i=fi.read() )!= -1) {
				
				System.out.print((char)i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
