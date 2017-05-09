/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class Brand {
	private final String name;
	private final List<Item> products;

	public Brand(String name) {
		this.name = name;
		this.products = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public int countItems() {
		return products.size();
	}

	public boolean addItem(Item e) {
		return products.add(e);
	}

	public Item getItem(int index) {
		return products.get(index);
	}

	public Item removeItem(int index) {
		return products.remove(index);
	}
}
