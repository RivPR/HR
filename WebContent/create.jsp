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
      <li class="active"><a href="#">Create new employee</a></li>
      <li><a href="/HRWebApp/index.jsp">Home</a></li>
      <li><a href="/HRWebApp/create.jsp">Create new employee</a></li> 
      <li><a href="/HRWebApp/delete.jsp">Delete employee</a></li> 
    </ul>
  </div>
</nav>
</div>
  
  <div class="container">
  <h1 class="page-header">Add/Edit an employee</h1>
  <div class="row flat">
  <div class="col-lg-4 col-md-6 col-xs-12">
		<div class="plan plan">
  	    <form action="createEmp.do" method="GET">
			<h3 class="plan-name">Add a new Employee</h3>
		<input type="checkbox" name="option" value="firstname">
		<label for="option"><span><span></span></span>First name</label>
		<input type="text" name="fname" value="*REQUIRED*"><br/>
		
<!-- 		<input type="checkbox" name="option" value="middlename">
		<label for="option"><span><span></span></span>Middle name</label>
		<input type="text" name="where"><br/> -->
		
		<input type="checkbox" name="option" value="lastname">
		<label for="option"><span><span></span></span>Last name</label>
		<input type="text" name="lname" value="*REQUIRED*"><br/>
		
<!-- 		<input type="checkbox" name="option" value="gender">
		<label for="option"><span><span></span></span>Gender</label>
		<input type="text" name="where"><br/>
		
		<input type="checkbox" name="option" value="extension">
		<label for="option"><span><span></span></span>Extension</label>
		<input type="text" name="where"><br/>
		
		<input type="checkbox" name="option" value="hiredate">
		<label for="option"><span><span></span></span>Hire Date</label>
		<input type="text" name="where"><br/>
		
		<input type="checkbox" name="option" value="salary">
		<label for="option"><span><span></span></span>Salary</label>
		<input type="text" name="where"><br/>
		
		<input type="checkbox" name="option" value="commission_pct">
		<label for="option"><span><span></span></span>Commission %</label>
		<input type="text" name="where"><br/> -->
		
		<input type="checkbox" name="option" value="department_id">
		<label for="option"><span><span></span></span>Dept ID#</label>
		<input type="text" name="dID" value="*REQUIRED*"><br/>
		
		<input type="checkbox" name="option" value="job_id">
		<label for="option"><span><span></span></span>Job ID#</label>
		<input type="text" name="jID" value="*REQUIRED*"><br/>
		
<!-- 		<input type="checkbox" name="option" value="address">
		<label for="option"><span><span></span></span>Address</label>
		<input type="text" name="where"><br/>
		
		<input type="checkbox" name="option" value="city">
		<label for="option"><span><span></span></span>City</label>
		<input type="text" name="where"><br/>
		
		<input type="checkbox" name="option" value="State">
		<label for="option"><span><span></span></span>State</label>
		<input type="text" name="where"><br/>
		
		<input type="checkbox" name="option" value="zipcode">
		<label for="option"><span><span></span></span>Zipcode</label>
		<input type="text" name="where"><br/> -->

		
		<h3>*Only Admin users can erase personnel*</h3>
		<input type="password" name="pass" value="pass">
		<button type="submit" name="getit">Submit</button>
		</form>
  </div>
  </div>

  
  <div class="col-lg-4 col-md-6 col-xs-12">
		<div class="plan plan">
  	    <form action="editEmp.do" method="GET">
			<h3 class="plan-name">Edit an Employee</h3>
		ID# of Employee to be edited
		<input type="text" name="id" value="*REQUIRED*"><br/>
		

		

			<h4>*Only Admin users can edit personnel*</h4>
		<input type="password" name="pass" value="pass">
		<button type="submit" name="submitID">Submit</button>
		</form>
		</div>
		</div>
 </div>	
 </div>

</body>
</html>