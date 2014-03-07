package com.mcnz.tax;

public class TaxationService {
	
	static int stateRate = 5;
	static int fedRate = 25;

	public static int getTaxableIncome(int i, int d) {
		return i - d;
	}

	public static int getStateTax(int i, int d) {
	   int stateTax =  (TaxationService.getTaxableIncome(i,d) * stateRate)/100;
	   return stateTax;
	}

	public static int getFederalTax(int i, int d) {
	    int federalTax =  (TaxationService.getTaxableIncome(i,d) * fedRate)/100;
		return federalTax;
	}

	public static int getTaxesOwing(int i, int d) {
	    int taxesOwing =  TaxationService.getFederalTax(i,d) + TaxationService.getStateTax(i,d);
		return taxesOwing;
	}


}
