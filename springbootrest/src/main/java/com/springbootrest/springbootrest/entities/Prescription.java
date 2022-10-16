package com.springbootrest.springbootrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "prescription")
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int prescriptionId;
	
	@NotNull(message = "Please enter NDC")
	private String ndc;
	
	@NotNull(message = "Please enter rxNumber")
	private int rxNumber;
	
	@NotNull(message = "Please enter drug name")
	private String drugName;
	
	@NotNull(message = "Please enter the strength of the drug")
	private String strength;
	
	@NotNull(message = "Please enter the strength unit")
	private int strengthUnit;
	
	@NotNull(message = "Please enter the supply")
	private int supply;
	
	@NotNull(message = "Please enter the refills")
	private int refills;
	public Prescription(int prescriptionId, String ndc, int rxNumber, String drugName, String strength,
			int strengthUnit, int supply, int refills) {
		super();
		this.prescriptionId = prescriptionId;
		this.ndc = ndc;
		this.rxNumber = rxNumber;
		this.drugName = drugName;
		this.strength = strength;
		this.strengthUnit = strengthUnit;
		this.supply = supply;
		this.refills = refills;
	}
	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getNdc() {
		return ndc;
	}
	public void setNdc(String ndc) {
		this.ndc = ndc;
	}
	public int getRxNumber() {
		return rxNumber;
	}
	public void setRxNumber(int rxNumber) {
		this.rxNumber = rxNumber;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public int getStrengthUnit() {
		return strengthUnit;
	}
	public void setStrengthUnit(int strengthUnit) {
		this.strengthUnit = strengthUnit;
	}
	public int getSupply() {
		return supply;
	}
	public void setSupply(int supply) {
		this.supply = supply;
	}
	public int getRefills() {
		return refills;
	}
	public void setRefills(int refills) {
		this.refills = refills;
	}
	@Override
	public String toString() {
		return "Prescription [prescriptionId=" + prescriptionId + ", ndc=" + ndc + ", rxNumber=" + rxNumber
				+ ", drugName=" + drugName + ", strength=" + strength + ", strengthUnit=" + strengthUnit + ", supply="
				+ supply + ", refills=" + refills + "]";
	}
	
	
}
