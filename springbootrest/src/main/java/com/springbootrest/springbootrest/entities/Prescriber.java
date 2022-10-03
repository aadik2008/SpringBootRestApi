package com.springbootrest.springbootrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prescriber")
public class Prescriber {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int prescriberId;
	private int npiNumber;
	private String prescriberFirstName;
	private String prescriberLastName;
	private String prescriberTitle;
	public Prescriber(int prescriberId, int npiNumber, String prescriberFirstName, String prescriberLastName,
			String prescriberTitle) {
		super();
		this.prescriberId = prescriberId;
		this.npiNumber = npiNumber;
		this.prescriberFirstName = prescriberFirstName;
		this.prescriberLastName = prescriberLastName;
		this.prescriberTitle = prescriberTitle;
	}
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
