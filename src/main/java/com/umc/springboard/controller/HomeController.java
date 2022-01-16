package com.umc.springboard.controller;

import com.umc.springboard.model.SampleData;
import com.umc.springboard.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String home() {
		return "OK";
	}

	@RequestMapping(value="/Greet", method=RequestMethod.GET)
	public ModelAndView greet() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("data", homeService.getSampleData());
		mav.addObject("now", LocalDate.now().toString());
		mav.setViewName("greet");

		return mav;
	}

	@RequestMapping(value="/SampleData", method=RequestMethod.GET)
	@ResponseBody
	public SampleData getSampleData() {
		SampleData sampleData = homeService.getSampleData();
		return sampleData;
	}

}
