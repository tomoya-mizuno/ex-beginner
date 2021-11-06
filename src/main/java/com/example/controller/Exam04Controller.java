package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Exam04User;
import com.example.form.Exam04Form;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@ModelAttribute
	public Exam04Form setUpForm() {
		return new Exam04Form();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/show-result")
	public String showResult(@Validated Exam04Form form, BindingResult result, Model model) {
		if (result.hasErrors()) return index();
		
		Exam04User user = new Exam04User();
		BeanUtils.copyProperties(form, user);
		
		model.addAttribute("user", user);
		
		return "exam04-result";
	}
}
