package com.springbootrest.springbootrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int addId;
	
	@NotNull(message = "Please enter your address")
	//@Size(max = 50)
	public String line1;
	public String line2;
	
	@NotNull(message = "Please enter patient's city")
	public String city;
	
	@NotNull(message = "Please enter zip code")
	//@Size(max = 6)
	public int zipcode;
	
	@NotNull(message = "Please enter state code")
	//@Size(max = 3)
	public int statecode;
	
	public Address(String line1, String line2, String city, int zipcode, int statecode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.zipcode = zipcode;
		this.statecode = statecode;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", zipcode=" + zipcode
				+ ", statecode=" + statecode + "]";
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public int getStatecode() {
		return statecode;
	}
	public void setStatecode(int statecode) {
		this.statecode = statecode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	} 
}
