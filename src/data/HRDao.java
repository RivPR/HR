package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HRDao {
	private final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/companydb";
	private static Connection conn;
	private ArrayList<String> rows = new ArrayList<>();
	private ArrayList<ArrayList<String>> al = new ArrayList<>();

	private ArrayList<String> rowHeader = new ArrayList<>();
	private ResultSet rs;
	private ResultSetMetaData rsmd;
	private String input;
	private String sql;
	private Statement stmt;
	private String fields;
	private String whereClause;
	//private HRDao hrDao;


	public HRDao() {
	}
	public HRDao(String id){
		this.fields = id;
	}
	public HRDao(String fields, String where) {
		this.fields = fields;
		this.whereClause = where;
	}
	public ArrayList<ArrayList<String>> searchEmpByFields(String choice, String field, String where ) throws SQLException, ClassNotFoundException {
		System.out.println(choice + " " + field + " " + where);
		//the where clause was coming over with an extra 8 commas
		where = where.replace(',' , ' ').trim(); 
		whereClause= ("WHERE " + field + "= '" + where + "'");
		fields= ("SELECT " + choice + " FROM employees " + whereClause );
		input = fields;
		System.out.println("this is whereclause: "+fields);
		System.out.println("in method");

		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();

		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchAllEmpByFields(String choice) throws SQLException, ClassNotFoundException {
		System.out.println(choice + " ");

		
		fields= ("SELECT " + choice + " FROM employees ");
		input = fields;
		System.out.println("this is whereclause: "+choice);
		System.out.println("in method");
		
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchEmpByID(String id) throws SQLException, ClassNotFoundException {


		whereClause= ("WHERE id = '" + id + "'");
		fields= ("SELECT * FROM employees " + whereClause );
		input = fields;
//		System.out.println("this is whereclause: "+fields);
//		System.out.println("in method");
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchAllAssByFields(String choice) throws SQLException, ClassNotFoundException {
		
		
		
		fields= ("SELECT " + choice + " FROM assignments ");
		input = fields;
//		System.out.println("this is whereclause: "+fields);
//		System.out.println("in method");
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchAssByFields(String choice, String field, String where ) throws SQLException, ClassNotFoundException {
		System.out.println(choice + " " + field + " " + where);
		//the where clause was coming over with an extra 8 commas
		where = where.replace(',' , ' ').trim(); 
		whereClause= ("WHERE " + field + "= '" + where + "'");
		fields= ("SELECT " + choice + " FROM assignments " + whereClause );
		input = fields;
		System.out.println("this is whereclause: "+fields);
		System.out.println("in method");

		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();

		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchAllJobsByFields(String choice) throws SQLException, ClassNotFoundException {
		
		
		
		fields= ("SELECT " + choice + " FROM jobs ");
		input = fields;
//		System.out.println("this is whereclause: "+fields);
//		System.out.println("in method");
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchJobsByFields(String choice, String field, String where ) throws SQLException, ClassNotFoundException {
		System.out.println(choice + " " + field + " " + where);
		//the where clause was coming over with an extra 8 commas
		where = where.replace(',' , ' ').trim(); 
		whereClause= ("WHERE " + field + "= '" + where + "'");
		fields= ("SELECT " + choice + " FROM jobs " + whereClause );
		input = fields;
		System.out.println("this is whereclause: "+fields);
		System.out.println("in method");
		
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchAllLocaByFields(String choice) throws SQLException, ClassNotFoundException {
		
		
		
		fields= ("SELECT " + choice + " FROM locations ");
		input = fields;
//		System.out.println("this is whereclause: "+fields);
//		System.out.println("in method");
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchLocaByFields(String choice, String field, String where ) throws SQLException, ClassNotFoundException {
		System.out.println(choice + " " + field + " " + where);
		//the where clause was coming over with an extra 8 commas
		where = where.replace(',' , ' ').trim(); 
		whereClause= ("WHERE " + field + "= '" + where + "'");
		fields= ("SELECT " + choice + " FROM locations " + whereClause );
		input = fields;
		System.out.println("this is whereclause: "+fields);
		System.out.println("in method");
		
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchAllProjByFields(String choice) throws SQLException, ClassNotFoundException {
		
		
		
		fields= ("SELECT " + choice + " FROM projects ");
		input = fields;
//		System.out.println("this is whereclause: "+fields);
//		System.out.println("in method");
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchProjByFields(String choice, String field, String where ) throws SQLException, ClassNotFoundException {
		System.out.println(choice + " " + field + " " + where);
		//the where clause was coming over with an extra 8 commas
		where = where.replace(',' , ' ').trim(); 
		whereClause= ("WHERE " + field + "= '" + where + "'");
		fields= ("SELECT " + choice + " FROM projects " + whereClause );
		input = fields;
		System.out.println("this is whereclause: "+fields);
		System.out.println("in method");
		
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchAllDeptByFields(String choice) throws SQLException, ClassNotFoundException {
		
		
		
		fields= ("SELECT " + choice + " FROM departments ");
		input = fields;
//		System.out.println("this is whereclause: "+fields);
//		System.out.println("in method");
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public ArrayList<ArrayList<String>> searchDeptByFields(String choice, String field, String where ) throws SQLException, ClassNotFoundException {
		System.out.println(choice + " " + field + " " + where);
		//the where clause was coming over with an extra 8 commas
		where = where.replace(',' , ' ').trim(); 
		whereClause= ("WHERE " + field + "= '" + where + "'");
		fields= ("SELECT " + choice + " FROM departments " + whereClause );
		input = fields;
		System.out.println("this is whereclause: "+fields);
		System.out.println("in method");
		
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", "student");
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public String createEmp(String choice, String fname, String lname, String dID, String jID, String password ) throws SQLException, ClassNotFoundException {
		//System.out.println(choice + " " +  " " + fname+" " + lname+ " " + dID + " " + jID);

		whereClause = ("'" + fname + "'," +"'" + lname + "',"+"'" + dID + "',"+"'" + jID + "'"  );

		fields= ("INSERT INTO employees (" + choice + ") VALUES (" + whereClause + ")" );
		System.out.println("this is whereclause: "+fields + password);
		//System.out.println("in method");
		
		input = fields;
		Class.forName(DRIVER_CLASS_NAME);
		//System.out.println("before conn");
		conn = DriverManager.getConnection(URL, "student", password);
		sql = input;
		//System.out.println("before statement");
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("after execute");

		
		conn.close();
		stmt.close();
		System.out.println("before leaving");
		return "You added an employee!";
		
		
	}
	public String deleteEmp(String id, String password ) throws SQLException, ClassNotFoundException {
		
		
		
		
		fields= ("DELETE FROM employees WHERE id=" + id + "" );
		System.out.println("this is whereclause: "+fields + password);
		//System.out.println("in method");
		
		input = fields;
		Class.forName(DRIVER_CLASS_NAME);
		//System.out.println("before conn");
		conn = DriverManager.getConnection(URL, "student", password);
		sql = input;
		//System.out.println("before statement");
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		//System.out.println("after execute");
		
		
		conn.close();
		stmt.close();
		//System.out.println("before leaving");
		return "You deleted an employee!";
		
		
	}	
	public ArrayList<ArrayList<String>> editEmpByID(String id, String password) throws SQLException, ClassNotFoundException {


		whereClause= ("WHERE id = " + id);
		fields= ("SELECT * FROM employees " + whereClause );
		input = fields;
//		System.out.println("this is whereclause: "+fields);
//		System.out.println("in method");
		Class.forName(DRIVER_CLASS_NAME);
		conn = DriverManager.getConnection(URL, "student", password);
		sql = input;
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		rsmd = rs.getMetaData();
		
		for (int i = 1; (i < rsmd.getColumnCount()+1); i++) {
			rowHeader.add((rsmd.getColumnName(i)));
		}
		al.add(rowHeader);
		while (rs.next()){
			rows = new ArrayList<>();
			for (int i=1; (i < rsmd.getColumnCount()+1) ; i++){
				rows.add(rs.getString(i));
			}
			al.add(rows);
		}
		
		rs.close();
		conn.close();
		stmt.close();
		return al;
	}
	public String updateEmp(String field, String where) throws SQLException, ClassNotFoundException {
		//System.out.println(choice + " " +  " " + fname+" " + lname+ " " + dID + " " + jID);


System.out.println(field + " " + where);
		fields= ("UPDATE employees SET (" + ") VALUES (" + whereClause + ")" );
		System.out.println("this is whereclause: "+fields );
		//System.out.println("in method");

		
		input = fields;
		Class.forName(DRIVER_CLASS_NAME);
		//System.out.println("before conn");
		conn = DriverManager.getConnection(URL, "student", "student");
		//sql = input;
		//System.out.println("before statement");
		//stmt = conn.createStatement();
		//stmt.executeUpdate(sql);
		System.out.println("after execute");

		
		conn.close();
		stmt.close();
		System.out.println("before leaving");
		return "You added an employee!";
		
		
	}

}
