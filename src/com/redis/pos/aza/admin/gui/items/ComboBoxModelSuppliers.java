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
public class ComboBoxModelSuppliers implements ComboBoxModel<String>{
	private final List<ListDataListener> listeners;
	private List<String> suppliers;
	private String selectedItem;

	public ComboBoxModelSuppliers() {
		this.listeners = new ArrayList<>();
		this.suppliers = new ArrayList<>();
		this.selectedItem = "";
	}
	
	public void clear(){
		this.suppliers = new ArrayList<>();
		this.selectedItem = "";
		
		this.listeners.forEach(listener -> { 
			listener.contentsChanged(new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, this.suppliers.size() - 1));
		});
	}
	
	public void reload(){
		this.suppliers = ItemJpaController.getInstance().findItemSuppliers();
		this.suppliers.removeIf((String t) -> t == null || t.isEmpty());
		this.selectedItem = "";
		
		this.listeners.forEach(listener -> { 
			listener.contentsChanged(new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, this.suppliers.size() - 1));
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
		return this.suppliers.size() + 1;
	}

	@Override
	public String getElementAt(int index) {
		return index == 0 ? "" : this.suppliers.get(index - 1);
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