<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Human Resources WebApp!</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/main.css" rel="stylesheet">
<title>Edit Employee</title>
</head>
<body>

<div class="container">
<nav class="navbar navbar-inverse navbar-fixed-top hidden-xs">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href=""http://www.ARMoreira.com"m">ARMoreira</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Delete employee</a></li>
      <li><a href="/HRWebApp/index.jsp">Home</a></li>
      <li><a href="/HRWebApp/create.jsp">Create new employee</a></li> 
      <li><a href="/HRWebApp/delete.jsp">Delete employee</a></li> 
    </ul>
  </div>
</nav>
</div>

<div class="container">
<div class="row flat">
<div class="col-lg-4 col-md-6 col-xs-12">
		<div class="plan plan">
<h3 class="plan-name">Edit an Employee</h3>

<form action="updateEmp.do" method="POST">
	<c:forEach var="al" items="${field}">
		<c:forEach var="cell" items="${head}">
		<input type="hidden" name="option" value="${head}">
		<label for="option"><span><span></span></span>${cell}</label>
		<input type="text" name="where" value=""><br/>
		</c:forEach>
	</c:forEach>
	<input type="submit" name="submitID" value="Submit" />
	</form>
</div>	
</div>


<div class="col-lg-4 col-md-6 col-xs-12">
		<div class="plan plan">
<h3 class="plan-name">Original Employee</h3>
	
		

			<c:forEach var="al" items="${table}"><br/>
				
					<c:forEach var="cell" items="${al}">
						<input type="text" name="where" value="${cell}"><br/>
					</c:forEach>
				
			</c:forEach>

			</div></div></div></div>




</body>
</html>


<%--	<label for="option"><span><span></span></span>ID#</label>
		<input type="text" name="where" value="id"><br/>

		<label for="option"><span><span></span></span>First name</label>
		<input type="text" name="where" value="firstname"><br/>
		
		<label for="option"><span><span></span></span>Middle name</label>
		<input type="text" name="where" value="middlename"><br/>
		
		<label for="option"><span><span></span></span>Last name</label>
		<input type="text" name="where" value="lastname"><br/>
		
		<label for="option"><span><span></span></span>Gender</label>
		<input type="text" name="where" value="gender"><br/>
		
		<label for="option"><span><span></span></span>Extension</label>
		<input type="text" name="where" value="extension"><br/>
		
		<label for="option"><span><span></span></span>Hire Date</label>
		<input type="text" name="where" value="hiredate"><br/>
		
		<label for="option"><span><span></span></span>Salary</label>
		<input type="text" name="where" value="salary"><br/>
		
		<label for="option"><span><span></span></span>Commission %</label>
		<input type="text" name="where" value="commission_pct"><br/>
		
		<label for="option"><span><span></span></span>Department ID#</label>
		<input type="text" name="where" value="department_id"><br/>
		
		<label for="option"><span><span></span></span>Job ID#</label>
		<input type="text" name="where" value="job_id"><br/>
		
		<label for="option"><span><span></span></span>Address</label>
		<input type="text" name="where" value="address"><br/>
		
		<label for="option"><span><span></span></span>City</label>
		<input type="text" name="where" value="${cell}"><br/>
		
		<label for="option"><span><span></span></span>State</label>
		<input type="text" name="where" value="${cell}"><br/>
		
		<label for="option"><span><span></span></span>Zipcode</label>
		<input type="text" name="where" value="${cell}"><br/>
		
		<button type="submit" name="getit">Submit</button> --%>