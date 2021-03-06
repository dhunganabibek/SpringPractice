package com.bibekdhungana.collectionconfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	private List<String> addresses;
	private Set<String> phoneNumbers;
	private Map<String,String> bonuses;
	
	
	
	
	public Person(List<String> addresses, Set<String> phoneNumbers, Map<String, String> bonuses) {
		super();
		this.addresses = addresses;
		this.phoneNumbers = phoneNumbers;
		this.bonuses = bonuses;
	}
	public Person() {
		super();
		
	}
	
	
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	
	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Map<String, String> getBonuses() {
		return bonuses;
	}
	public void setBonuses(Map<String, String> bonuses) {
		this.bonuses = bonuses;
	}
	@Override
	public String toString() {
		return "Person [addresses=" + addresses + ", phonenumbers=" + phoneNumbers + ", bonuses=" + bonuses + "]";
	}
	
	
	
	
	
	
	

}
