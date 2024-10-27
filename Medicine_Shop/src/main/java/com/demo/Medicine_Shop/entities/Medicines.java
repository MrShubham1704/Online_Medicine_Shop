package com.demo.Medicine_Shop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity

public class Medicines {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MdcnId", length = 20)
	private Integer mdcnId;
	@Column(name = "MdcnNmae", length = 25)
	private String mdcnName;
	@Column(name = "MdcnCost", length = 10)
	private String mdcnCost;
	@Column(name = "MdcnDate")
	private LocalDate mdcnDate;
	@Column(name = "ExpriyDate")
	private LocalDate expriyDate;
	public Integer getMdcnId() {
		return mdcnId;
	}
	public void setMdcnId(Integer mdcnId) {
		this.mdcnId = mdcnId;
	}
	public String getMdcnName() {
		return mdcnName;
	}
	public void setMdcnName(String mdcnName) {
		this.mdcnName = mdcnName;
	}
	public String getMdcnCost() {
		return mdcnCost;
	}
	public void setMdcnCost(String mdcnCost) {
		this.mdcnCost = mdcnCost;
	}
	public LocalDate getMdcnDate() {
		return mdcnDate;
	}
	public void setMdcnDate(LocalDate mdcnDate) {
		this.mdcnDate = mdcnDate;
	}
	public LocalDate getExpriyDate() {
		return expriyDate;
	}
	public void setExpriyDate(LocalDate expriyDate) {
		this.expriyDate = expriyDate;
	}
	public Medicines(String mdcnName, String mdcnCost, LocalDate mdcnDate, LocalDate expriyDate) {
		super();
		//this.mdcnId = mdcnId;
		this.mdcnName = mdcnName;
		this.mdcnCost = mdcnCost;
		this.mdcnDate = mdcnDate;
		this.expriyDate = expriyDate;
	}
	@Override
	public String toString() {
		return "Medicines [mdcnId=" + mdcnId + ", mdcnName=" + mdcnName + ", mdcnCost=" + mdcnCost + ", mdcnDate="
				+ mdcnDate + ", expriyDate=" + expriyDate + "]";
	}
	public Medicines() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}