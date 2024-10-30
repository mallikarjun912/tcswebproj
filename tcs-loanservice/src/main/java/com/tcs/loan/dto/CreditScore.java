package com.tcs.loan.dto;

public class CreditScore {
	private String pancard;
	private String customerName;
	private int creditscore;
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "CreditScore [pancard=" + pancard + ", customerName=" + customerName + ", creditscore=" + creditscore
				+ "]";
	}
	public int getCreditscore() {
		return creditscore;
	}
	public void setCreditscore(int creditscore) {
		this.creditscore = creditscore;
	}
	
}
