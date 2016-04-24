<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="getAllEmployeesByFields.do" method="GET">
		<select name="table">
			<option value="employees">Employees</option>

		</select> <br />Choose the field:<br /> <select name="fieldChoice" multiple>
			<option value="id">ID</option>
			<option value="firstname">First Name</option>
			<option value="lastname">Last Name</option>
			<option value="gender">Gender</option>
			<option value="salary">Salary</option>
			<option value="commission_pct">Commission pct</option>
			<option value="department_id">department_id</option>
			<option value="job_id">job_id</option>
			<option value="city">city</option>
		</select> <br />
		<button type="submit" name="getMore">Submit</button>
	</form>
</body>
</html>