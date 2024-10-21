<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Errors.jsp"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String status = session.getAttribute("login").toString(); %>
	<h1>Employee Details </h1>
	<a href="AddEmployee.jsp">Add Employee</a> 
	<table border="2" width="50%" align="center">
		<tr>
			<th>EMP CODE</th>
			<th>EMP NAME</th>
			<th>SALARY</th>
		</tr>
		<c:forEach var="emp" items="${data}"> 
			<tr>
				<td>${emp.empcode}</td>
				<td>${emp.empname}</td>
				<td>${emp.salary}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>