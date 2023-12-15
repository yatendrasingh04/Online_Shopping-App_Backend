package com.online_store1.online_store1.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_store1.online_store1.Entities.AdminLogin;
import com.online_store1.online_store1.Repositories.AdminLoginRepository;
import com.online_store1.online_store1.Service.AdminLoginService;

@Service
public class AdminLoginServiceImpl  implements AdminLoginService {
	@Autowired
	AdminLoginRepository AdminLoginRepository;
	
	@Override
	public String signup(AdminLogin AdminLogin) {
		AdminLoginRepository.save(AdminLogin)	;
		return "Account has been created";
		}

	@Override
	public String login(String email, String password) {
		AdminLogin AdminLogin=com.online_store1.online_store1.Repositories.AdminLoginRepository.findbyemailid(email);
		
		if(AdminLogin!=null)
		{
			if(AdminLogin.getPassword().equals(password))
		return "you are welcome";
				
				return "Invalid password";
		}
		else
			return "kindly create account";
	}

}


