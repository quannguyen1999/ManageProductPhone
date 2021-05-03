package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "product")
public class ProductController {
	@RequestMapping(value = "add")
	public String addProduct(Model model) {
		model.addAttribute("content", "Product");
		return "product";
	}
}
