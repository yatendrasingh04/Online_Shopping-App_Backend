package com.online_store1.online_store1.Service;

import java.util.List;

import com.online_store1.online_store1.Entities.Customer;


public interface CustomerService {
	Customer createCustomer(Customer customer);
	List<Customer>getAll();

	//STEP 3 FOR FINDING ROW ON THE BASIS OF ID

	Customer findCustomerById(Long id);

	//STEP 4 FOR UPDATING ROW ON THE BASIS OF ID

	Customer updateCustomer(Long id,Customer customer);
		
	//STEP 5 FOR DELETING ROW ON THE BASIS OF ID
	String deleteCustomer(Long id);
}
