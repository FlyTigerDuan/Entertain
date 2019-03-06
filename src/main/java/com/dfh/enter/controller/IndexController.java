package com.dfh.enter.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(HttpServletRequest req,Model model) {
		System.out.println("你好啊");
		model.addAttribute("hah", "haha");
		return "hello";
	}

	

}
