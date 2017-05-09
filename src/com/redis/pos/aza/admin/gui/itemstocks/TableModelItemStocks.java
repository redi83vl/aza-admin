/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.itemstocks;

import com.redis.pos.aza.admin.controllers.ItemJpaController;
import com.redis.pos.aza.admin.controllers.ItemStockJpaController;
import com.redis.pos.aza.admin.entities.Item;
import com.redis.pos.aza.admin.entities.ItemStock;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class TableModelItemStocks implements TableModel{
	
	private final List<TableModelListener> listeners;
	private List<ItemStock> itemStocks;
	
	public TableModelItemStocks(){
		this.listeners = new ArrayList<>();
		this.itemStocks = new ArrayList<>();
	}
	
	public void reload(){
		this.itemStocks = ItemStockJpaController.getInstance().findItemStockEntities();
		
		this.listeners.forEach(listener -> {
			listener.tableChanged(new TableModelEvent(this));
		});
	}
	

	@Override
	public int getRowCount() {
		return this.itemStocks.size();
	}

	@Override
	public int getColumnCount() {
		return ItemStock.getFieldCount();
	}

	@Override
	public String getColumnName(int columnIndex) {
		return ItemStock.getFieldName(columnIndex);
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return ItemStock.getFieldClass(columnIndex);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return ItemStock.isFieldEditable(columnIndex);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return this.itemStocks.get(rowIndex).toArray()[columnIndex];
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
