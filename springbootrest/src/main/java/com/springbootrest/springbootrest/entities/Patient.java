package com.springbootrest.springbootrest.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

//import com.fasterxml.jackson.annotation.JsonFormat;

//import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name = "patient")  
public class Patient {
	@Id
	private Long id;
	
	@NotNull(message = "Your first name is missing")
	private String firstName;
	
	@NotNull(message = "Your last name is missing")
	private String lastName;
	
	//@JsonFormat(pattern = "yyyy-MM-dd")
	private String dob;
	
	@NotNull(message = "Your gender is missing")
	private String gender;
	
	@NotNull(message = "Please enter your contact number")
	private Long ContactNo;
	
	@OneToOne(cascade = CascadeType.ALL)//using cascade just for foreign key
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Clinical clinical;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Insurance insurance;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Prescriber prescriber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Prescription prescription;
	
	
	
	
	public Patient(Long id, String firstName, String lastName, String dob, String gender, Long contactNo,
			Address address, Clinical clinical, Insurance insurance, Prescriber prescriber, Prescription prescription) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		ContactNo = contactNo;
		this.address = address;
		this.clinical = clinical;
		this.insurance = insurance;
		this.prescriber = prescriber;
		this.prescription = prescription;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
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
	public Long getContactNo() {
		return ContactNo;
	}
	public void setContactNo(Long contactNo) {
		ContactNo = contactNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Clinical getClinical() {
		return clinical;
	}
	public void setClinical(Clinical clinical) {
		this.clinical = clinical;
	}
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	public Prescriber getPrescriber() {
		return prescriber;
	}
	public void setPrescriber(Prescriber prescriber) {
		this.prescriber = prescriber;
	}
	public Prescription getPrescription() {
		return prescription;
	}
	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", ContactNo=" + ContactNo + ", address=" + address + ", clinical=" + clinical
				+ ", insurance=" + insurance + ", prescriber=" + prescriber + ", prescription=" + prescription + "]";
	}
	
	
	
}