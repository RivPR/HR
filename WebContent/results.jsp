<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result of Search</title>
</head>
<body>
	<table>


		<tr>
			<th>Result of search</th>
		</tr>
		<tr>
			<c:forEach var="head" items="${head}">
				<th>"${head}"</th>
			</c:forEach>
		</tr>

		<c:forEach var="al" items="${table}">
			<tr>
				<c:forEach var="cell" items="${al}">
					<td>${cell}</td>
				</c:forEach>
			</tr>
		</c:forEach>

	</table>
</body>
</html>