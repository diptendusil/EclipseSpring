package com.pack;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping(value="/")
	public String home(ModelMap m) {
		Date d = new Date();
		m.addAttribute("now", d);
		
		return "index";
	}
	
	@RequestMapping(value="/message")
	@ResponseBody
	public String message() {
		 
		return "Hello World";
	}
	
}
