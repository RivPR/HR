package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controllers.HRController;

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
}
