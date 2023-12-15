package com.online_store1.online_store1.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_store1.online_store1.Entities.Product;

import com.online_store1.online_store1.Repositories.ProductRepository;

import com.online_store1.online_store1.Service.ProductService;
import com.online_store1.online_store1.Entities.ProductException;
import com.online_store1.online_store1.Entities.Cart;
import com.online_store1.online_store1.Entities.Customer;
import com.online_store1.online_store1.Repositories.CartRepository;
import com.online_store1.online_store1.Repositories.CustomerRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
     @Autowired
     ProductRepository productRepository;
     
    
   
    
     @Autowired
 	CartRepository cartRepository;
 	
 	@Autowired 
 	CustomerRepository customerRepository;

	@Override
	public Product createProduct(Product product)  //adding recording into our table
	{
		
		return productRepository.save(product);
	}

	//STEP 2 FETCHING
	@Override
	public List<Product> getAll() {
		
		return productRepository.findAll();
	}
	
	//STEP 3 FOR FINDING ROW ON THE BASIS OF ID

	@Override
	public Product findProductById(Long id) {
		
		return productRepository.findById(id).get();
	}

	//STEP 4 FOR UPDATING ROW ON THE BASIS OF ID
	
	@Override
	public Product updateProduct(Long id, Product product) {
		Product p=productRepository.findById(id).get();
		p.setName(product.getName());
		p.setStk(product.getStk());
		p.setPrice(product.getPrice());
		return productRepository.save(p);
		
	}

	
	//STEP 5 FOR DELETING ROW ON THE BASIS OF ID
	@Override
	public String deleteProduct(Long id) {
		productRepository.deleteById(id);
		return "Your Record has been deleted";
	}

	@Override
	public String orderProduct(Customer customer) {
		List<Cart> cart=customer.getCart();
		Double sum=0.00;
	
		
		for(Cart i:cart)
		{
		Product p=productRepository.findById(i.getProdid()).get();
		try
		{ 
			if(i.getQty()>p.getStk())
				throw new ProductException("Out of stock");
		}
		catch(ProductException e)
		{
			return p.getName()+" is "+e.getMessage();
		}
		i.setTotal(i.getQty()*p.getPrice());
		i.setOrderno(customer);
		
		cartRepository.save(i);
		sum=sum+i.getTotal();  
		p.setStk(p.getStk()-i.getQty());
		productRepository.save(p);
		
		}
		customer.setTotalPrice(sum);
		customerRepository.save(customer);
	
		return "your order has been placed successfully";
	}
	@Override
	public List<Cart> orderDetails(Long orderno)
	{

		Customer customer=customerRepository.findById(orderno).get();
		List<Cart> cart=customer.getCart();		
		return cart;
	}

	
}


	


