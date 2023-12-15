package com.online_store1.online_store1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_store1.online_store1.Entities.AdminLogin;
import com.online_store1.online_store1.Service.AdminLoginService;

@RestController
@RequestMapping("/api/AdminLogin")	
public class AdminLogincontroller {
@Autowired
AdminLoginService AdminLoginService;

@PostMapping("/signup")
public String signup(@RequestBody AdminLogin AdminLogin)
{
	return AdminLoginService.signup(AdminLogin);
}

@GetMapping("/search/{email}/{password}")
public ResponseEntity<String> login(@PathVariable String email, @PathVariable String password)
{
	return ResponseEntity.ok(AdminLoginService.login(email, password));
}
}

