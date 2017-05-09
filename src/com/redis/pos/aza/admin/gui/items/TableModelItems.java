/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.items;

import com.redis.pos.aza.admin.controllers.ItemJpaController;
import com.redis.pos.aza.admin.entities.Item;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class TableModelItems implements TableModel{

	private final List<TableModelListener> listeners;
	private List<Item> items;
	
	public TableModelItems(){
		this.listeners = new ArrayList<>();
		this.items = new ArrayList<>();
	}
	
	public void reload(){
		this.items = ItemJpaController.getInstance().findItemEntities();
		
		this.listeners.forEach(listener -> {
			listener.tableChanged(new TableModelEvent(this));
		});
	}
	
	public Item getItem(int index){
		return this.items.get(index);
	}
	
	@Override
	public int getRowCount() {
		return this.items.size();
	}

	@Override
	public int getColumnCount() {
		return Item.getFieldCount();
	}

	@Override
	public String getColumnName(int columnIndex) {
		return Item.getFieldName(columnIndex);
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return Item.getFieldClass(columnIndex);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return Item.isFieldEditable(columnIndex);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return this.items.get(rowIndex).toArray()[columnIndex];
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		this.listeners.add(l);
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		this.listeners.remove(l);
	}
	
}
