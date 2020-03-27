package org.capgemini.jdbc.demo;
import java.sql.*;
import java.util.Scanner;
public class Test9 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sqry="select * from bangalore.student1";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(sqry);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				Double perc=rs.getDouble(3);
				System.out.println("Student details are "+"id is "+id+" "+
				"name is "+name+" "+"percentage is "+perc);
				System.out.println("=============================================");
			}
	
			System.out.println("execute successfully");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {

			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
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
