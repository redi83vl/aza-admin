/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.items;

import com.redis.pos.aza.admin.gui.itemstocks.TableModelItemStocks;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class FrameItems extends javax.swing.JInternalFrame {
	
	public FrameItems() {
		initComponents();
	}
	
	private void resizeColumns(){
		this.jXTable1.packColumn(0, 100);
		this.jXTable1.packColumn(1, 200);
		this.jXTable1.packColumn(2, 500);
		this.jXTable1.packColumn(3, 200);
		this.jXTable1.packColumn(4, 100);
		this.jXTable1.packColumn(5, 100);
		this.jXTable1.packColumn(6, 100);
		this.jXTable1.packColumn(7, 100);
	}
	
	private void applyRowFilter(){
		
		List<RowFilter<TableModelItems, Integer>> filters = new ArrayList();
		
		//FILTER CATEGORY
		if(comboCategory.getSelectedIndex() > 0){
			filters.add(RowFilter.regexFilter(comboCategory.getSelectedItem().toString(), 1));
		}
		
		//FILTER SUPPLIER
		if(comboSupplier.getSelectedIndex() > 0){
			filters.add(RowFilter.regexFilter(comboSupplier.getSelectedItem().toString(), 3));
		}
		
		//FILTER QUANTITY
		switch(comboQuant.getSelectedIndex()){
			case 1: filters.add(RowFilter.numberFilter(RowFilter.ComparisonType.BEFORE, -Double.MIN_VALUE, 7)); break;
			case 2: filters.add(RowFilter.numberFilter(RowFilter.ComparisonType.BEFORE, +Double.MIN_VALUE, 7)); break;
			case 3: filters.add(RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, 0, 7)); break;
			case 4: filters.add(RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, -Double.MIN_VALUE, 7)); break;
			case 5: filters.add(RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, +Double.MIN_VALUE, 7)); break;
		}
		
		this.jXTable1.setRowFilter(RowFilter.andFilter(filters));
	}
	
	@SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          tableModelItems1 = new com.redis.pos.aza.admin.gui.items.TableModelItems();
          jPanel4 = new javax.swing.JPanel();
          jPanel5 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          jXTable1 = new org.jdesktop.swingx.JXTable();
          jPanel1 = new javax.swing.JPanel();
          jXSearchField1 = new org.jdesktop.swingx.JXSearchField();
          jPanel3 = new javax.swing.JPanel();
          comboCategory = new javax.swing.JComboBox<>();
          comboSupplier = new javax.swing.JComboBox<>();
          comboQuant = new javax.swing.JComboBox<>();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jSeparator1 = new javax.swing.JSeparator();
          jToolBar1 = new javax.swing.JToolBar();
          jButton1 = new javax.swing.JButton();
          filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jButton4 = new javax.swing.JButton();
          jButton3 = new javax.swing.JButton();

          setClosable(true);
          setIconifiable(true);
          setMaximizable(true);
          setResizable(true);
          addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
               public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
               }
               public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
               }
               public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
               }
               public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
               }
               public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
               }
               public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
               }
               public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                    formInternalFrameOpened(evt);
               }
          });

          jPanel4.setLayout(new java.awt.BorderLayout());

          jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
          jPanel5.setLayout(new java.awt.BorderLayout());

          jXTable1.setModel(tableModelItems1);
          jXTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
          jXTable1.setRowHeight(25);
          jScrollPane1.setViewportView(jXTable1);
          this.resizeColumns();
          this.jXTable1.getColumn(4).setCellRenderer(new TableCellRendererPrice());
          this.jXTable1.getColumn(5).setCellRenderer(new TableCellRendererPrice());
          this.jXTable1.getColumn(6).setCellRenderer(new TableCellRendererPrice());

          jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

          jXSearchField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
          jXSearchField1.setColumns(25);
          jXSearchField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
          jXSearchField1.setToolTipText("Kerko ...");
          jXSearchField1.setPrompt("Kerko ...");
          jXSearchField1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jXSearchField1ActionPerformed(evt);
               }
          });
          jPanel1.add(jXSearchField1);

          jPanel5.add(jPanel1, java.awt.BorderLayout.PAGE_END);

          jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

          getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

          jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

          comboCategory.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
          comboCategory.setMaximumRowCount(25);
          comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Te Gjitha Kategorite -" }));
          comboCategory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
          comboCategory.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    comboCategoryItemStateChanged(evt);
               }
          });

          comboSupplier.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
          comboSupplier.setMaximumRowCount(25);
          comboSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Te Gjithe Fornitoret -" }));
          comboSupplier.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
          comboSupplier.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    comboSupplierItemStateChanged(evt);
               }
          });

          comboQuant.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
          comboQuant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Te Gjitha Sasite -", "Negative", "Negative ose Zero", "Zero", "Zero ose Pozitive", "Pozitive" }));
          comboQuant.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
          comboQuant.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    comboQuantItemStateChanged(evt);
               }
          });

          jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jLabel1.setText("Kategoria:");

          jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jLabel2.setText("Fornitori:");

          jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jLabel3.setText("Sasia:");

          javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
          jPanel3.setLayout(jPanel3Layout);
          jPanel3Layout.setHorizontalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jSeparator1)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(comboCategory, 0, 200, Short.MAX_VALUE)
                         .addComponent(comboSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(comboQuant, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
          );
          jPanel3Layout.setVerticalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(comboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(comboQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(396, 396, 396))
          );

          getContentPane().add(jPanel3, java.awt.BorderLayout.WEST);

          jToolBar1.setFloatable(false);
          jToolBar1.setRollover(true);

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic/Synchronize-24.png"))); // NOI18N
          jButton1.setFocusable(false);
          jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });
          jToolBar1.add(jButton1);
          jToolBar1.add(filler1);

          jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic/excel_24.png"))); // NOI18N
          jButton4.setFocusable(false);
          jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jButton4.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
               }
          });
          jToolBar1.add(jButton4);

          jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic/print_24.png"))); // NOI18N
          jButton3.setFocusable(false);
          jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jButton3.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
               }
          });
          jToolBar1.add(jButton3);

          getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          this.tableModelItems1.reload();
		this.resizeColumns();
		
		
		
		DefaultComboBoxModel<String> comboBoxModelCategory = new DefaultComboBoxModel<>();
		comboBoxModelCategory.addElement("- Te Gjitha Kategorite -");
		
		DefaultComboBoxModel<String> comboBoxModelSupplier = new DefaultComboBoxModel<>();
		comboBoxModelSupplier.addElement("- Te Gjithe Fornitoret -");
		
		for(int idx = 0; idx < tableModelItems1.getRowCount(); idx++){
		
			String category = tableModelItems1.getItem(idx).getCategory();
			
			if(comboBoxModelCategory.getIndexOf(category) == -1)
				comboBoxModelCategory.addElement(category);
			comboCategory.setModel(comboBoxModelCategory);
			
			String supplier = tableModelItems1.getItem(idx).getSupplier();
			
			if(comboBoxModelSupplier.getIndexOf(category) == -1)
				comboBoxModelSupplier.addElement(supplier);
			comboSupplier.setModel(comboBoxModelSupplier);
		}
     }//GEN-LAST:event_jButton1ActionPerformed

     private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_jButton4ActionPerformed

     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_jButton3ActionPerformed

     private void comboCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoryItemStateChanged
          this.applyRowFilter();
     }//GEN-LAST:event_comboCategoryItemStateChanged

     private void comboSupplierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSupplierItemStateChanged
          this.applyRowFilter();
     }//GEN-LAST:event_comboSupplierItemStateChanged

     private void comboQuantItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboQuantItemStateChanged
          this.applyRowFilter();
     }//GEN-LAST:event_comboQuantItemStateChanged

     private void jXSearchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXSearchField1ActionPerformed
          RowFilter<TableModelItemStocks, Integer> rowFilter = RowFilter.regexFilter("(?i)" + jXSearchField1.getText());
		this.jXTable1.setRowFilter(rowFilter);
     }//GEN-LAST:event_jXSearchField1ActionPerformed

     private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
          this.jButton1ActionPerformed(null);
     }//GEN-LAST:event_formInternalFrameOpened


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JComboBox<String> comboCategory;
     private javax.swing.JComboBox<String> comboQuant;
     private javax.swing.JComboBox<String> comboSupplier;
     private javax.swing.Box.Filler filler1;
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton3;
     private javax.swing.JButton jButton4;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JPanel jPanel4;
     private javax.swing.JPanel jPanel5;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JSeparator jSeparator1;
     private javax.swing.JToolBar jToolBar1;
     private org.jdesktop.swingx.JXSearchField jXSearchField1;
     private org.jdesktop.swingx.JXTable jXTable1;
     private com.redis.pos.aza.admin.gui.items.TableModelItems tableModelItems1;
     // End of variables declaration//GEN-END:variables
}
