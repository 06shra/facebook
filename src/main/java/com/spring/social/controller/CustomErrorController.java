package com.spring.social.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomErrorController implements ErrorController{
	@RequestMapping("/error")
    public String handleError(Model model) {
        // Add custom error handling logic and populate the model as needed
        model.addAttribute("errorMessage", "An error occurred");
        return "error"; // Return the name of the error template
    }

    public String getErrorPath() {
        return "/error";
    }

}
