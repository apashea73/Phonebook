package com.claim;
public class Person {

	//instance variables
	private String firstName;
	private String lastName;
	private String middleName;
	private long telephone;
	private String street;
	private String city;
	private String state;
	private int zip;
	private String [] phoneBookEntry;
	
	
	//class variables
	private int count;
		
	//constructors
	public Person(String firstName, String middleName, String lastName, long telephone, String street, String city, String state, int zip) { //add a parameterized constructor.
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.telephone = telephone;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	}	
	public Person(){}
	
	
	
	//get set
	public String getFirstName(){
		return this.firstName;		
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getMiddleName(){
		return this.middleName = middleName;
	}
	public void setMiddleName(String middlename){
		this.middleName = middlename;
	}
	public long getTelephone(){
		return this.telephone;
	}
	public void setTelephone(long telephone){
		this.telephone = telephone;	
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}	
	
}



