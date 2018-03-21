package com.goodplace.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerA {

	@RequestMapping("/best")
	public ModelAndView viewBestPage() {
		
		ModelAndView bestView = new ModelAndView("best");
		//모델, 뷰 부터 만들어주고 시작해야됨
		List<String> foodList = new ArrayList<String>();
		foodList.add("초밥");
		foodList.add("라멘");
		foodList.add("감바스");
		
		
		bestView.addObject("foodList", foodList);
		return bestView;
	}
	
}
