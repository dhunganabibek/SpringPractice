package com.bibekdhungana.reftype;

public class Address {
	private String streetName;
	private int zipcode;
	
	
	
	public Address() {
		super();
	}


	public Address(String streetName, int zipcode) {
		super();
		this.streetName = streetName;
		this.zipcode = zipcode;
	}
	

	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", zipcode=" + zipcode + "]";
	}
	
	
	
	
	
}
