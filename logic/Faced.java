package barre.logic;

import java.util.ArrayList;

/**
 * Created by baranrash on 2015-10-04.
 */
public class Faced {



    public static ArrayList<Varor> getVaror(){

        return Varor.getVaror();
    }

    public static User checkLogin(String username, String password){
        return User.checkLogin(username, password);

    }

    public static ArrayList<User> getUsers(){

        return User.getUsers();
    }

}
