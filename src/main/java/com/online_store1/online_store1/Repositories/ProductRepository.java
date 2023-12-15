package com.online_store1.online_store1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online_store1.online_store1.Entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
