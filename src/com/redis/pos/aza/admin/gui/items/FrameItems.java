/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.items;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class FrameItems extends javax.swing.JInternalFrame {
	
	public FrameItems() {
		initComponents();
	}
	
	private void resizeColumns(){
		this.jTable1.packColumn(0, 100);
		this.jTable1.packColumn(1, 200);
		this.jTable1.packColumn(2, 500);
		this.jTable1.packColumn(3, 200);
		this.jTable1.packColumn(4, 100);
		this.jTable1.packColumn(5, 100);
		this.jTable1.packColumn(6, 100);
		this.jTable1.packColumn(7, 100);
	}
	
	private void applyCellRenderer(){
		
		this.jTable1.getColumn(4).setCellRenderer(new TableCellRendererPrice());
		this.jTable1.getColumn(5).setCellRenderer(new TableCellRendererPrice());
		this.jTable1.getColumn(6).setCellRenderer(new TableCellRendererPrice());
		
		
	}
	
	private void reload(){
		this.tableModelItems1.reload();
		this.resizeColumns();
		this.applyCellRenderer();		
	}
	
	@SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          tableModelItems1 = new com.redis.pos.aza.admin.gui.items.TableModelItems();
          jPanel2 = new javax.swing.JPanel();
          buttonGroup1 = new javax.swing.ButtonGroup();
          jPanel4 = new javax.swing.JPanel();
          jPanel5 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          jTable1 = new org.jdesktop.swingx.JXTable();
          jToolBar2 = new javax.swing.JToolBar();
          jLabel4 = new javax.swing.JLabel();
          comboCategories = new javax.swing.JComboBox<>();
          filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
          jSeparator4 = new javax.swing.JToolBar.Separator();
          filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
          jLabel2 = new javax.swing.JLabel();
          comboSupplier = new javax.swing.JComboBox<>();
          filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
          jSeparator1 = new javax.swing.JToolBar.Separator();
          filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
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

          javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
          jPanel2.setLayout(jPanel2Layout);
          jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 877, Short.MAX_VALUE)
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 100, Short.MAX_VALUE)
          );

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

          jTable1.setModel(tableModelItems1);
          jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
          jToolBar2.add(filler3);

          jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
          jLabel2.setText("Fornitori:");
          jToolBar2.add(jLabel2);

          comboSupplier.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          comboSupplier.setMaximumRowCount(25);
          comboSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
          comboSupplier.setMaximumSize(new java.awt.Dimension(200, 19));
          comboSupplier.setMinimumSize(new java.awt.Dimension(200, 19));
          comboSupplier.setPreferredSize(new java.awt.Dimension(200, 19));
          comboSupplier.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    comboSupplierItemStateChanged(evt);
               }
          });
          jToolBar2.add(comboSupplier);
          jToolBar2.add(filler5);
          jToolBar2.add(jSeparator1);
          jToolBar2.add(filler2);

          jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
          jLabel3.setText("Sasia:");
          jToolBar2.add(jLabel3);

          buttonGroup1.add(jRadioButton1);
          jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton1.setText("Negative");
          jRadioButton1.setFocusable(false);
          jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jRadioButton1);

          buttonGroup1.add(jRadioButton2);
          jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton2.setText("Zero");
          jRadioButton2.setFocusable(false);
          jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jRadioButton2);

          buttonGroup1.add(jRadioButton3);
          jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton3.setText("Pozitive");
          jRadioButton3.setFocusable(false);
          jRadioButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jToolBar2.add(jRadioButton3);

          buttonGroup1.add(jRadioButton4);
          jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton4.setSelected(true);
          jRadioButton4.setText("Te Gjitha");
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

     private void comboSupplierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSupplierItemStateChanged
         
     }//GEN-LAST:event_comboSupplierItemStateChanged

     private void comboCategoriesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriesItemStateChanged
          // TODO add your handling code here:
     }//GEN-LAST:event_comboCategoriesItemStateChanged


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.ButtonGroup buttonGroup1;
     private javax.swing.JComboBox<String> comboCategories;
     private javax.swing.JComboBox<String> comboSupplier;
     private javax.swing.Box.Filler filler1;
     private javax.swing.Box.Filler filler2;
     private javax.swing.Box.Filler filler3;
     private javax.swing.Box.Filler filler4;
     private javax.swing.Box.Filler filler5;
     private javax.swing.Box.Filler filler6;
     private javax.swing.Box.Filler filler7;
     private javax.swing.Box.Filler filler8;
     private javax.swing.Box.Filler filler9;
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton3;
     private javax.swing.JButton jButton4;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JPanel jPanel4;
     private javax.swing.JPanel jPanel5;
     private javax.swing.JRadioButton jRadioButton1;
     private javax.swing.JRadioButton jRadioButton2;
     private javax.swing.JRadioButton jRadioButton3;
     private javax.swing.JRadioButton jRadioButton4;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JToolBar.Separator jSeparator1;
     private javax.swing.JToolBar.Separator jSeparator4;
     private org.jdesktop.swingx.JXTable jTable1;
     private javax.swing.JToolBar jToolBar1;
     private javax.swing.JToolBar jToolBar2;
     private javax.swing.JToolBar jToolBar3;
     private org.jdesktop.swingx.JXSearchField jXSearchField2;
     private com.redis.pos.aza.admin.gui.items.TableModelItems tableModelItems1;
     // End of variables declaration//GEN-END:variables
}
