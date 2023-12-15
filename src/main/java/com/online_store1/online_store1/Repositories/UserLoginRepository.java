package com.online_store1.online_store1.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.online_store1.online_store1.Entities.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long>{
@Query(value="select * from User_login ul where ul.email =(:query)", nativeQuery=true)
	
	UserLogin findbyemailid(String query);

}
