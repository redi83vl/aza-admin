/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.collections;

import com.redis.pos.aza.admin.entities.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class ItemsCollection{
	
	private final List<Item> items;
	private final Map<String, Integer> categories;
	private final Map<String, Integer> suppliers;

	public ItemsCollection() {
		this.items = new ArrayList<>();
		this.categories = new HashMap();
		this.suppliers = new HashMap();
	}

	public void add(Item e) {
		if(!this.items.contains(e)){
			Integer categoryCounter = this.categories.get(e.getCategory());
			if(categoryCounter == null)
				this.categories.put(e.getCategory(), 1);
			else
				this.categories.replace(e.getCategory(), categoryCounter + 1);
			
			Integer supplierCounter = this.suppliers.get(e.getSupplier());
			if(supplierCounter == null)
				this.suppliers.put(e.getSupplier(), 1);
			else
				this.suppliers.put(e.getSupplier(), supplierCounter + 1);
			
			this.items.add(e);
		}
	}
	
	public Item[] get(String category, String supplier){
		List<Item> items = new ArrayList<>();
		
		this.items.forEach(item -> {
			if((category == null || category.equals(item.getCategory())) && (supplier == null || supplier.equals(item.getSupplier())))
				items.add(item);
		});
		
		return items.toArray(new Item[items.size()]);
	}
	
}
