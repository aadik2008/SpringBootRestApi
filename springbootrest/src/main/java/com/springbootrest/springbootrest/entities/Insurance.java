package com.springbootrest.springbootrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurance")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int insuraceId;
	private String policyHolderFirstName;
	private String policyHolderLastName;
	private int primaryRXBin;
	
	
	public Insurance(int insuraceId, String policyHolderFirstName, String policyHolderLastName, int primaryRXBin) {
		super();
		this.insuraceId = insuraceId;
		this.policyHolderFirstName = policyHolderFirstName;
		this.policyHolderLastName = policyHolderLastName;
		this.primaryRXBin = primaryRXBin;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getInsuraceId() {
		return insuraceId;
	}
	public void setInsuraceId(int insuraceId) {
		this.insuraceId = insuraceId;
	}
	public String getPolicyHolderFirstName() {
		return policyHolderFirstName;
	}
	public void setPolicyHolderFirstName(String policyHolderFirstName) {
		this.policyHolderFirstName = policyHolderFirstName;
	}
	public String getPolicyHolderLastName() {
		return policyHolderLastName;
	}
	public void setPolicyHolderLastName(String policyHolderLastName) {
		this.policyHolderLastName = policyHolderLastName;
	}
	public int getPrimaryRXBin() {
		return primaryRXBin;
	}
	public void setPrimaryRXBin(int primaryRXBin) {
		this.primaryRXBin = primaryRXBin;
	}
	@Override
	public String toString() {
		return "Insurance [insuraceId=" + insuraceId + ", policyHolderFirstName=" + policyHolderFirstName
				+ ", policyHolderLastName=" + policyHolderLastName + ", primaryRXBin=" + primaryRXBin + "]";
	}
	
	
	
    
}
