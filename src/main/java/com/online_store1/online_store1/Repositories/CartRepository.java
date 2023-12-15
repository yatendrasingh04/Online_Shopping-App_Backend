package com.online_store1.online_store1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online_store1.online_store1.Entities.Cart;

public interface CartRepository extends JpaRepository<Cart,Long>{

}
