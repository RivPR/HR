package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HRController {

	
	@RequestMapping("getEmployeeByID.do")
	public ModelAndView getEmpByID(@RequestParam("id") int id){
		int out = id;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results.jsp");
		mv.addObject("passedObj", out);
		return mv;
	}
}
