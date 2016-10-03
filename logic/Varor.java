package barre.logic;


import barre.db.DBConnector;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by baranrash on 2015-10-02.
*/

public class Varor implements Serializable{

    private static DBConnector db = new DBConnector();

    private int id;
    private String productName;
    private int quantity;
    private double price;

    public Varor(int id, String productName, int quantity, double price) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Varor{" +
               // "id=" + id +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity + '\'' +
                ", price=" + price +'\'' +
                '}';
    }

    public static ArrayList<Varor> getVaror(){

        return db.getVaror();
    }

}

