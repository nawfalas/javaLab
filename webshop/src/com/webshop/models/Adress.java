package com.webshop.models;

public class Adress {
	private String streetName;
	private String city;
	private String country;
	private int postCode;
	
	public Adress(String streetName, String city, String country, int postCode){
		this.streetName=streetName;
		this.city = city;
		this.country = country;
		this.postCode = postCode;
	}
	public Adress(){
		this.streetName="";
		this.city="";
		this.country="";
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	
}
