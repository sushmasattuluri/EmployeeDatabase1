<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file= "includes.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management</title>
</head>
<body>

<form:form action="employeeactions" method="POST" commandName="employee"> 

<table>
<tr>

<td>Employee ID </td>
<td><form:input path="employeeID" /></td>

</tr>

<tr>

<td> First name</td>
<td> <form:input path="firstname" /></td>

</tr>

<tr>

<td>Last name</td>
<td> <form:input path="lastname" /></td>

</tr>

<tr>

<td>Year joined </td>
<td><form:input path="year_joined" /> </td>

</tr>
<tr>
<td colspan="2">
<input type="submit" name="action" value="Add"/>
<input type="submit" name="action" value="Edit"/>
<input type="submit" name="action" value="Delete"/>
<input type="submit" name="action" value="Search"/>

</td>
</tr>
</table>	
</form:form>

<br>
<table border="1">
<th>ID</th>
<th>First name </th>
<th>Last name</th>
<th>Year joined</th>

<c:forEach items="${employeeList}" var="employee">
<tr>
<td>${employee.employeeID }</td>
<td>${employee.firstname}</td>
<td>${employee.lastname}</td>
<td>${employee.year_joined}</td>
</tr>
</c:forEach>

</table>






</body>
</html>