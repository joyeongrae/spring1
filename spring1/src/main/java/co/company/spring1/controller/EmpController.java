package co.company.spring1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import co.company.spring1.dao.Deps;
import co.company.spring1.dao.Emp;
import co.company.spring1.dao.EmpMapper;
import co.company.spring1.dao.EmpSearch;
import co.company.spring1.dao.Jobs;
  
@Controller
public class EmpController {

	@Autowired
	EmpMapper dao;
	
	@RequestMapping("/ajax/jobSelect")
	@ResponseBody
	public List<Jobs> jobSelect(){
		return dao.jobSelect();
	}
	
	@ModelAttribute("jobs")
	public List<Jobs> jobs(){
		return dao.jobSelect();
	}
	@ModelAttribute("depts")
	public List<Deps> depts(){
		return dao.depSelect();
	}
	
	@RequestMapping(value="/empSelect",method=RequestMethod.GET)	
	public ModelAndView select(EmpSearch emp) {
		ModelAndView mav = new ModelAndView();
		//조회
		mav.addObject("list",dao.getEmpList(emp));
		mav.setViewName("emp/select");
		return mav;
	}
	 
	@GetMapping("/empinsertForm")
	public String insertForm(Model model,Emp emp) {
		
		return "emp/insert";
	}
	  
	@PostMapping("/empInsert")
	public String insert(Model model, Emp emp,Errors errors) {
		
		new EmpValidator().validate(emp, errors);
		if(errors.hasErrors()) {
			return "emp/insert";
		}
		if(emp.getEmployeeId() ==null)
		dao.insertEmp(emp);
		else
			dao.updateEmp(emp);
		//request.setAttribute("emp",emp);
		return "emp/insertOutput";
	}
	
	@GetMapping("/empUpdateForm")
	public String updateForm(Model model,Emp emp) {
		model.addAttribute("emp",dao.getEmp(emp));
		
		//model.addAttribute("depts",dao.depSelect());
		return "emp/insert";
	}
	
	
	
	
	
	
	
//	@PostMapping("/empInsert")
//	public String insert(HttpServletRequest request, 
//							  @RequestParam(value="lastName",
//											required=false,
//											defaultValue = "noname")
//											String lName,
//							  @RequestParam(required=false)
//											int salary,
//											Emp emp) {
//		//파라미터
//		String fName = request.getParameter("firstName");
//		System.out.println(lName+":"+fName+":"+salary);
//		System.out.println("emp\n"+emp);
//		//등록처리
//		//redirect
//		return "redirect:/empSelect";
//	}
	
}
