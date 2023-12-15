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

import com.online_store1.online_store1.Entities.Customer;
import com.online_store1.online_store1.Entities.Product;
import com.online_store1.online_store1.Service.CustomerService;



@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@PostMapping("/create")
	public Customer createCustomer(@RequestBody Customer customer) 
	{
		return customerService.createCustomer(customer);
	}

	
	@GetMapping("/show")
	public List<Customer> getAll()
	{
		return customerService.getAll();
	}

	//STEP 3 FOR FINDING ROW ON THE BASIS OF ID

	@GetMapping("/find/{id}")
	public Customer findById(@PathVariable Long id) {
		return customerService.findCustomerById( id);
	}

	//STEP 4 FOR UPDATING ROW ON THE BASIS OF ID
	@PutMapping("/update/{id}")
	public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer)
	{
		return customerService.updateCustomer(id,customer);
	}

	//STEP 5 FOR DELETING ROW ON THE BASIS OF ID
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		return customerService.deleteCustomer(id);
	}

	
}
