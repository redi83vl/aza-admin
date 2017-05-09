/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class Type {
	private final String name;
	private final List<Brand> brands;

	public Type(String name) {
		this.name = name;
		this.brands = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public int countBrands() {
		return brands.size();
	}

	public boolean addBrand(Brand e) {
		return brands.add(e);
	}

	public boolean removeBrand(Object o) {
		return brands.remove(o);
	}

	public Brand getBrand(int index) {
		return brands.get(index);
	}
	
	
}
