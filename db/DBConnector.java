package barre.db;


import barre.logic.User;
import barre.logic.Varor;

import java.sql.*;
import java.util.ArrayList;

public class DBConnector {


    private Connection con;
    private Statement statement;

    private String info;
    private Object data;

    public DBConnector(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con= DriverManager.getConnection("jdbc:mysql://localhost:3307/webshopdb","root","");
			statement= con.createStatement();
		}catch(Exception e){
			System.out.println("exception" + e );
		}
	}

    // Lägg en user till i databasen
	public ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<User>();
		try{
			String guery= "Select * from user";
            ResultSet rs;

			rs= statement.executeQuery(guery);
			System.out.println("From Database:");
			while(rs.next()){
				String id= rs.getString("id");
				String username=rs.getString("username");
				String password= rs.getString("password");

                // Skapar en user objekt och lägger till den i arraylisten
                users.add(new User(username, password));


			}

		}catch(Exception e){
			System.out.println("Exception vid getData");
		}
		return users;

    }

    public User checkLogin(String username, String password) throws SQLException {

        User u = null;

        try {
            String guery= "select * from user where username=? and password=?";

            PreparedStatement preparedStatement = con.prepareStatement(guery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs;
            rs = preparedStatement.executeQuery();

        while(rs.next()){
            String id= rs.getString("id");
            String name=rs.getString("username");
            String pass= rs.getString("password");

            u = new User(name, pass);

        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }


    //
    public ArrayList<Varor> getVaror(){
        ArrayList<Varor> varor = new ArrayList<Varor>();
        try{
            String guery= "Select * from varor";

            ResultSet rs;
            rs= statement.executeQuery(guery);
            System.out.println("From Database:");
            while(rs.next()){
                int id= Integer.parseInt(rs.getString("id"));
                String productName=rs.getString("productName");
                int quantity= Integer.parseInt(rs.getString("quantity"));
                Double price = Double.valueOf(rs.getString("price"));


                // Skapar en user objekt och lägger till den i arraylisten
                varor.add(new Varor(id, productName, quantity, price));


            }

        }catch(Exception e){
            System.out.println("Exception vid getData");
        }
        return varor;

    }


}


