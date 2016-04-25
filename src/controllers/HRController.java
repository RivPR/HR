package controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.HRDao;

@Controller
public class HRController {
	public static String fields;
	public static String whereClause;
	private ArrayList<ArrayList<String>> al = new ArrayList<>();
	private ArrayList<String> header = new ArrayList<>();
	
	@Autowired
	private HRDao hrDao;
	
	
	@RequestMapping(path="getAllEmployeesByFields.do", params="getit")
	public ModelAndView getEmpByFields(@RequestParam("fieldChoice") String choice, @RequestParam("option") String field, @RequestParam("where") String where ) throws ClassNotFoundException, SQLException{
		where = where.replace(',' , ' ').trim(); 
		//System.out.println("This is the choices "+choice+" "+ field+" "+ where);
		hrDao = new HRDao(choice, "employees");
		al=hrDao.searchEmpByFields(choice, field, where);
		//System.out.println(al.toString());
		header = al.get(0);
		al.remove(0);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getEmployeeByID.do", params="submitID")
	public ModelAndView getEmpByID(@RequestParam("id") String id) throws ClassNotFoundException, SQLException{
		
		hrDao = new HRDao(id);
		al = hrDao.searchEmpByID(id);
		header = al.get(0);
		//al.remove(0);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("header", header);
		mv.addObject("table", al);
		mv.addObject("field", id);
		return mv;
	}
	@RequestMapping(path="getAllEmployeesByFields.do", params="allByField")
	public ModelAndView getAllEmpsByFields(@RequestParam("fieldChoice") String choice) throws ClassNotFoundException, SQLException{
		
		
		hrDao = new HRDao(choice, "employees");
		al = hrDao.searchAllEmpByFields(choice);
		header = al.get(0);
		al.remove(0);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllAssignmentsByFields.do", params="allByField")
	public ModelAndView getAllAssByFields(@RequestParam("fieldChoice") String choice) throws ClassNotFoundException, SQLException{
		
		
		hrDao = new HRDao(choice, "assignments");
		al = hrDao.searchAllAssByFields(choice);
		header = al.get(0);
		al.remove(0);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllAssignmentsByFields.do", params="getit")
	public ModelAndView getAssByFields(@RequestParam("fieldChoice") String choice, @RequestParam("option") String field, @RequestParam("where") String where ) throws ClassNotFoundException, SQLException{
		where = where.replace(',' , ' ').trim(); 
		//System.out.println("This is the choices "+choice+" "+ field+" "+ where);
		hrDao = new HRDao(choice, "assignments");
		al=hrDao.searchAssByFields(choice, field, where);
		//System.out.println(al.toString());
		header = al.get(0);
		al.remove(0);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllJobsByFields.do", params="allByField")
	public ModelAndView getAllJobsByFields(@RequestParam("fieldChoice") String choice) throws ClassNotFoundException, SQLException{
		
		System.out.println("this is the choice: " +choice);
		hrDao = new HRDao(choice, "jobs");
		al = hrDao.searchAllJobsByFields(choice);
		header = al.get(0);
		al.remove(0);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllJobsByFields.do", params="getit")
	public ModelAndView getJobsByFields(@RequestParam("fieldChoice") String choice, @RequestParam("option") String field, @RequestParam("where") String where ) throws ClassNotFoundException, SQLException{
		where = where.replace(',' , ' ').trim(); 
		System.out.println("This is the choices "+choice+" "+ field+" "+ where);
		hrDao = new HRDao(choice, "jobs");
		al=hrDao.searchJobsByFields(choice, field, where);
		System.out.println(al.toString());
		header = al.get(0);
		al.remove(0);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllLocaByFields.do", params="allByField")
	public ModelAndView getAllLocaByFields(@RequestParam("fieldChoice") String choice) throws ClassNotFoundException, SQLException{
		
		//System.out.println("this is the choice: " +choice);
		hrDao = new HRDao(choice, "locations");
		al = hrDao.searchAllLocaByFields(choice);
		header = al.get(0);
		al.remove(0);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllLocaByFields.do", params="getit")
	public ModelAndView getLocaByFields(@RequestParam("fieldChoice") String choice, @RequestParam("option") String field, @RequestParam("where") String where ) throws ClassNotFoundException, SQLException{
		where = where.replace(',' , ' ').trim(); 
		//System.out.println("This is the choices "+choice+" "+ field+" "+ where);
		hrDao = new HRDao(choice, "jobs");
		al=hrDao.searchLocaByFields(choice, field, where);
		System.out.println(al.toString());
		header = al.get(0);
		al.remove(0);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllProjByFields.do", params="allByField")
	public ModelAndView getAllProjByFields(@RequestParam("fieldChoice") String choice) throws ClassNotFoundException, SQLException{
		
		//System.out.println("this is the choice: " +choice);
		hrDao = new HRDao(choice, "projects");
		al = hrDao.searchAllProjByFields(choice);
		header = al.get(0);
		al.remove(0);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllProjByFields.do", params="getit")
	public ModelAndView getProjByFields(@RequestParam("fieldChoice") String choice, @RequestParam("option") String field, @RequestParam("where") String where ) throws ClassNotFoundException, SQLException{
		where = where.replace(',' , ' ').trim(); 
		//System.out.println("This is the choices "+choice+" "+ field+" "+ where);
		hrDao = new HRDao(choice, "projects");
		al=hrDao.searchProjByFields(choice, field, where);
		System.out.println(al.toString());
		header = al.get(0);
		al.remove(0);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllDeptByFields.do", params="allByField")
	public ModelAndView getAllDeptByFields(@RequestParam("fieldChoice") String choice) throws ClassNotFoundException, SQLException{
		
		//System.out.println("this is the choice: " +choice);
		hrDao = new HRDao(choice, "departments");
		al = hrDao.searchAllDeptByFields(choice);
		header = al.get(0);
		al.remove(0);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="getAllDeptByFields.do", params="getit")
	public ModelAndView getDeptByFields(@RequestParam("fieldChoice") String choice, @RequestParam("option") String field, @RequestParam("where") String where ) throws ClassNotFoundException, SQLException{
		where = where.replace(',' , ' ').trim(); 
		//System.out.println("This is the choices "+choice+" "+ field+" "+ where);
		hrDao = new HRDao(choice, "departments");
		al=hrDao.searchDeptByFields(choice, field, where);
		System.out.println(al.toString());
		header = al.get(0);
		al.remove(0);		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", choice);
		return mv;
	}
	@RequestMapping(path="createEmp.do", params="getit")
	public ModelAndView createEmp(@RequestParam("option") String choice, @RequestParam("fname") String fname, 
			                      @RequestParam("lname") String lname, @RequestParam("dID") String dID, 
			                      @RequestParam("jID") String jID, @RequestParam("pass")String password ) throws ClassNotFoundException, SQLException{
		//where = where.replace(',' , ' ').trim(); 
		//System.out.println("This is the choices "+choice+" "+ field+" "+ where);
		hrDao = new HRDao(choice, "employees");
		System.out.println("before sending to DAO");
		hrDao.createEmp(choice, fname, lname, dID, jID, password);
		System.out.println("back in create emp");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	@RequestMapping(path="deleteEmp.do", params="getit")
	public ModelAndView deleteEmp(@RequestParam("id") String id, @RequestParam("pass") String pass) throws ClassNotFoundException, SQLException{
		
		
		hrDao = new HRDao(id, "employees");
		hrDao.deleteEmp(id, pass);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");

		return mv;
	}
	@RequestMapping(path="editEmp.do", params="submitID")
	public ModelAndView EditEmpByID(@RequestParam("id") String id, @RequestParam("pass") String pass) throws ClassNotFoundException, SQLException{
		
		hrDao = new HRDao(id);
		al = hrDao.editEmpByID(id, pass);
		header = al.get(0);
		al.remove(0);
		ModelAndView mv = new ModelAndView();
		System.out.println("AL: " + al.toString());
		mv.setViewName("edit.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		mv.addObject("field", id);
		return mv;
	}
	@RequestMapping(path="updateEmp.do", params="submitID")
	public ModelAndView UpdateEmp(@RequestParam("option") String field, @RequestParam("where") String where) throws ClassNotFoundException, SQLException{
		
		hrDao = new HRDao(field);
		hrDao.updateEmp(field, where);
		
	
		ModelAndView mv = new ModelAndView();

		mv.setViewName("index.jsp");
		mv.addObject("head", header);
		mv.addObject("table", al);
		return mv;
	}
	
	
}
