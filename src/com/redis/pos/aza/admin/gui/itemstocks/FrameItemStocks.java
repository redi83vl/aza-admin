/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.itemstocks;

import javax.swing.RowFilter;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class FrameItemStocks extends javax.swing.JInternalFrame {
	
	public FrameItemStocks() {
		initComponents();
	}
	
	private void resizeColumns(){
		this.jXTable1.packColumn(0, 100);
		this.jXTable1.packColumn(1, 200);
		this.jXTable1.packColumn(2, 500);
		this.jXTable1.packColumn(3, 100);
		
		this.jXTable1.packColumn(4, 100);
		this.jXTable1.packColumn(5, 100);
		this.jXTable1.packColumn(6, 100);
		this.jXTable1.packColumn(7, 100);
		this.jXTable1.packColumn(8, 100);
		this.jXTable1.packColumn(9, 100);
		this.jXTable1.packColumn(10, 100);
		this.jXTable1.packColumn(11, 100);
		this.jXTable1.packColumn(12, 100);
		this.jXTable1.packColumn(13, 100);
		this.jXTable1.packColumn(14, 100);
		this.jXTable1.packColumn(15, 100);
		this.jXTable1.packColumn(16, 100);
		this.jXTable1.packColumn(17, 100);
	}
	
	@SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          tableModel = new com.redis.pos.aza.admin.gui.itemstocks.TableModelItemStocks();
          jToolBar1 = new javax.swing.JToolBar();
          jButton1 = new javax.swing.JButton();
          filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jButton4 = new javax.swing.JButton();
          jButton3 = new javax.swing.JButton();
          jPanel5 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          jXTable1 = new org.jdesktop.swingx.JXTable();
          jPanel1 = new javax.swing.JPanel();
          jXSearchField1 = new org.jdesktop.swingx.JXSearchField();
          jToolBar4 = new javax.swing.JToolBar();
          jLabel7 = new javax.swing.JLabel();
          comboSupplier2 = new javax.swing.JComboBox<>();

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
          jToolBar1.add(jButton4);

          jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic/print_24.png"))); // NOI18N
          jButton3.setFocusable(false);
          jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar1.add(jButton3);

          getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

          jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
          jPanel5.setLayout(new java.awt.BorderLayout());

          jXTable1.setModel(tableModel);
          jXTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
          jXTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
          jXTable1.setRowHeight(25);
          jScrollPane1.setViewportView(jXTable1);
          this.resizeColumns();

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

          jToolBar4.setFloatable(false);
          jToolBar4.setRollover(true);

          jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
          jLabel7.setText("Kategoria");
          jToolBar4.add(jLabel7);

          comboSupplier2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          comboSupplier2.setMaximumRowCount(25);
          comboSupplier2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
          comboSupplier2.setMaximumSize(new java.awt.Dimension(200, 19));
          comboSupplier2.setMinimumSize(new java.awt.Dimension(200, 19));
          comboSupplier2.setPreferredSize(new java.awt.Dimension(200, 19));
          comboSupplier2.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    comboSupplier2ItemStateChanged(evt);
               }
          });
          jToolBar4.add(comboSupplier2);

          jPanel5.add(jToolBar4, java.awt.BorderLayout.PAGE_START);

          getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          this.tableModel.reload();
		
		
		this.resizeColumns();
     }//GEN-LAST:event_jButton1ActionPerformed

     private void jXSearchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXSearchField1ActionPerformed
          RowFilter<TableModelItemStocks, Integer> rowFilter = RowFilter.regexFilter("(?i)" + jXSearchField1.getText());
		this.jXTable1.setRowFilter(rowFilter);
     }//GEN-LAST:event_jXSearchField1ActionPerformed

     private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
          this.jButton1ActionPerformed(null);
     }//GEN-LAST:event_formInternalFrameOpened

     private void comboSupplier2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSupplier2ItemStateChanged
          
     }//GEN-LAST:event_comboSupplier2ItemStateChanged


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JComboBox<String> comboSupplier;
     private javax.swing.JComboBox<String> comboSupplier1;
     private javax.swing.JComboBox<String> comboSupplier2;
     private javax.swing.Box.Filler filler1;
     private javax.swing.Box.Filler filler10;
     private javax.swing.Box.Filler filler2;
     private javax.swing.Box.Filler filler3;
     private javax.swing.Box.Filler filler5;
     private javax.swing.Box.Filler filler6;
     private javax.swing.Box.Filler filler7;
     private javax.swing.Box.Filler filler8;
     private javax.swing.Box.Filler filler9;
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton3;
     private javax.swing.JButton jButton4;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel5;
     private javax.swing.JRadioButton jRadioButton1;
     private javax.swing.JRadioButton jRadioButton2;
     private javax.swing.JRadioButton jRadioButton3;
     private javax.swing.JRadioButton jRadioButton4;
     private javax.swing.JRadioButton jRadioButton5;
     private javax.swing.JRadioButton jRadioButton6;
     private javax.swing.JRadioButton jRadioButton7;
     private javax.swing.JRadioButton jRadioButton8;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JToolBar.Separator jSeparator1;
     private javax.swing.JToolBar.Separator jSeparator2;
     private javax.swing.JToolBar.Separator jSeparator3;
     private javax.swing.JToolBar.Separator jSeparator4;
     private javax.swing.JToolBar jToolBar1;
     private javax.swing.JToolBar jToolBar2;
     private javax.swing.JToolBar jToolBar3;
     private javax.swing.JToolBar jToolBar4;
     private org.jdesktop.swingx.JXSearchField jXSearchField1;
     private org.jdesktop.swingx.JXTable jXTable1;
     private com.redis.pos.aza.admin.gui.itemstocks.TableModelItemStocks tableModel;
     // End of variables declaration//GEN-END:variables
}
