package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.DTO.UserDTO;
import com.hcl.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService us;
	
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	public ModelAndView user() {
	
		UserDTO dto=new UserDTO();
		String s=us.register(dto);
		
		return new ModelAndView("registered", "msg", s);
		
			}

	
}
