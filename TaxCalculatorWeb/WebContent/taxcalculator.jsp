<html>
<head>
<title>Tax Calculator</title>
</head>
<body>

<%

String income = request.getParameter("income");
String deductions = request.getParameter("deduction");

if (income != null) {

	out.print("You told us your income is: " + income);

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