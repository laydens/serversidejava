<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.mcnz.tax.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your tax summary!</title>
</head>
<body>

<br/>Income: ${taxreturn.income }
<br/>taxdisplayDeduction: ${taxreturn.deductions }
<br/>Taxable income:  ${taxreturn.taxableIncome }
<br/>Federal tax: ${taxreturn.federalTaxOwed }
<br/>State tax: ${taxreturn.stateTaxOwed }
<br/>Taxes Owing: ${taxreturn.totalTaxOwed }
<br/><br/>Date created: ${taxreturn.creationDate }

</body>
</html>