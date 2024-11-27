<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>

		<c:forEach items="${model }" var="allData">
		<tr>
		<td>${allData.id}</td>
		  <td>${allData.name}</td>
		  <td>${allData.email}</td>
		  <td>${allData.mobile}</td>
		  <td><a href="deleteById?id=${allData.id}"><input type="submit" value="delete"> </a></td>
		   <td><a href="updateById?id=${allData.id}"><input type="submit" value="Update"> </a></td>
		</tr>

		</c:forEach>

	</table>


</body>
</html>