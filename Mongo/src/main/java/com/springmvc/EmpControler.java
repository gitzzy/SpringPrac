package com.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class EmpControler {

	@Autowired
	EmpService service;
	
	@PostMapping("/End")
	public String AddData(@ModelAttribute Employee emp) {
		
		service.AddEmp(emp);
		
		return "End";
	}
	
	@GetMapping("/End")
	public String AddData() {
		
		return "End";
	}
}

