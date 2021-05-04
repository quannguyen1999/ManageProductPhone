package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.model.Product;

@Controller
@RequestMapping(value = "product")
public class ProductController {
	
	@RequestMapping(value = "add")
	public String addProduct(Model model) {
		model.addAttribute("product", new Product());
		return "addProduct";
	}
	
//	add-process
	@RequestMapping(value = "add-process",method = RequestMethod.POST)
	public String addProcessProduct(Product product) {
		System.out.println(product);
		return "redirect:/add";
	}

}
