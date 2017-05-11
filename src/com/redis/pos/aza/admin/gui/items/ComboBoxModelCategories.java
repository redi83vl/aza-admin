/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.items;

import com.redis.pos.aza.admin.controllers.ItemJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class ComboBoxModelCategories implements ComboBoxModel<String>{
	private final List<ListDataListener> listeners;
	private List<String> categories;
	private String selectedItem;
	
	public ComboBoxModelCategories(){
		this.listeners = new ArrayList<>();
		this.categories = new ArrayList<>();
		this.selectedItem = "";
	}
	
	public void clear(){
		this.categories = new ArrayList<>();
		this.selectedItem = "";
		
		this.listeners.forEach(listener -> { 
			listener.contentsChanged(new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, this.categories.size()));
		});
	}
	
	public void reload(){
		this.categories = ItemJpaController.getInstance().findItemCategories();
		this.categories.removeIf((String t) -> t == null || t.isEmpty());
		
		this.selectedItem = "";
		
		this.listeners.forEach(listener -> { 
			listener.contentsChanged(new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, this.categories.size()));
		});
	}

	@Override
	public void setSelectedItem(Object anItem) {
		this.selectedItem = anItem == null ? "" : anItem.toString();
	}

	@Override
	public Object getSelectedItem() {
		return this.selectedItem;
	}

	@Override
	public int getSize() {
		return this.categories.size() + 1;
	}

	@Override
	public String getElementAt(int index) {
		return index == 0 ? "" : this.categories.get(index - 1);
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		this.listeners.add(l);
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		this.listeners.remove(l);
	}
	
}
