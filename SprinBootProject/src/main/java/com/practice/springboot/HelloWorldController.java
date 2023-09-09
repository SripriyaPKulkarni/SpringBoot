package com.practice.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView showMessage(
	@RequestParam(value = "name", required = false, defaultValue = "World") String name) {

	   ModelAndView mv = new ModelAndView("hello");
	   mv.addObject("name", name);
	   return mv;

	}
}
