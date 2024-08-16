package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeService empService;
   @GetMapping("/")
   public String showHome() {
	   //return LVN
	   return "home";
   }
   @GetMapping("/emp_report")
   public String showEmployeeReport(Map<String,Object> map) {
	   //use service
	   Iterable<Employee> emps=empService.getAllEmployees();
	   //put result in model attribute
	   map.put("empList", emps);
	   //return LVN
	   return "show_employee_report";
   }
   @GetMapping("emp_add")
   public String showFormForSaveEmployee(@ModelAttribute("emp") Employee emp) {
	   //return LVN
	   return "register_employee";
   }
   @PostMapping("/emp_add")
   public String saveEmployee(@ModelAttribute("emp") Employee emp,
		                                  RedirectAttributes attrs) {
	   //use service
	   String msg=empService.registerEmployee(emp);
	   //Keep the result in Flash Attribute
	   attrs.addFlashAttribute("resultmsg", msg);
	   //return LVN
	   return "redirect:emp_report";
   }
   
   @GetMapping("/emp_edit")
   public String showEditEmployeeFormPage(@RequestParam("no") int no, Model model) {
	   //use service
       Employee emp = empService.getEmployeeBYNo(no);
       //copy data
       model.addAttribute("emp", emp);
       //return LVN
       return "update_employee";
   }
   @PostMapping("emp_edit")
   public String editEmployee(RedirectAttributes attrs,
		                       @ModelAttribute("emp") Employee emp) {
	   //use service
	   String msg=empService.updateEmployee(emp);
	   //add the result to redirect attributes
	   attrs.addAttribute("resultmsg",msg);
	   //return LVN
	   return "redirect:emp_report";
   }
   @GetMapping("/emp_delete")
   public String deleteEmployee(RedirectAttributes attrs,
		                      @RequestParam int no) {
	   //use service
	   String msg=empService.deleteEmployeeById(no);
	   //keep the result in flash attribute
	   attrs.addFlashAttribute("resultmsg", msg);
	   //return LVN
	   return "redirect:emp_report";
   }
}

