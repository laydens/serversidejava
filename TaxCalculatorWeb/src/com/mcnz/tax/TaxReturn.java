package com.mcnz.tax;

public class TaxReturn {
	
	int income;
	int deductions;
	int taxableIncome;
	int stateTaxOwed;
	int federalTaxOwed;
	int totalTaxOwed;
	java.util.Date creationDate = new java.util.Date();
	
	public TaxReturn(int income, int deductions) {
		super();
		this.income = income;
		this.deductions = deductions;
		taxableIncome = TaxationService.getTaxableIncome(income, deductions);
		stateTaxOwed = TaxationService.getStateTax(income, deductions);
		federalTaxOwed = TaxationService.getFederalTax(income, deductions);
		totalTaxOwed = TaxationService.getTaxesOwing(income, deductions);
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getDeductions() {
		return deductions;
	}

	public void setDeductions(int deductions) {
		this.deductions = deductions;
	}

	public int getTaxableIncome() {
		return taxableIncome;
	}

	public void setTaxableIncome(int taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	public int getStateTaxOwed() {
		return stateTaxOwed;
	}

	public void setStateTaxOwed(int stateTaxOwed) {
		this.stateTaxOwed = stateTaxOwed;
	}

	public int getFederalTaxOwed() {
		return federalTaxOwed;
	}

	public void setFederalTaxOwed(int federalTaxOwed) {
		this.federalTaxOwed = federalTaxOwed;
	}

	public int getTotalTaxOwed() {
		return totalTaxOwed;
	}

	public void setTotalTaxOwed(int totalTaxOwed) {
		this.totalTaxOwed = totalTaxOwed;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}
	

}
