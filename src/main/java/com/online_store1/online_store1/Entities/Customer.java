package com.online_store1.online_store1.Entities;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Customer")
public class Customer {
	public List<Cart> getCart() {
		return cart;	
	}
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)			
	private Long orderno;
	private String name;
	private long customer_id;
	private Long phone;
	Double totalPrice;
	public Long getOrderno() {
		return orderno;
	}
	public void setOrderno(Long orderno) {
		this.orderno = orderno;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	@OneToMany(mappedBy="orderno",cascade=CascadeType.PERSIST)
	@JsonManagedReference
	private List<Cart>cart;

}
