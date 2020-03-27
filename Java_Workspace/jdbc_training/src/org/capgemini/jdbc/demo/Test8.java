package org.capgemini.jdbc.demo;
import java.sql.*;
import java.util.Scanner;
public class Test8 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String upqry="update  bangalore.student1 set sname='kamal shaik' where sid=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id present in a table");
		int id=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(upqry);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			System.out.println("execute successfully");
		} catch (SQLException | ClassNotFoundException e) {
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
