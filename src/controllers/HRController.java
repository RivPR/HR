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
	
	
	
	
}
