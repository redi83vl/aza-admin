/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.itemdiscounts;

import com.redis.pos.aza.admin.controllers.ItemDiscountJpaController;
import com.redis.pos.aza.admin.entities.ItemDiscount;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.event.TreeModelListener;
import javax.swing.table.TableModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class TableModelItemDiscounts implements TableModel{
	
	private final List<TableModelListener> listeners;
	private ItemDiscount[] items;

	public TableModelItemDiscounts() {
		this.listeners = new ArrayList<>();
		items = new ItemDiscount[0];
	}
	
	public void reload(){
		ItemDiscountJpaController controller = ItemDiscountJpaController.getInstance();
		List<ItemDiscount> itemsList= controller.findItemDiscountEntities();
		
		this.items = itemsList.toArray(new ItemDiscount[itemsList.size()]);
		
		this.listeners.forEach(listener -> { listener.tableChanged(new TableModelEvent(this));});
	}
	

	@Override
	public int getRowCount() {
		return this.items.length;
	}

	@Override
	public int getColumnCount() {
		return 7;
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch(columnIndex){
			case 0: return "Kodi";
			case 1: return "Kategoria";
			case 2: return "Pershkrimi";
			case 3: return "Cmimi";
			case 4: return "Oferta";
			case 5: return "% Ulja";
			case 6: return "Data/Ora";
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
			case 6: return String.class;
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
			default: return Boolean.FALSE;
		}
		
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		ItemDiscount item = this.items[rowIndex];
		switch(columnIndex){
			case 0: return item.getCode();
			case 1: return item.getCategory();
			case 2: return item.getDescription();
			case 3: return item.getPrice0();
			case 4: return item.getPrice1();
			case 5: return item.getDiscount();
			case 6: return item.getUpdated();
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
