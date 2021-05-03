package com.main.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("content", "Mobile content");
		request.setAttribute("content-info", "mobile content");
		return "login";
	}

}
