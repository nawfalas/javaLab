package com.webshop.models;

import java.sql.*;
import java.util.ArrayList;

public class DbConnector {

	private Connection con;
	private Statement myStnt;

	public DbConnector() {
		// try{
		// //1. Get a connection to database
		// con =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop",
		// "guest", "klopklop10");
		// //2. Create a statement
		// myStnt = con.createStatement();
		//
		// //3. Execute SQL Query
		// ResultSet myRs = myStnt.executeQuery("select * from guest_list");
		// //4. Process the result
		// while(myRs.next()){
		// System.out.println(myRs.getString("guest_id")+ ", "+
		// myRs.getString("guest_name")+", "
		// + myRs.getString("guest_address"));
		// }
		// }catch(Exception e){
		// e.printStackTrace();
		// }
	}

	public ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 1. Get a connection to database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop", "guest", "klopklop10");
			// 2. Create a statement
			myStnt = con.createStatement();
			// 3. Execute SQL Query
			ResultSet myRs = myStnt.executeQuery("select * from user");
			// 4. Process the result
			while (myRs.next()) {
				int id = myRs.getInt("id");
				String firstName = myRs.getString("firstname");
				String lastName = myRs.getString("lastname");
				String email = myRs.getString("email");
				String address = myRs.getString("address");
				String city = myRs.getString("city");
				int postCode = myRs.getInt("postcode");
				String country = myRs.getString("country");
				int birthdate = myRs.getInt("birthdate");
				String password = myRs.getString("password");

				users.add(new User(firstName, lastName, id, address, city, postCode, country, password, email));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null){
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("failed to close connection");
			}
		}
		return users;
	}

}
