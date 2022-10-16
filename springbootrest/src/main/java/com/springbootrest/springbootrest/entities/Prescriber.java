package com.springbootrest.springbootrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "prescriber")
public class Prescriber {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int prescriberId;
	
	@NotNull(message = "Please enter your NPI number")
	private int npiNumber;
	
	@NotNull(message = "Please enter Prescriber first name")
	private String prescriberFirstName;
	
	@NotNull(message = "Please enter Prescriber last name")
	private String prescriberLastName;
	private String prescriberTitle;
	
	
	public Prescriber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrescriberId() {
		return prescriberId;
	}
	public void setPrescriberId(int prescriberId) {
		this.prescriberId = prescriberId;
	}
	public int getNpiNumber() {
		return npiNumber;
	}
	public void setNpiNumber(int npiNumber) {
		this.npiNumber = npiNumber;
	}
	public String getPrescriberFirstName() {
		return prescriberFirstName;
	}
	public void setPrescriberFirstName(String prescriberFirstName) {
		this.prescriberFirstName = prescriberFirstName;
	}
	public String getPrescriberLastName() {
		return prescriberLastName;
	}
	public void setPrescriberLastName(String prescriberLastName) {
		this.prescriberLastName = prescriberLastName;
	}
	public String getPrescriberTitle() {
		return prescriberTitle;
	}
	public void setPrescriberTitle(String prescriberTitle) {
		this.prescriberTitle = prescriberTitle;
	}
	@Override
	public String toString() {
		return "Prescriber [prescriberId=" + prescriberId + ", npiNumber=" + npiNumber + ", prescriberFirstName="
				+ prescriberFirstName + ", prescriberLastName=" + prescriberLastName + ", prescriberTitle="
				+ prescriberTitle + "]";
	}
	
	

}
