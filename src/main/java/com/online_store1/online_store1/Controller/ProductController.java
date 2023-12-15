package com.online_store1.online_store1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online_store1.online_store1.Entities.Product;
import com.online_store1.online_store1.Service.ProductService;
import com.online_store1.online_store1.Entities.Cart;
import com.online_store1.online_store1.Entities.Customer;

@RestController
@RequestMapping("/api/product")

public class ProductController {

@Autowired
ProductService productService;
@PostMapping("/create")
public Product createProduct(@RequestBody Product product) 
{
	return productService.createProduct(product);
}

//STEP 2 FETCHING
@GetMapping("/show")
public List<Product> getAll()
{
	return productService.getAll();
}

//STEP 3 FOR FINDING ROW ON THE BASIS OF ID

@GetMapping("/find/{id}")
public Product findById(@PathVariable Long id) {
	return productService.findProductById( id);
}

//STEP 4 FOR UPDATING ROW ON THE BASIS OF ID
@PutMapping("/update/{id}")
public Product updateProduct(@PathVariable Long id, @RequestBody Product product)
{
	return productService.updateProduct(id, product);
}

//STEP 5 FOR DELETING ROW ON THE BASIS OF ID
@DeleteMapping("/delete/{id}")
public String deleteProduct(@PathVariable Long id) {
	return productService.deleteProduct(id);
}



@PostMapping("/orderproduct")
public String orderProduct(@RequestBody Customer customer)
{
	   return productService.orderProduct(customer);
}

@GetMapping("/displayorder/{orderno}")
public List<Cart> orderDetails(@PathVariable Long orderno)
{
	   return productService.orderDetails(orderno);
}
}


