package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/show-result")
	public String showResult(String num1, String num2) {
		int intNum1 = Integer.parseInt(num1);
		int intNum2 = Integer.parseInt(num2);
		int ans = intNum1 + intNum2;
		String formula = num1 + "+" + num2 + "=" + ans;
		
		session.setAttribute("answer", formula);
		
		return "exam02-result";
	}
	
	@RequestMapping("/show-result2")
	public String showResult2() {
		return "exam02-result2";
	}
}
