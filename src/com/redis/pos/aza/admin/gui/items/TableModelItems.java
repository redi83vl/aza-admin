/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.items;

import com.redis.pos.aza.admin.controllers.ItemJpaController;
import com.redis.pos.aza.admin.entities.Item;
import java.util.ArrayList;
import java.util.Comparator;
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
	
	void clear() {
		this.items = new ArrayList<>();
		
		this.listeners.forEach(listener -> {
			listener.tableChanged(new TableModelEvent(this));
		});
	}
	
	public void reload(){
		this.items = ItemJpaController.getInstance().findItemEntities();
		this.items.sort((Item o1, Item o2) -> o1.getCode().compareTo(o2.getCode()));
		
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
		return 8;
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch(columnIndex){
			case 0: return "Kodi";
			case 1: return "Kategoria";
			case 2: return "Pershkrimi";
			case 3: return "Fornitori";
			case 4: return "Kostoja";
			case 5: return "Cmimi";
			case 6: return "Oferta";
			case 7: return "Sasia";
			default: return "";
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch(columnIndex){
			case 0: return String.class;
			case 1: return String.class;
			case 2: return String.class;
			case 3: return String.class;
			case 4: return Double.class;
			case 5: return Double.class;
			case 6: return Double.class;
			case 7: return Double.class;
			default: return Object.class;
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		switch(columnIndex){
			case 0: return Boolean.FALSE;
			case 1: return Boolean.FALSE;
			case 2: return Boolean.FALSE;
			case 3: return Boolean.FALSE;
			case 4: return Boolean.FALSE;
			case 5: return Boolean.FALSE;
			case 6: return Boolean.FALSE;
			case 7: return Boolean.FALSE;
			default: return Boolean.FALSE;
		}
		
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Item item = this.items.get(rowIndex);
		switch(columnIndex){
			case 0: return item.getCode();
			case 1: return item.getCategory();
			case 2: return item.getDescription();
			case 3: return item.getSupplier();
			case 4: return item.getCost();
			case 5: return item.getPrice0();
			case 6: return item.getPrice1();
			case 7: return item.getQuantity();
			default: return null;
		}
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
