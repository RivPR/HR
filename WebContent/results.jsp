<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result of Search</title>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/main.css" rel="stylesheet">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<div class="container">
		<nav class="navbar navbar-inverse navbar-fixed-top hidden-xs">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href=""http://www.ARMoreira.com"">ARMoreira</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/HRWebApp/index.jsp">Home</a></li>
				<li><a href="/HRWebApp/create.jsp">Create new employee</a></li>
				<li><a href="/HRWebApp/delete.jsp">Delete employee</a></li>
			</ul>
		</div>
		</nav>
	</div>
<body>
	<div class="container">


			
				<h1>Result of search</h1>
			<div class="tbl-header">
			<table cellpadding="0" cellspacing="0" border="0">
			<thead>
			<tr>
				<c:forEach var="head" items="${head}">
					<th>"${head}"</th>
				</c:forEach>
			</tr>
			</thead>
			</table>
			</div>
			<div  class="tbl-content">
			<table cellpadding="0" cellspacing="0" border="0">
			<tbody>
			<c:forEach var="al" items="${table}">
				<tr>
					<c:forEach var="cell" items="${al}">
						<td>${cell}</td>
					</c:forEach>
				</tr>
			</c:forEach>
			</tbody>
			</table>
	</div>
	</div>
	  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>
</body>
</html>