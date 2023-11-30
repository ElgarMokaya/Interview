package com.example.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.example.model.UserInfo;
import com.example.example.repositories.UserInfoRepository;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public String addUser(UserInfo userInfo) {
		try {
			//encode password before saving to the database
			userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
			userInfoRepository.save(userInfo);
			
			return "User added successfully";
		}catch (Exception e){
			e.printStackTrace();
			return "Error while adding the user to the system";
			
		}
	}
}
