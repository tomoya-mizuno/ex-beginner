package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/show-result")
	public String showResult(String item1, String item2, String item3, Model model) {
		int priceItem1 = Integer.parseInt(item1);
		int priceItem2 = Integer.parseInt(item2);
		int priceItem3 = Integer.parseInt(item3);
		
		int totalPriceWithoutTax = priceItem1 + priceItem2 + priceItem3;
		int totalPriceIncludeTax = totalPriceWithoutTax * 110 / 100;
		
		model.addAttribute("priceWithoutTax", totalPriceWithoutTax);
		model.addAttribute("priceIncludeTax", totalPriceIncludeTax);
		
		return "exam03-result";
	}
}
