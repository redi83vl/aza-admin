/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.itemdiscounts;

import com.redis.collection.tree.TreeNode;
import com.redis.pos.aza.admin.gui.items.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.tree.TreePath;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class FrameItemDiscounts extends javax.swing.JInternalFrame {
	
	public FrameItemDiscounts() {
		initComponents();
	}
	
	private void resizeColumns(){
		this.jTable1.packColumn(0, 100);
		this.jTable1.packColumn(1, 150);
		this.jTable1.packColumn(2, 150);
		this.jTable1.packColumn(3, 150);
		this.jTable1.packColumn(4, 150);
		this.jTable1.packColumn(5, 300);
		this.jTable1.packColumn(6, 100);
		this.jTable1.packColumn(6, 100);
		this.jTable1.packColumn(6, 100);
		this.jTable1.packColumn(6, 150);
	}
	
	private void applyCellRenderer(){
		
		this.jTable1.getColumn(6).setCellRenderer(new TableCellRendererPrice());
		this.jTable1.getColumn(7).setCellRenderer(new TableCellRendererPrice());
		
		
	}
	
	private void reload(){
		this.tableModel.reload();
		treeModel.reload();
		jXTree1.setSelectionRow(0);
		
		
		this.resizeColumns();
		this.applyCellRenderer();		
	}
	
	@SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          buttonGroup1 = new javax.swing.ButtonGroup();
          treeModel = new com.redis.pos.aza.admin.gui.itempath.TreeModelItemPaths();
          tableModel = new com.redis.pos.aza.admin.gui.itemdiscounts.TableModelItemDiscounts();
          jPanel4 = new javax.swing.JPanel();
          jPanel5 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          jTable1 = new org.jdesktop.swingx.JXTable();
          jToolBar2 = new javax.swing.JToolBar();
          jLabel4 = new javax.swing.JLabel();
          comboCategories = new javax.swing.JComboBox<>();
          filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
          jSeparator4 = new javax.swing.JToolBar.Separator();
          filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
          jLabel3 = new javax.swing.JLabel();
          jRadioButton1 = new javax.swing.JRadioButton();
          jRadioButton2 = new javax.swing.JRadioButton();
          jRadioButton3 = new javax.swing.JRadioButton();
          jRadioButton4 = new javax.swing.JRadioButton();
          filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
          filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jToolBar3 = new javax.swing.JToolBar();
          filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jXSearchField2 = new org.jdesktop.swingx.JXSearchField();
          filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jToolBar1 = new javax.swing.JToolBar();
          jButton1 = new javax.swing.JButton();
          filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jButton4 = new javax.swing.JButton();
          jButton3 = new javax.swing.JButton();
          jPanel1 = new javax.swing.JPanel();
          jToolBar4 = new javax.swing.JToolBar();
          jLabel1 = new javax.swing.JLabel();
          fieldSelectionPath = new javax.swing.JTextField();
          jScrollPane2 = new javax.swing.JScrollPane();
          jXTree1 = new org.jdesktop.swingx.JXTree();

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

          jTable1.setModel(tableModel);
          jTable1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jTable1.setRowHeight(25);
          jScrollPane1.setViewportView(jTable1);
          this.resizeColumns();
          this.applyCellRenderer();

          jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

          jToolBar2.setFloatable(false);
          jToolBar2.setRollover(true);

          jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
          jLabel4.setText("Kategoria");
          jToolBar2.add(jLabel4);

          comboCategories.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          comboCategories.setMaximumRowCount(25);
          comboCategories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
          comboCategories.setEnabled(false);
          comboCategories.setMaximumSize(new java.awt.Dimension(200, 19));
          comboCategories.setMinimumSize(new java.awt.Dimension(200, 19));
          comboCategories.setPreferredSize(new java.awt.Dimension(200, 19));
          comboCategories.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    comboCategoriesItemStateChanged(evt);
               }
          });
          jToolBar2.add(comboCategories);
          jToolBar2.add(filler9);
          jToolBar2.add(jSeparator4);
          jToolBar2.add(filler5);

          jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
          jLabel3.setText("Sasia:");
          jToolBar2.add(jLabel3);

          buttonGroup1.add(jRadioButton1);
          jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton1.setText("Negative");
          jRadioButton1.setEnabled(false);
          jRadioButton1.setFocusable(false);
          jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jRadioButton1);

          buttonGroup1.add(jRadioButton2);
          jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton2.setText("Zero");
          jRadioButton2.setEnabled(false);
          jRadioButton2.setFocusable(false);
          jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jRadioButton2);

          buttonGroup1.add(jRadioButton3);
          jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton3.setText("Pozitive");
          jRadioButton3.setEnabled(false);
          jRadioButton3.setFocusable(false);
          jRadioButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jRadioButton3);

          buttonGroup1.add(jRadioButton4);
          jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton4.setSelected(true);
          jRadioButton4.setText("Te Gjitha");
          jRadioButton4.setEnabled(false);
          jRadioButton4.setFocusable(false);
          jRadioButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jRadioButton4);
          jToolBar2.add(filler7);
          jToolBar2.add(filler4);

          jPanel5.add(jToolBar2, java.awt.BorderLayout.PAGE_START);

          jToolBar3.setRollover(true);
          jToolBar3.add(filler6);

          jXSearchField2.setColumns(25);
          jXSearchField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
          jXSearchField2.setEnabled(false);
          jXSearchField2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jXSearchField2.setMaximumSize(new java.awt.Dimension(244, 24));
          jXSearchField2.setMinimumSize(new java.awt.Dimension(244, 24));
          jXSearchField2.setName(""); // NOI18N
          jToolBar3.add(jXSearchField2);
          jToolBar3.add(filler8);

          jPanel5.add(jToolBar3, java.awt.BorderLayout.PAGE_END);

          jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

          getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

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
          jButton4.setEnabled(false);
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
          jButton3.setEnabled(false);
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

          jPanel1.setPreferredSize(new java.awt.Dimension(250, 100));
          jPanel1.setLayout(new java.awt.BorderLayout());

          jToolBar4.setFloatable(false);
          jToolBar4.setRollover(true);

          jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic/arrow-up-16.png"))); // NOI18N
          jToolBar4.add(jLabel1);

          fieldSelectionPath.setText("/");
          jToolBar4.add(fieldSelectionPath);

          jPanel1.add(jToolBar4, java.awt.BorderLayout.PAGE_START);

          jXTree1.setModel(treeModel);
          jXTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
               public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                    jXTree1ValueChanged(evt);
               }
          });
          jScrollPane2.setViewportView(jXTree1);

          jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

          getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          this.reload();
     }//GEN-LAST:event_jButton1ActionPerformed

     private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_jButton4ActionPerformed

     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_jButton3ActionPerformed

     private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
          this.jButton1ActionPerformed(null);
     }//GEN-LAST:event_formInternalFrameOpened

     private void comboCategoriesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriesItemStateChanged
          // TODO add your handling code here:
     }//GEN-LAST:event_comboCategoriesItemStateChanged

     private void jXTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jXTree1ValueChanged
         	
		Object[] path = evt.getPath().getPath();
		String category = "", type = "", brand = "";
		List<RowFilter<TableModelItemDiscounts, Integer>> filters = new ArrayList();
		
		if(path.length > 1){
			filters.add(RowFilter.regexFilter(String.valueOf(path[1]), 1));
			fieldSelectionPath.setText("/" + String.valueOf(path[1]));
		}
		if(path.length > 2){
			filters.add(RowFilter.regexFilter(String.valueOf(path[2]), 2));
			fieldSelectionPath.setText("/" + String.valueOf(path[1]) + "/" + String.valueOf(path[2]));
		}
		if(path.length > 3){
			filters.add(RowFilter.regexFilter(String.valueOf(path[3]), 3));
			fieldSelectionPath.setText("/" + String.valueOf(path[1]) + "/" +  String.valueOf(path[2]) + "/" + String.valueOf(path[3]));
		}
		
		this.jTable1.setRowFilter(RowFilter.andFilter(filters));
		
     }//GEN-LAST:event_jXTree1ValueChanged


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.ButtonGroup buttonGroup1;
     private javax.swing.JComboBox<String> comboCategories;
     private javax.swing.JTextField fieldSelectionPath;
     private javax.swing.Box.Filler filler1;
     private javax.swing.Box.Filler filler4;
     private javax.swing.Box.Filler filler5;
     private javax.swing.Box.Filler filler6;
     private javax.swing.Box.Filler filler7;
     private javax.swing.Box.Filler filler8;
     private javax.swing.Box.Filler filler9;
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton3;
     private javax.swing.JButton jButton4;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel4;
     private javax.swing.JPanel jPanel5;
     private javax.swing.JRadioButton jRadioButton1;
     private javax.swing.JRadioButton jRadioButton2;
     private javax.swing.JRadioButton jRadioButton3;
     private javax.swing.JRadioButton jRadioButton4;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JToolBar.Separator jSeparator4;
     private org.jdesktop.swingx.JXTable jTable1;
     private javax.swing.JToolBar jToolBar1;
     private javax.swing.JToolBar jToolBar2;
     private javax.swing.JToolBar jToolBar3;
     private javax.swing.JToolBar jToolBar4;
     private org.jdesktop.swingx.JXSearchField jXSearchField2;
     private org.jdesktop.swingx.JXTree jXTree1;
     private com.redis.pos.aza.admin.gui.itemdiscounts.TableModelItemDiscounts tableModel;
     private com.redis.pos.aza.admin.gui.itempath.TreeModelItemPaths treeModel;
     // End of variables declaration//GEN-END:variables
}
