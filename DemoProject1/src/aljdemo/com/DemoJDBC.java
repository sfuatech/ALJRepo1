package aljdemo.com;

import java.sql.*;

public class DemoJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aljfs","root","Alj@1234");
			
			Statement st =con.createStatement();
			ResultSet rs= st.executeQuery("SELECT *FROM emp;");
			/*
			while(rs.next())
			{
				System.out.println("Emp No="+rs.getInt()));
			}
			*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
