<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Human Resources WebApp!</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/main.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<nav class="navbar navbar-inverse navbar-fixed-top hidden-xs">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href=""http://www.ARMoreira.com"">ARMoreira</a>
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
	<h1 class="page-header">Delete employee</h1>
  <div class="row flat">
  <div class="col-lg-4 col-md-6 col-xs-12">
		<div class="plan plan">
  	    <form action="deleteEmp.do" method="GET">
			<h3 class="plan-name">Delete an Employee</h3>
			<h3 class="warning">**DELETIONS ARE PERMANENT. DO NOT DELETE UNLESS YOU ARE 100% CERTAIN**</h3>
		<label for="option"><span><span></span></span>ID# of Employee to be deleted</label>
		<input type="text" name="id" value="*REQUIRED*"><br/>
		

		

			<h4>*Only Admin users can erase personnel*</h4>
		<input type="password" name="pass" value="pass">
		<button type="submit" name="getit">Submit</button>
		</form>
  </div>
  </div>
  </div>
  </div>

</body>
</html>