/**
 *@author Kamil
 * Created: Apr 9, 2016 
 * Passanger.java
 */
package com.webshop.models;

import java.util.Date;


public class User {
	
	private String firstName;
	private String lastName;
	private Date dob;
	private Gender gender;
	
	private int idNumber;
	private Adress address;
	private String email;
	private String password;
	
	public User(){
		address = new Adress();
	}
	
	public int getUserId(){
		return idNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void setAddress(String streetName, String city, String country, int postCode){
		address.setStreetName(streetName);
		address.setCity(city);
		address.setCountry(country);
		address.setPostCode(postCode);
	}
	public void setAddress(String streetName, String city, String country){
		address.setStreetName(streetName);
		address.setCity(city);
		address.setCountry(country);
	}
	public void setPostCode(int postCode){
		address.setPostCode(postCode);
	}
	public String getStreetName(){
		return address.getStreetName();
	}
	public String getCity(){
		return address.getCity();
	}
	public String getCountry(){
		return address.getCountry();
	}
	public int getPostCode(){
		return address.getPostCode();
	}
	
	public boolean setEmail(String email){
		this.email = email;
		if(email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]")){
			return true;
		}else{
			return false;
		}
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setPassword(String password){
		this.password = password;
	}

	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender
				+ "]";
	}	
	
}
