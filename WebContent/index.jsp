<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Human Resources WebApp!</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/main.css" rel="stylesheet">
</head>
<body>

<div class="container">
<nav class="navbar navbar-inverse navbar-fixed-top hidden-xs">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="http://www.ARMoreira.com">ARMoreira</a>
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

<div class="container">
	<h1 class="page-header">Table Query</h1>
	
<div class="row flat">
	


<div class="col-lg-4 col-md-6 col-xs-12">
<div class="plan plan">
	<form action="getAllAssignmentsByFields.do" method="GET">
			<h3 class="plan-name">Assignments Table</h3>
		Choose the field:<br /> <select name="fieldChoice" multiple>
			<option value="id">ID</option>
			<option value="name">Name</option>
			<option value="start_date">Start Date</option>
			<option value="end_date">End Date</option>
			<option value="employee_id">Employee ID#</option>
			<option value="project_id">Project ID#</option>
		</select> <br />
		<button type="submit" name="allByField">Search for all assignments by field</button>
	
		<h4>*Only type in the field you want to include*</h4>
		<h5>*Make sure to erase all other fields*</h5>
		<input type="radio" name="option" value="id">
		<label for="option"><span><span></span></span>ID#</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="name">
		<label for="option"><span><span></span></span>Name</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="start_date">
		<label for="option"><span><span></span></span>Start Date</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="end_date">
		<label for="option"><span><span></span></span>End Date</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="employee_id">
		<label for="option"><span><span></span></span>Employee ID#</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="project_id">
		<label for="option"><span><span></span></span>Project ID#</label>
		<input type="text" name="where"><br/>
		
		<button type="submit" name="getit">Submit</button>
	</form>
</div>
</div>

<div class="col-lg-4 col-md-6 col-xs-12">
<div class="plan plan">
	<form action="getAllJobsByFields.do" method="GET">
			<h3 class="plan-name">Jobs Table</h3>
		Choose the field:<br /> <select name="fieldChoice" multiple>
			<option value="id">ID</option>
			<option value="name">Name</option>
			<option value="minimum_salary">Minimum Salary</option>
			<option value="maximum_salary">Maximum Salary</option>
		</select> <br />
		<button type="submit" name="allByField">Search for all jobs by field</button>
	
		<h4>*Only type in the field you want to include*</h4>
		<h5>*Make sure to erase all other fields*</h5>
		<input type="radio" name="option" value="id">
		<label for="option"><span><span></span></span>ID#</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="name">
		<label for="option"><span><span></span></span>Name</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="minimum_salary">
		<label for="option"><span><span></span></span>Minimum Salary</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="maximum_salary">
		<label for="option"><span><span></span></span>Maximum Salary</label>
		<input type="text" name="where"><br/>

		
		<button type="submit" name="getit">Submit</button>
	</form>
</div>
</div>
<div class="col-lg-4 col-md-6 col-xs-12">
<div class ="plan plan">
	<form action="getAllLocaByFields.do" method="GET">
			<h3 class="plan-name">Locations Table</h3>
		Choose the field:<br /> <select name="fieldChoice" multiple>
			<option value="id">ID</option>
			<option value="square_footage">Square Footage</option>
			<option value="street_address">Street Address</option>
			<option value="city">City</option>
			<option value="state">State</option>
			<option value="zipcode">Zipcode</option>
		</select> <br />
		<button type="submit" name="allByField">Search for all locations by field</button>
	
		<h4>*Only type in the field you want to include*</h4>
		<h5>*Make sure to erase all other fields*</h5>
		<input type="radio" name="option" value="id">
		<label for="option"><span><span></span></span>ID#</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="square_footage">
		<label for="option"><span><span></span></span>Square Footage</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="street_address">
		<label for="option"><span><span></span></span>Street Address</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="city">
		<label for="option"><span><span></span></span>City</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="state">
		<label for="option"><span><span></span></span>State</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="zipcode">
		<label for="option"><span><span></span></span>Zipcode</label>
		<input type="text" name="where"><br/>


		
		<button type="submit" name="getit">Submit</button>
	</form>
</div>
</div>

