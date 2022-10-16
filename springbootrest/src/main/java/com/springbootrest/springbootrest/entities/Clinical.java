package com.springbootrest.springbootrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "clinical")
public class Clinical {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int clinicalId;
	
	@NotNull(message = "Please enter allergy category")
	private String allergyCategory;
	
	@NotNull(message = "Please enter clinical status")
	private String clinicalStatus;
	
	@NotNull(message = "Please enter desease sevirity")
	private String severity;
	
	private Double height;
	private Double weight;
	
	public Clinical(int clinicalId, String allergyCategory, String clinicalStatus, String severity, Double height,
			Double weight) {
		super();
		this.clinicalId = clinicalId;
		this.allergyCategory = allergyCategory;
		this.clinicalStatus = clinicalStatus;
		this.severity = severity;
		this.height = height;
		this.weight = weight;
	}


	public Clinical() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getClinicalId() {
		return clinicalId;
	}


	public void setClinicalId(int clinicalId) {
		this.clinicalId = clinicalId;
	}


	public String getAllergyCategory() {
		return allergyCategory;
	}


	public void setAllergyCategory(String allergyCategory) {
		this.allergyCategory = allergyCategory;
	}


	public String getClinicalStatus() {
		return clinicalStatus;
	}


	public void setClinicalStatus(String clinicalStatus) {
		this.clinicalStatus = clinicalStatus;
	}


	public String getSeverity() {
		return severity;
	}


	public void setSeverity(String severity) {
		this.severity = severity;
	}


	public Double getHeight() {
		return height;
	}


	public void setHeight(Double height) {
		this.height = height;
	}


	public Double getWeight() {
		return weight;
	}


	public void setWeight(Double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Clinical [clinicalId=" + clinicalId + ", allergyCategory=" + allergyCategory + ", clinicalStatus="
				+ clinicalStatus + ", severity=" + severity + ", height=" + height + ", weight=" + weight + "]";
	}
	
	

}
