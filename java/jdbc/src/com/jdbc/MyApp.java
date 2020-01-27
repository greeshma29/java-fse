package com.jdbc;
import java.sql.*;
import java.util.Scanner;
public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. Load driver in memory
			Class.forName("com.mysql.jdbc.Driver");

			// 2. Set up a connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");

			// 3. Create a statement
			Statement stmt = conn.createStatement();

			 //insert a record
	        /* String  query = "insert into employee set id='3 ', name='aishu', mail='aishu@mail.com' ";*/
			/*String query="update employee set id='4', name='kavya'  where id='1'";*/
	        Scanner sc=new Scanner(System.in);
	         System.out.println("enter the id to insert");
	        int id=sc.nextInt();
	        System.out.println("enter the name to insert");
	        String name=sc.nextLine();
	        System.out.println("enter the mail to insert");
	        String mail=sc.nextLine();
	        String query= "insert into employee set id= '"+id+"', name = ' "+name+"  ' , mail = ' " + mail + "' ";
			int x = stmt.executeUpdate(query);
		      System.out.println("Rows Added : " + x);

   
			ResultSet rs =  stmt.executeQuery("select * from employee");

		while(rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("mail"));
			}

			rs.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		     
	}
 

	}

