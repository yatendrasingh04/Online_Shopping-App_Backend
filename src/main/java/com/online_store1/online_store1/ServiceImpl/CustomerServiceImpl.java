package com.online_store1.online_store1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_store1.online_store1.Entities.Customer;
import com.online_store1.online_store1.Entities.Product;
import com.online_store1.online_store1.Repositories.CustomerRepository;
import com.online_store1.online_store1.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	 @Autowired
     CustomerRepository customerRepository;
	@Override
	public Customer createCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}
	@Override
	public List<Customer> getAll() {
		
		return  customerRepository.findAll();
	}
	@Override
	public Customer findCustomerById(Long id) {
		
		return customerRepository.findById(id).get();
	}
	@Override
	public Customer updateCustomer(Long id, Customer customer) {
		Customer c=customerRepository.findById(id).get();
		c.setOrderno(customer.getOrderno());
		c.setPhone(customer.getPhone());
		c.setTotalPrice(customer.getTotalPrice());
		return customerRepository.save(c);
	}
	@Override
	public String deleteCustomer(Long id) {
		customerRepository.deleteById(id);
		return "Your Record has been deleted";
	}

}
