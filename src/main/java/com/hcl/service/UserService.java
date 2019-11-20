package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.DTO.UserDTO;
import com.hcl.dao.UserDAO;
import com.hcl.model.User;

@Service
public class UserService {

	@Autowired
	private UserDAO ser;
	
	public String register(UserDTO dto) {
		
		User u=new User();
		u.setUser_id(dto.getUser_id());
		u.setU_name(dto.getU_name());
		u.setU_password(dto.getU_password());
	Object obj=ser.save(u);
	if(obj==null)return"User Registration Failed";
	else return "User Registration Successfull"+u.getU_name();
		
		
		
		
	}
	
}
