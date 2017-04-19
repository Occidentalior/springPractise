package com.tiza.zz.controller;

import com.tiza.zz.pojo.User;
import com.tiza.zz.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@Controller
public class IndexController {
	private Logger loger = Logger.getLogger(IndexController.class);
	@Resource
	private UserService userService;
	
	@RequestMapping("/index.html")
    public String index() {
		loger.debug("IndexController index.userService:" +userService );
        return "index";
    }
	@RequestMapping("/register.html")
	public String register(){
		return "register";
	}
	@RequestMapping("/exit.html")
    public String exit() {
		loger.debug("IndexController exit.");
        return "exit";
    }
	@RequestMapping("/login.html")
	public String login(){
		return "login";
	}
	@RequestMapping("/loginsuccess.html")
    public ModelAndView  loginsuccess(User user) {
		loger.debug("IndexController login.username : " + user.getUserName()
				+ " --- password:"+user.getPassword());
		
		user = userService.getUser(user);
		
		loger.debug("select username : " + user.getUserName()
				+ " --- password:"+user.getPassword());
        return new ModelAndView("loginsuccess");
    }
	
	@RequestMapping("/regsuccess.html") 
	public ModelAndView regsuccess(User user){
		 loger.debug("IndexController register.username : " + user.getUserName()
				 + "---- password: " + user.getPassword());
		  int f = userService.insertUser(user);
		  if(f > 0){
			   user = userService.getUser(user);
		  }
		  return new ModelAndView("regsuccess");
	}
	
	
}
