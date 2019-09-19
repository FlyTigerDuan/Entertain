package com.dfh.enter.controller;

import javax.jms.Queue;
import javax.jms.Topic;
import javax.servlet.http.HttpServletRequest;

import com.dfh.enter.jms.JMSProducer;
import com.dfh.enter.service.TUserService;
import com.dfh.enter.service.impl.RedisService;
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
	@Autowired
	private RedisService redisService;
	@Autowired
	private JMSProducer jmsProducer;
	@Autowired
	private Topic topic;
	@Autowired
	private Queue queue;
	@RequestMapping("/")
	public String index(HttpServletRequest req,Model model) {
		redisService.set("aaa","你好啊");
		System.out.println("你好啊");
		return redisService.get("aaa",String.class);
	}

	@RequestMapping("/getUser")
	@ResponseBody
	public String GetUser(){
		Gson gson = new Gson();
		String result = gson.toJson(userService.findAll());
		return result;
	}

	@RequestMapping("/sendeMessage")
	public String sendeMessage(HttpServletRequest req,Model model) {
		for (int i=0;i<10;i++) {
			jmsProducer.sendMessage(queue,"queue,world!" + i);
			jmsProducer.sendMessage(topic, "topic,world!" + i);
		}
		return "消息发送成功";
	}

}
