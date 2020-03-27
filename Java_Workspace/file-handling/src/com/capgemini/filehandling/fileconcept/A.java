package com.capgemini.filehandling.fileconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		FileOutputStream fout=null;
		try {
			fout=new FileOutputStream("C:\\Users\\ADUSUMALLI SAIKUMAR\\Desktop\\Filehandling.txt");
			String str="Haiiii Helooooo";
			byte[]	b=str.getBytes();
			fout.write(b);
			System.out.println("File created successfully");
		} catch (IOException e) {
			System.out.println("File is not created ");
		}
		finally {
			if(fout!=null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

System.out.println(" Instead of writing finally block inorder to close costly resources directly we use try with resources");
 
try (FileOutputStream fout1=new FileOutputStream("C:\\Users\\ADUSUMALLI SAIKUMAR\\Desktop\\Filehandling.txt")){
	String str="Haiiii Helooooo";
	byte[]	b=str.getBytes();
	fout1.write(b);
	System.out.println("File created successfully");
} catch (IOException e) {
	System.out.println("File is not created ");
}



	}


}
