package com.online_store1.online_store1.Entities;

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
@Table(name ="Product")
public class Product {

	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long Id;
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getStk() {
	return stk;
}
public void setStk(Long stk) {
	this.stk = stk;
}
public Long getPrice() {
	return price;
}
public void setPrice(Long price) {
	this.price = price;
}
private String name;
private Long stk;
private Long price;

}

