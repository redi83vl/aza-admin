/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.items;

import com.redis.pos.aza.admin.entities.Item;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class RowFilterItems extends RowFilter<TableModelItems, Integer>{
	
	private String category;
	private String supplier;
	private Double minQuant, maxQuant;
	private String description;
	
	private RowFilter<TableModelItems, Integer> categoryFilter, supplierFilter, minQuantityFilter, maxQuantityFilter, descriptionFilter;

	public RowFilterItems() {
		this.category = "";
		this.supplier = "";
		this.minQuant = -Double.MAX_VALUE;
		this.maxQuant = +Double.MAX_VALUE;
		this.description = "";
		
		this.categoryFilter = RowFilter.regexFilter(category, 1);
		this.supplierFilter = RowFilter.regexFilter(supplier, 3);
		this.minQuantityFilter = RowFilter.numberFilter(ComparisonType.AFTER, minQuant, 7);
		this.maxQuantityFilter = RowFilter.numberFilter(ComparisonType.BEFORE, maxQuant, 7);
		this.descriptionFilter = RowFilter.regexFilter("(?i)" + description);
	}

	public String getCategory() {
		return category;
	}

	public String getSupplier() {
		return supplier;
	}

	public Double getMinQuantity() {
		return minQuant;
	}

	public Double getMaxQuantity() {
		return maxQuant;
	}

	public String getDescription() {
		return description;
	}
	
	public void includeCategory(String category) {
		this.category = category;
		this.categoryFilter = RowFilter.regexFilter(category, 1);
	}

	public void includeSupplier(String supplier) {
		this.supplier = supplier;
		this.supplierFilter = RowFilter.regexFilter(supplier, 3);
	}
	
	public void includeDescription(String description){
		this.description = description;
		this.descriptionFilter = RowFilter.regexFilter("(?i)" + description);
	}

	public void includeAllQuantites(){
		this.minQuant = -Double.MAX_VALUE;
		this.maxQuant = +Double.MAX_VALUE;
		
		this.minQuantityFilter = RowFilter.numberFilter(ComparisonType.AFTER, minQuant, 7);
		this.maxQuantityFilter = RowFilter.numberFilter(ComparisonType.BEFORE, maxQuant, 7);
	}
	
	public void includeNegativeQuantites(){
		this.minQuant = -Double.MAX_VALUE;
		this.maxQuant = -Double.MIN_VALUE;
		
		this.minQuantityFilter = RowFilter.numberFilter(ComparisonType.AFTER, minQuant, 7);
		this.maxQuantityFilter = RowFilter.numberFilter(ComparisonType.BEFORE, maxQuant, 7);
	}
	
	public void includeZeroQuantites(){
		this.minQuant = -Double.MIN_VALUE;
		this.maxQuant = +Double.MIN_VALUE;
		
		this.minQuantityFilter = RowFilter.numberFilter(ComparisonType.AFTER, minQuant, 7);
		this.maxQuantityFilter = RowFilter.numberFilter(ComparisonType.BEFORE, maxQuant, 7);
	}
	
	public void includePositiveQuantites(){
		this.minQuant = +Double.MIN_VALUE;
		this.maxQuant = +Double.MAX_VALUE;
		
		this.minQuantityFilter = RowFilter.numberFilter(ComparisonType.AFTER, minQuant, 7);
		this.maxQuantityFilter = RowFilter.numberFilter(ComparisonType.BEFORE, maxQuant, 7);
	}

	@Override
	public boolean include(Entry<? extends TableModelItems, ? extends Integer> entry) {
		List<RowFilter<TableModelItems, Integer>> filters = new ArrayList();
		filters.add(categoryFilter); 
		filters.add(supplierFilter);
		filters.add(minQuantityFilter);
		filters.add(maxQuantityFilter);
		filters.add(descriptionFilter);
		
		RowFilter<TableModelItems, Integer> filter = RowFilter.andFilter(filters);
		
		return filter.include(entry);
	}
}
