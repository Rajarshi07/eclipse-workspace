package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.EmplDao;
import com.spring.model.Empl;

public class EmplController {
	@Autowired
	EmplDao emplDao;

	@RequestMapping("/emplform")
	public String showform(Model m) {
		m.addAttribute("command", new Empl());
		return "emplform";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute("empl") Empl empl) {
		emplDao.insert(empl);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value = "editempl/{id}")
	public String edit(@PathVariable int id) {
		
	}

	public EmplController() {
		// TODO Auto-generated constructor stub
	}

}
