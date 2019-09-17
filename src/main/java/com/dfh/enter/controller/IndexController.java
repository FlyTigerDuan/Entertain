package com.dfh.enter.controller;

import javax.servlet.http.HttpServletRequest;

import com.dfh.enter.service.TUserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@Autowired
	private TUserService userService;
	@RequestMapping("/")
	public String index(HttpServletRequest req,Model model) {
		System.out.println("你好啊");
		return "hello";
	}

	@RequestMapping("/getUser")
	@ResponseBody
	public String GetUser(){
		Gson gson = new Gson();
		String result = gson.toJson(userService.findAll());
		return result;
	}

}
