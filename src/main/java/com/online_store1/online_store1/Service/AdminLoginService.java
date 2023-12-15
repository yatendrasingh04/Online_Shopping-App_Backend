package com.online_store1.online_store1.Service;

import com.online_store1.online_store1.Entities.AdminLogin;

public interface AdminLoginService {
	String signup(AdminLogin AdminLogin);
	String login(String email, String password);
}
