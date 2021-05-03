package com.main.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HandleErrorController implements ErrorController {
	public static String PAGE_ERROR = "error";
	
	@RequestMapping("/error")
	public String handleError(HttpServletRequest request) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		Integer statusCode = Integer.valueOf(status.toString());
		try {
			if (statusCode == HttpStatus.FORBIDDEN.value()) {
				request.setAttribute("error", "401");
			} else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				request.setAttribute("error", "500");
			}
		} catch (Exception e) {
			System.out.println("ok");
			request.setAttribute("error", "404");
		}
		return "error";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}