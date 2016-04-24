package data;

import java.util.ArrayList;

public class HRBean {
	private String id;
	private String firstname;
	private String middlename;
	private String lastname;
	private String gender;
	private String extension;
	private String hiredate;
	private String salary;
	private String commission_pct;
	private String department_id;
	private String job_id;
	private String address;
	private String city;
	private String state;
	private String zipcode;

	public HRBean() {
		super();
	}

	public HRBean(String id, String firstname, String middlename, String lastname, String gender,
			String extension, String hiredate, String salary, String commission_pct, String department_id,
			String job_id, String address, String city, String state, String zipcode) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.gender = gender;
		this.extension = extension;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.department_id = department_id;
		this.job_id = job_id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public HRBean(ArrayList<String> row) {
		super();
		this.id = row.get(0);
		this.firstname = row.get(1);
		this.middlename = row.get(2);
		this.lastname = row.get(3);
		this.gender = row.get(4);
		this.extension = row.get(5);
		this.hiredate = row.get(6);
		this.salary = row.get(7);
		this.commission_pct = row.get(8);
		this.department_id = row.get(9);
		this.job_id = row.get(10);
		this.address = row.get(11);
		this.city = row.get(12);
		this.state = row.get(13);
		this.zipcode = row.get(14);
	}

	/*
	 * to add later for insertion
	 */
	public ArrayList<String> employeeToArray() {
		ArrayList<String> employee = new ArrayList<>();
		employee.add(id);
		employee.add(firstname);
		employee.add(middlename);
		employee.add(lastname);
		employee.add(gender);
		employee.add(extension);
		employee.add(hiredate);
		employee.add(salary);
		employee.add(commission_pct);
		employee.add(department_id);
		employee.add(job_id);
		employee.add(address);
		employee.add(city);
		employee.add(state);
		employee.add(zipcode);
		return null;
	}

	public String getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public String getGender() {
		return gender;
	}

	public String getExtension() {
		return extension;
	}

	public String getHiredate() {
		return hiredate;
	}

	public String getSalary() {
		return salary;
	}

	public String getCommission_pct() {
		return commission_pct;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public String getJob_id() {
		return job_id;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void setCommission_pct(String commission_pct) {
		this.commission_pct = commission_pct;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "employeeBean [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", gender=" + gender + ", extension=" + extension + ", hiredate="
				+ hiredate + ", salary=" + salary + ", commission_pct=" + commission_pct + ", department_id="
				+ department_id + ", job_id=" + job_id + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}

	public String toquery() {
		String query = "(firstname, lastname, gender, email, extension, hiredate, salary,"
				+ " commission_pct, department_id, job_id, address, city , state , zipcode) VALUES (\"" + firstname
				+ "\" , \"" + lastname + "\" , \"" + gender + "\" , \"" + "\" , \"" + extension + "\","
				+ "CURDATE()" + "," + salary + "," + commission_pct + "," + department_id + " , " + job_id + ",\""
				+ address + "\", \"" + city + "\" , \"" + state + "\" , \"" + zipcode + "\");";
		return query;
	}

}
