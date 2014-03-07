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
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String income = request.getParameter("income");
		String deductions = request.getParameter("deductions");
		response.getWriter().print("<br/>You told us your income is: " + income);
		response.getWriter().print("<br/>Your deductions are: " + deductions);
		response.getWriter().print("<br/>Your taxable income is: " + TaxationService.getTaxableIncome(Integer.parseInt(income), Integer.parseInt(deductions)));
		response.getWriter().print("<br/>Your federal tax is: " + TaxationService.getFederalTax(Integer.parseInt(income), Integer.parseInt(deductions)));
		response.getWriter().print("<br/>Your state tax is: " + TaxationService.getStateTax(Integer.parseInt(income), Integer.parseInt(deductions)));
		response.getWriter().print("<br/>Your total taxes owing is: " + TaxationService.getTaxesOwing(Integer.parseInt(income), Integer.parseInt(deductions)));
		
		response.getWriter().print("<br/><br/>By the way, this came from the logic-less doPost!");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().print("Hello World!");
		response.getWriter().print("<br/>BTW, do form processing in the doPost, not doGet.");
		
		
	}

}
