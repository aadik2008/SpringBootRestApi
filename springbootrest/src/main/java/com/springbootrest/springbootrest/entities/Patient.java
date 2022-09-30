package com.springbootrest.springbootrest.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name = "patient")  
public class Patient {
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	//ContactNo C1;
	//Clinical C1;
	//Insurance I1;
	//Prescriber Dr1;
	//Prescription Pr1;

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Long id, String firstName, String lastName, String dob, String gender, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
	}
	
	
	
	
	
	

}
