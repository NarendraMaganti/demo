package org.capgemini.jdbc.demo;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
public class Test6 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id");
		int i=sc.nextInt();
		System.out.println("enter student name");
		String name=sc.next();
		System.out.println("enter student percentage");
		Double p=sc.nextDouble();
		String inqry="insert into bangalore.student1 values(?,?,?)";

		FileInputStream f=null;
		Properties p1=null;
	
			
		try {
			f = new FileInputStream("db.properties");
			 p1=new Properties();
			p1.load(f);
		
			Class.forName(p1.getProperty("driver"));
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(inqry);
			pstmt.setInt(1,i);
			pstmt.setString(2,name);
			pstmt.setDouble(3,p);
			pstmt.executeUpdate();
			System.out.println("execute successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
