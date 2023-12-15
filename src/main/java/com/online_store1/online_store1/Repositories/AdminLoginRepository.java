package com.online_store1.online_store1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online_store1.online_store1.Entities.AdminLogin;

public interface AdminLoginRepository extends JpaRepository<AdminLogin, Long>{
@Query(value="select * from Admin_login ul where ul.email =(:query)", nativeQuery=true)
static
	
	AdminLogin findbyemailid(String query) {
	// TODO Auto-generated method stub
	return null;
}

}
