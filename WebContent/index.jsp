<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<meta charset="UTF-8">
<title>Human Resources WebApp!</title>
</head>
<body>
<div>
	<form action="getEmployeeByID.do" method="GET">
		ID #<input type="text" name="id" value="1001"><br /> <input
			type="submit" name="submitID" value="Submit" />
	</form>
	<br />
</div>
<div>
	<form action="getAllEmployeesByFields.do" method="GET">
		
			<h3>Employees Table</h3>
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
	
	<br/>
<div>	
	<form action="getAllAssingmentsByFields.do" method="GET">

			<h3>Assignments Table</h3>
		 <br />Choose the field:<br /> <select name="fieldChoice" multiple>
			<option value="id">ID</option>
			<option value="name">Name</option>
			<option value="start_date">Start Date</option>
			<option value="end_start">End Date</option>
			<option value="employee_id">Employee ID#</option>
			<option value="project_id">Project ID#</option>
		</select> <br />
		<button type="submit" name="getit">Submit</button>
	</form>
	</div>
	


</body>
</html>