package com.pitang.challengeapp.service;

import com.pitang.challengeapp.model.User;

public interface UserService {

	void saveOrUpdate(User user);
	
	User loginUser(String email, String password);
	
	User findByUserEmail(String email);
}
