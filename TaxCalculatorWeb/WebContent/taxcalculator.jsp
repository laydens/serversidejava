<%@ page contentType="text/html; charset=ISO-8859-1"  %>
<%-- This is a comment! --%>
<html>
<head>
<title>Tax Calculator</title>
</head>
<body>

<%!
int stateRate = 5;
int fedRate = 25;

List mylist = null;


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
%>

<%

String income = request.getParameter("income");
String deductions = request.getParameter("deductions");


if (income != null) {

	out.print("<br/>You told us your income is: " + income);
	out.print("<br/>Your deductions are: " + deductions);
	out.print("<br/>Your taxable income is: " + this.getTaxableIncome(Integer.parseInt(income), Integer.parseInt(deductions)));
	out.print("<br/>Your federal tax is: " + this.getFederalTax(Integer.parseInt(income), Integer.parseInt(deductions)));
	out.print("<br/>Your state tax is: " + this.getStateTax(Integer.parseInt(income), Integer.parseInt(deductions)));
	out.print("<br/>Your total taxes owing is: " + this.getTaxesOwing(Integer.parseInt(income), Integer.parseInt(deductions)));



} else {

%>

Please tell us your income:
<form action="#">
Total income: 	<input type="text" name="income"/><br/>
Total deductions: <input type="text" name="deductions"/><br/>
<input type="submit" name="submit"/>
</form>
 
 <%
 }
 %>

</body>
</html>