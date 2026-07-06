package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.company.model.Department;
import com.company.service.DepartmentService;



@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService departmentservice;
	
	@GetMapping("/alldepartments")
	public String getalldepartments(Model model) {
		
		model.addAttribute("listdepartments", departmentservice.getAllDepartments());
		return "View_Departments";
	}
	
	@GetMapping("/newdepartment")
	public String newDepartment(Model model) {
		
		Department department=new Department();
		model.addAttribute("department", department);
		return "New_Department";
	}
	@PostMapping("/savedepartment")
	public String saveDepartment(@ModelAttribute("department")Department department)
	{
		departmentservice.saveDepartment(department);
		return "redirect:/alldepartments";
	}
	
	@GetMapping("/updatedepartment/{id}")
	public String updateDepartment(@PathVariable(value="id")Long id,Model model)
	{
		Department department=departmentservice.getDepartmentById(id);
		model.addAttribute("department", department);
		
		return "Update_department";
	}
	
	@GetMapping("/deletedepartment/{id}")
	public String  deleteDepartment(@PathVariable(value="id")Long id)
	{
		
	departmentservice.deleteDepartmentById(id);
		return "redirect:/alldepartments";
		
	}
}
