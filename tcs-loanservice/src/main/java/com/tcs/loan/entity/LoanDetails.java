package com.tcs.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanDetails {
	@Id
	private int loanId;
	@Column(length = 30)
	private String customerName;
	@Column
	private double monthlyIncome;
	@Column
	private double loanAmount;
	@Column(columnDefinition = "date")
	private String dateApplied;
	@Column(length = 10)
	private String pancard;
	@Column(columnDefinition = "date")
	private String dateSanctioned;
	@Column
	private int creditscore;
	@Column(length = 15)
	private String loanStatus;
	@Column(length = 50)
	private String remarks;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getDateApplied() {
		return dateApplied;
	}
	public void setDateApplied(String dateApplied) {
		this.dateApplied = dateApplied;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getDateSanctioned() {
		return dateSanctioned;
	}
	public void setDateSanctioned(String dateSanctioned) {
		this.dateSanctioned = dateSanctioned;
	}
	public int getCreditscore() {
		return creditscore;
	}
	public void setCreditscore(int creditscore) {
		this.creditscore = creditscore;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
