/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.items;

import com.redis.pos.aza.admin.entities.Item;
import java.awt.Component;
import java.awt.Font;
import java.text.NumberFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class TableCellRendererPrice extends DefaultTableCellRenderer{
	
	private final NumberFormat priceFormat;
	private NumberFormat percFormat;

	public TableCellRendererPrice() {
		this.priceFormat = NumberFormat.getInstance();
		
		this.percFormat = NumberFormat.getPercentInstance();
		this.percFormat.setMaximumFractionDigits(0);
		this.percFormat.setMinimumFractionDigits(0);
	}
	
	

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		if(isSelected){
			label.setBackground(table.getSelectionBackground());
			label.setForeground(table.getSelectionForeground());
		}
		else{
			label.setBackground(table.getBackground());
			label.setForeground(table.getForeground());
		}
		
		if(table.getModel() instanceof TableModelItems){
			TableModelItems model = (TableModelItems) table.getModel();
			Item item = model.getItem(row);
			
			if(column == 4){//cmimi
				this.priceFormat.setMinimumFractionDigits(2);
				this.priceFormat.setMaximumFractionDigits(2);
				
				if(item.getCost()== null || item.getCost()<=1)
					label.setText("");
				else
					label.setText(this.priceFormat.format(item.getCost()));
			}
			
			if(column == 5){//cmimi
				this.priceFormat.setMinimumFractionDigits(0);
				this.priceFormat.setMaximumFractionDigits(0);
				
				if(item.getPrice0() == null || item.getPrice0()<=1)
					label.setText("");
				else
					label.setText(this.priceFormat.format(item.getPrice0()));
			}
			
			if(column == 6){//cmimi
				this.priceFormat.setMinimumFractionDigits(0);
				this.priceFormat.setMaximumFractionDigits(0);
				
				if(item.getPrice1() == null || item.getPrice1()<=1)
					label.setText("");
				else{
					label.setText( 
						this.priceFormat.format(item.getPrice1()) + 
						" (" + this.percFormat.format((item.getPrice0() - item.getPrice1()) / item.getPrice0() )  + ")"
					);
				}
			}
			
			label.setHorizontalAlignment(JLabel.RIGHT);
		}
		
		
		
		return label;
	}
	
}
