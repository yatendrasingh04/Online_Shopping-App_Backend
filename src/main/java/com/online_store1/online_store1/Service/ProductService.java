package com.online_store1.online_store1.Service;

import java.util.List;

import com.online_store1.online_store1.Entities.Product;
import com.online_store1.online_store1.Entities.Cart;
import com.online_store1.online_store1.Entities.Customer;

public interface ProductService {
	
//STEP 1 CREATING
Product createProduct(Product product);
	
//STEP 2 FETCHING
List<Product>getAll();

//STEP 3 FOR FINDING ROW ON THE BASIS OF ID

Product findProductById(Long id);

//STEP 4 FOR UPDATING ROW ON THE BASIS OF ID

Product updateProduct(Long id,Product product);
	
//STEP 5 FOR DELETING ROW ON THE BASIS OF ID
String deleteProduct(Long id);



String orderProduct(Customer customer);
List<Cart> orderDetails(Long orderno);
}