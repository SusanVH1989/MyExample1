package com.sus.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	
	@RequestMapping(value="/welcome.do",method=RequestMethod.GET)
	public String welcome(){
		return "welcome";
	}

}
