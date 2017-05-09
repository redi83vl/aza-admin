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
public class Category {
	private final String name;
	private final List<Type> types;

	public Category(String code, String name) {
		this.name = name;
		this.types = new ArrayList();
	}

	public String getName() {
		return name;
	}

	public int countTypes() {
		return types.size();
	}

	public boolean addType(Type e) {
		return types.add(e);
	}

	public Type getType(int index) {
		return types.get(index);
	}

	public Type removeType(int index) {
		return types.remove(index);
	}
}
