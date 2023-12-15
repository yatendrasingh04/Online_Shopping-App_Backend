package com.online_store1.online_store1.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_store1.online_store1.Entities.AdminLogin;
import com.online_store1.online_store1.Repositories.AdminLoginRepository;
import com.online_store1.online_store1.Service.AdminLoginService;

@Service
public class AdminLoginServiceImpl  implements AdminLoginService {
	@Autowired
	AdminLoginRepository adminLoginRepository;
	
	@Override
	public String signup(AdminLogin AdminLogin) {
		adminLoginRepository.save(AdminLogin)	;
		return "Account has been created";
		}

	@Override
	public String login(String email, String password) {
		AdminLogin adminLogin=adminLoginRepository.findbyemailid(email);
		
		if(adminLogin!=null)
		{
			if(adminLogin.getPassword().equals(password))
		return "you are welcome";
				
				return "Invalid password";
		}
		else
			return "kindly create account";
	}

}


