package com.controller;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController{
	private Logger logger  = LoggerFactory.getLogger(this.getClass());
	
	@PostConstruct
	public void init() {
		logger.info ("-------------- >>>>>>>>>>>>>>>>>>>>>> INIT " + BaseController.class.getName() + " <<<<<<<<<<<<<<<<<<<< ----------------");
	}
	
   @RequestMapping(value="/ping", method=RequestMethod.GET)
   public @ResponseBody String printHello() {
      return "ping";
   }
   
}
