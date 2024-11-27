<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UpdateReg" method="post">
		<pre>
	 <input type="hidden" name="id" value="${allData.id}"/>
	Name: <input type="text" name="name" value="${allData.name}" />
	Email: <input type="text" name="email" value="${allData.email}" />
	Mobile: <input type="text" name="mobile" value="${allData.mobile}" />
		<input type="submit" value=save>  
	</pre>

	</form>

</body>
</html>