package me.krishnamurti.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import me.krishnamurti.springhibernate.model.User;
import me.krishnamurti.springhibernate.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/user")
	public String addUser(@ModelAttribute("user") User user, Model model, BindingResult bindingResult) {
		userService.save(user);
		model.addAttribute("users", userService.findAll());
		return "index";
	}
	
	@GetMapping("/user/{userId}/edit")
	public String editUser(@PathVariable("userId") Long userId) {
		return "index";
	}
	
	@GetMapping("/user/{userId}/delete")
	public String deleteUser(@PathVariable("userId") Long userId, Model model) {
		userService.deleteById(userId);
		return "redirect:/";
	}
}
