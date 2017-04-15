package com.cw.cramer.core.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	/**
	 * 页面
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/")
	public ModelAndView  toLogin(HttpServletRequest request, Model model) {
		return new ModelAndView("index");
	}
	
}
