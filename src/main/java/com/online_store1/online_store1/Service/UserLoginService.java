package com.online_store1.online_store1.Service;

import com.online_store1.online_store1.Entities.UserLogin;

public interface UserLoginService {
	String signup(UserLogin userLogin);
	String login(String email, String password);
}
