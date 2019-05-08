<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align=”center”>Beer Recommendations JSP</h1>
	<p>
		<%
			List styles = (List) request.getAttribute("styles");
			request.setAttribute("styles", styles);
		%>
	
	<table>
		<tr>
			<th>DATE</th>
		</tr>
		<c:forEach var="item" items="${styles}">
			<tr>
				<td>${item}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>