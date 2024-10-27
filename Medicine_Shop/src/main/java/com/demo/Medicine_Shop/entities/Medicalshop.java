package com.demo.Medicine_Shop.entities;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;

@Entity
public class Medicalshop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MedId", length = 10)
	private int  medId;
	@Column(name = "MedName")
	private String medName;
	@Column(name = "MedType", length = 25)
	private String medType;
	@Column(name = "MedAddress", length = 25)
	private String medAddress;


	public int  getMedId() {
		return medId;
	}
	public void setMedId(int  medId) {
		this.medId = medId;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public String getMedType() {
		return medType;
	}
	public void setMedType(String medType) {
		this.medType = medType;
	}
	public String getMedAddress() {
		return medAddress;
	}
	public void setMedAddress(String medAddress) {
		this.medAddress = medAddress;
	}

	public Medicalshop( String medName, String medType, String medAddress) {
		super();
		//		this.medId = medId;
		this.medName = medName;
		this.medType = medType;
		this.medAddress = medAddress;

	}
	@Override
	public String toString() {
		return "medicalshop ["  + "medName=" + medName + ", medType=" + medType + ", medAddress="
				+ medAddress + "]";
	}


	// No-argument constructor (default constructor)
	public Medicalshop() {
	}


}


