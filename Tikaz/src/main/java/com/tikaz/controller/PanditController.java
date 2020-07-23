package com.tikaz.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tikaz.entity.PanditProfile;
import com.tikaz.repository.PanditRepository;

@Controller
public class PanditController {

	@Autowired
	private PanditRepository panditData;

	@RequestMapping(value = "/getPandit", method = RequestMethod.GET)
	@ResponseBody
	public String getPandit() {
		String result = panditData.findOne(1L).getfName();
		return result;
	}

	@RequestMapping(value = "/savePandit", method = RequestMethod.GET)
	@ResponseBody
	public String savePandit() {
		PanditProfile p1 = new PanditProfile();
		p1.setfName("Ghan");
		p1.setmName("Shyam");
		p1.setlName("Lamichhane");
		p1.setEmail("ghan@gmail.com");
		p1.setUsername("ghan");
		p1.setPassword("ghanpass");
		p1.setQualification("MS");
		p1.setCreatedOn(new Date());
		PanditProfile  p = panditData.save(p1);
		return p.getfName();
	}
	
	@RequestMapping(value = "/getPanditByName", method = RequestMethod.GET)
	@ResponseBody
	public String getbyName(String name) {
		String result = panditData.findbyName(name).getfName();
		return result;
	}
	
	

}
