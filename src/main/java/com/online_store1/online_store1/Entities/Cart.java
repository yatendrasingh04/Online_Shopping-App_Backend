package com.online_store1.online_store1.Entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.online_store1.online_store1.Entities.Customer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity  //for creating table
@Table(name ="Cart")  //specify the name of table in database

public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //for auto incrementing 
private Long id;
	
	private Long prodid;
	private Long qty;
	private Long total;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getProdid() {
		return prodid;
	}
	public void setProdid(Long prodid) {
		this.prodid = prodid;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	
    @ManyToOne (cascade=CascadeType.ALL, fetch= FetchType.LAZY)
	@JsonBackReference
	private Customer orderno;
	public Customer getOrderno() {
		return orderno;
	}
	public void setOrderno(Customer orderno) {
		this.orderno = orderno;
	}
	
}