<div class="col-lg-4 col-md-6 col-xs-12">
<div class ="plan plan">
			<form action="getAllProjByFields.do" method="GET">
					<h3 class="plan-name">Projects Table</h3>
				Choose the field:<br /> <select name="fieldChoice" multiple>
					<option value="id">ID</option>
					<option value="name">Name</option>
					<option value="start_date">Start Date</option>
					<option value="end_date">End Date</option>
					<option value="parent_project_id">Parent Project ID#</option>
		
				</select> <br />
				<button type="submit" name="allByField">Search for all projects by field</button>
			
				<h4>*Only type in the field you want to include*</h4>
				<h5>*Make sure to erase all other fields*</h5>
				<input type="radio" name="option" value="id">
				<label for="option"><span><span></span></span>ID#</label>
				<input type="text" name="where"><br/>
				<input type="radio" name="option" value="name">
				<label for="option"><span><span></span></span>Name</label>
				<input type="text" name="where"><br/>
				<input type="radio" name="option" value="start_date">
				<label for="option"><span><span></span></span>Start Date </label>
				<input type="text" name="where"><br/>
				<input type="radio" name="option" value="end_date">
				<label for="option"><span><span></span></span>End Date</label>
				<input type="text" name="where"><br/>
				<input type="radio" name="option" value="parent_project_id">
				<label for="option"><span><span></span></span>Parent Project ID</label>
				<input type="text" name="where"><br/>
				<button type="submit" name="getit">Submit</button>
			</form>
		</div>
		</div>
<div class="col-lg-4 col-md-6 col-xs-12">
		<div class ="plan plan">
			<form action="getAllDeptByFields.do" method="GET">
					<h3 class="plan-name">Departments Table</h3>
				Choose the field:<br /> <select name="fieldChoice" multiple>
					<option value="id">ID</option>
					<option value="name">Name</option>
					<option value="manager_id">Manager ID#</option>
					<option value="location_id">Location ID#</option>
				</select> <br />
				<button type="submit" name="allByField">Search for all departments by field</button>
			
				<h4>*Only type in the field you want to include*</h4>
				<h5>*Make sure to erase all other fields*</h5>
				<input type="radio" name="option" value="id">
				<label for="option"><span><span></span></span>ID#</label>
				<input type="text" name="where"><br/>
				<input type="radio" name="option" value="name">
				<label for="option"><span><span></span></span>Name</label>
				<input type="text" name="where"><br/>
				<input type="radio" name="option" value="manager_id">
				<label for="option"><span><span></span></span>Manager ID#</label>
				<input type="text" name="where"><br/>
				<input type="radio" name="option" value="location_id">
				<label for="option"><span><span></span></span>Location ID#</label>
				<input type="text" name="where"><br/>
		
				<button type="submit" name="getit">Submit</button>
			</form>
			</div>
		</div>
		<div class="col-lg-4 col-md-6 col-xs-12">
		<div class="plan plan">
			<h3 class="plan-name">Employees Table</h3>
	<form action="getEmployeeByID.do" method="GET">
		<h5>Look up employee by ID:</h5>
		ID #<input type="text" name="id" value="1001"><br /> <input
			type="submit" name="submitID" value="Submit" />
	</form>
	

	<form action="getAllEmployeesByFields.do" method="GET">
				
				
		Choose the field:<br /> <select name="fieldChoice" multiple>
			<option value="id">ID</option>
			<option value="firstname">First Name</option>
			<option value="lastname">Last Name</option>
			<option value="gender">Gender</option>
			<option value="extension">Extension</option>
			<option value="salary">Salary</option>
			<option value="commission_pct">Commission %</option>
			<option value="department_id">Department ID #</option>
			<option value="job_id">Job ID #</option>
			<option value="address">Address</option>
			<option value="city">City</option>
			<option value="zipcode">Zipcode</option>
		</select>
		<button type="submit" name="allByField">Search for all employees by field</button>
		<br/>
		<h4>*Only type in the field you want to include*</h4>
		<h5>*Make sure to erase all other fields*</h5>
		<input type="radio" name="option" value="id">
		<label for="option"><span><span></span></span>ID#</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="firstname">
		<label for="option"><span><span></span></span>First name</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="lastname">
		<label for="option"><span><span></span></span>Last name</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="gender">
		<label for="option"><span><span></span></span>Gender</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="extension">
		<label for="option"><span><span></span></span>Extension</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="salary">
		<label for="option"><span><span></span></span>Salary</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="department_id">
		<label for="option"><span><span></span></span>Dept ID#</label>
		<input type="text" name="where"><br/>
		<input type="radio" name="option" value="job_id">
		<label for="option"><span><span></span></span>Job ID#</label>
		<input type="text" name="where"><br/>
		<button type="submit" name="getit">Submit</button>
	</form>
	</div>
	</div>
	</div> <!-- /row-flat -->
</div> <!-- /container -->


</body>
</html>