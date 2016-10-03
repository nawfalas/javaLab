package barre.logic;

import barre.db.DBConnector;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by baranrash on 2015-10-02.
 */
public class User implements Serializable{

    private static DBConnector db = new DBConnector();

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /*
    public String getId(){

    }
    */

    public void removeUser(String username, String password){

    }

    public static User checkLogin(String username, String password){

        try {
            return db.checkLogin(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    public static ArrayList<User> getUsers(){

        return db.getUsers();


    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}'+"\n";
    }

}
