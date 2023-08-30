package com.training.springwithhibernate.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product implements Serializable {

	@Id
	private Integer pid;
	private String name;
	private Integer quantity;

	public Product(Integer pid, String name, Integer quantity) {
		super();
		this.pid = pid;
		this.name = name;
		this.quantity = quantity;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
