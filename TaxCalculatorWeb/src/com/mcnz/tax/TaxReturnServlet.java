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
		TaxReturn taxReturn = TaxationService.getTaxReturn(Integer.parseInt(income), Integer.parseInt(deductions));
		request.setAttribute("taxreturn", taxReturn);
		request.getRequestDispatcher("taxdisplay.jsp").forward(request, response);
	
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().print("Hello World!");
		response.getWriter().print("<br/>BTW, do form processing in the doPost, not doGet.");
		
		
	}

}
