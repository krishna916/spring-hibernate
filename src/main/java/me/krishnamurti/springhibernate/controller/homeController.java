package me.krishnamurti.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import me.krishnamurti.springhibernate.model.User;
import me.krishnamurti.springhibernate.service.DepartmentService;
import me.krishnamurti.springhibernate.service.RoleService;
import me.krishnamurti.springhibernate.service.UserService;

@Controller
public class homeController {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String getHome(Model model) {
		System.out.println("In controller");
		model.addAttribute("roles", roleService.findAll());
		model.addAttribute("departments", departmentService.findAll());
		model.addAttribute("user", new User());
		model.addAttribute("users", userService.findAll());
		return "index";
	}
	
}
