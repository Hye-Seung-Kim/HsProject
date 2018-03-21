package com.goodplace.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerB {
		
	@RequestMapping("/worst")
	public ModelAndView viewWorst() {
		
		ModelAndView worstList = new ModelAndView("worst");
		List<String> foodList = new ArrayList<String>();
		foodList.add("칼국수");
		foodList.add("수제비");
		
		worstList.addObject("foodList", foodList);
		return worstList;
	}
}
