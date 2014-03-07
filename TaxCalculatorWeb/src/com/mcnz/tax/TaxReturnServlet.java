package com.mcnz.tax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TaxReturnServlet")
public class TaxReturnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int stateRate = 5;
	int fedRate = 25;

	public int getTaxableIncome(int i, int d) {
		return i - d;
	}

	public int getStateTax(int i, int d) {
	   int stateTax =  (this.getTaxableIncome(i,d) * stateRate)/100;
	   return stateTax;
	}

	public int getFederalTax(int i, int d) {
	    int federalTax =  (this.getTaxableIncome(i,d) * fedRate)/100;
		return federalTax;
	}

	public int getTaxesOwing(int i, int d) {
	    int taxesOwing =  this.getFederalTax(i,d) + this.getStateTax(i,d);
		return taxesOwing;
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String income = request.getParameter("income");
		String deductions = request.getParameter("deductions");
		response.getWriter().print("<br/>You told us your income is: " + income);
		response.getWriter().print("<br/>Your deductions are: " + deductions);
		response.getWriter().print("<br/>Your taxable income is: " + this.getTaxableIncome(Integer.parseInt(income), Integer.parseInt(deductions)));
		response.getWriter().print("<br/>Your federal tax is: " + this.getFederalTax(Integer.parseInt(income), Integer.parseInt(deductions)));
		response.getWriter().print("<br/>Your state tax is: " + this.getStateTax(Integer.parseInt(income), Integer.parseInt(deductions)));
		response.getWriter().print("<br/>Your total taxes owing is: " + this.getTaxesOwing(Integer.parseInt(income), Integer.parseInt(deductions)));
		
		response.getWriter().print("<br/><br/>By the way, this came from the doPost!");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().print("Hello World!");
		response.getWriter().print("<br/>BTW, do form processing in the doPost, not doGet.");
		
		
	}


}
