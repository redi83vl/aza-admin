/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.items;

import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JTable;
import javax.swing.SwingWorker;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class FrameItems extends javax.swing.JInternalFrame {
	
	public FrameItems() {
		initComponents();
		
		resizeColumns();
		applyCellRenderer();
	}
	
	private void resizeColumns(){
		this.table.packColumn(0, 100);
		this.table.packColumn(1, 200);
		this.table.packColumn(2, 500);
		this.table.packColumn(3, 200);
		this.table.packColumn(4, 100);
		this.table.packColumn(5, 100);
		this.table.packColumn(6, 100);
		this.table.packColumn(7, 100);
	}
	
	private void applyCellRenderer(){
		this.table.getColumn(4).setCellRenderer(new TableCellRendererPrice());
		this.table.getColumn(5).setCellRenderer(new TableCellRendererPrice());
		this.table.getColumn(6).setCellRenderer(new TableCellRendererPrice());
	}
	
	private void applyRowFilter(){		
		this.table.setRowFilter(rowFilter);
		this.labelCounter.setText(this.table.getRowCount() + "");
	}
	
	private void reload(){
		
		this.tableModelItems1.reload();
		this.comboBoxModelCategories1.reload();
		this.comboBoxModelSuppliers1.reload();
		
		this.labelCounter.setText(this.table.getRowCount() + "");
	}
	
	private void beforeReloadStarted(){
		this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		jProgressBar1.setVisible(true);
		jButton1.setEnabled(false);
		jButton3.setEnabled(false);
		jButton4.setEnabled(false);
		
		this.tableModelItems1.clear();
		this.comboBoxModelCategories1.clear();
		this.comboBoxModelSuppliers1.clear();
		
	}
	
	private void afterReloadFinished(){
		jButton1.setEnabled(true);
		jButton3.setEnabled(true);
		jButton4.setEnabled(true);
		
		jProgressBar1.setVisible(false);
		this.setCursor(Cursor.getDefaultCursor());
	}
	
	
	
	@SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          tableModelItems1 = new com.redis.pos.aza.admin.gui.items.TableModelItems();
          buttonGroup1 = new javax.swing.ButtonGroup();
          comboBoxModelCategories1 = new com.redis.pos.aza.admin.gui.items.ComboBoxModelCategories();
          comboBoxModelSuppliers1 = new com.redis.pos.aza.admin.gui.items.ComboBoxModelSuppliers();
          rowFilter = new com.redis.pos.aza.admin.gui.items.RowFilterItems();
          jPanel4 = new javax.swing.JPanel();
          jPanel5 = new javax.swing.JPanel();
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
          jSeparator2 = new javax.swing.JToolBar.Separator();
          filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
          labelCounter = new javax.swing.JLabel();
          jToolBar3 = new javax.swing.JToolBar();
          filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jXSearchField2 = new org.jdesktop.swingx.JXSearchField();
          filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jScrollPane2 = new javax.swing.JScrollPane();
          table = new org.jdesktop.swingx.JXTable();
          jToolBar1 = new javax.swing.JToolBar();
          jButton1 = new javax.swing.JButton();
          jProgressBar1 = new javax.swing.JProgressBar();
          filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
          jButton4 = new javax.swing.JButton();
          jButton3 = new javax.swing.JButton();

          tableModelItems1.addTableModelListener(new javax.swing.event.TableModelListener() {
               public void tableChanged(javax.swing.event.TableModelEvent evt) {
                    tableModelItems1TableChanged(evt);
               }
          });

          comboBoxModelCategories1.addListDataListener(new javax.swing.event.ListDataListener() {
               public void intervalRemoved(javax.swing.event.ListDataEvent evt) {
               }
               public void contentsChanged(javax.swing.event.ListDataEvent evt) {
                    comboBoxModelCategories1ContentsChanged(evt);
               }
               public void intervalAdded(javax.swing.event.ListDataEvent evt) {
               }
          });

          comboBoxModelSuppliers1.addListDataListener(new javax.swing.event.ListDataListener() {
               public void intervalRemoved(javax.swing.event.ListDataEvent evt) {
               }
               public void contentsChanged(javax.swing.event.ListDataEvent evt) {
                    comboBoxModelSuppliers1ContentsChanged(evt);
               }
               public void intervalAdded(javax.swing.event.ListDataEvent evt) {
               }
          });

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

          jToolBar2.setFloatable(false);
          jToolBar2.setRollover(true);

          jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
          jLabel4.setText("Kategoria");
          jToolBar2.add(jLabel4);

          comboCategories.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          comboCategories.setMaximumRowCount(25);
          comboCategories.setModel(comboBoxModelCategories1);
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
          comboSupplier.setModel(comboBoxModelSuppliers1);
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
          jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    jRadioButton1ItemStateChanged(evt);
               }
          });
          jToolBar2.add(jRadioButton1);

          buttonGroup1.add(jRadioButton2);
          jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton2.setText("Zero");
          jRadioButton2.setFocusable(false);
          jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    jRadioButton2ItemStateChanged(evt);
               }
          });
          jToolBar2.add(jRadioButton2);

          buttonGroup1.add(jRadioButton3);
          jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton3.setText("Pozitive");
          jRadioButton3.setFocusable(false);
          jRadioButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    jRadioButton3ItemStateChanged(evt);
               }
          });
          jToolBar2.add(jRadioButton3);

          buttonGroup1.add(jRadioButton4);
          jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jRadioButton4.setSelected(true);
          jRadioButton4.setText("Te Gjitha");
          jRadioButton4.setFocusable(false);
          jRadioButton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jRadioButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
          jRadioButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    jRadioButton4ItemStateChanged(evt);
               }
          });
          jToolBar2.add(jRadioButton4);
          jToolBar2.add(filler7);
          jToolBar2.add(jSeparator2);
          jToolBar2.add(filler10);
          jToolBar2.add(filler12);

          labelCounter.setText("0");
          jToolBar2.add(labelCounter);

          jPanel5.add(jToolBar2, java.awt.BorderLayout.PAGE_START);

          jToolBar3.setFloatable(false);
          jToolBar3.setRollover(true);
          jToolBar3.add(filler6);

          jXSearchField2.setColumns(25);
          jXSearchField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
          jXSearchField2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jXSearchField2.setMaximumSize(new java.awt.Dimension(244, 24));
          jXSearchField2.setMinimumSize(new java.awt.Dimension(244, 24));
          jXSearchField2.setName(""); // NOI18N
          jXSearchField2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jXSearchField2ActionPerformed(evt);
               }
          });
          jToolBar3.add(jXSearchField2);
          jToolBar3.add(filler8);

          jPanel5.add(jToolBar3, java.awt.BorderLayout.PAGE_END);

          table.setModel(tableModelItems1);
          table.setSortable(false);
          jScrollPane2.setViewportView(table);

          jPanel5.add(jScrollPane2, java.awt.BorderLayout.CENTER);

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

          jProgressBar1.setIndeterminate(true);
          jProgressBar1.setMaximumSize(new java.awt.Dimension(350, 16));
          jToolBar1.add(jProgressBar1);
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
          beforeReloadStarted();
		SwingWorker<Void,Integer> worker = new SwingWorker<Void,Integer>() {
			@Override
			protected Void doInBackground() throws Exception {
				reload();
				return null;
			}

			@Override
			protected void done() {
				afterReloadFinished();
			}
		};
		
		worker.execute();
     }//GEN-LAST:event_jButton1ActionPerformed

     private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_jButton4ActionPerformed

     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
		try {
			JTable.PrintMode printMode = JTable.PrintMode.FIT_WIDTH;
			MessageFormat headerFormat = new MessageFormat("");
			MessageFormat footerFormat = new MessageFormat("");
			boolean showPrintDialog = true;
			
			PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
			printRequestAttributeSet.add(OrientationRequested.LANDSCAPE);
			
			boolean interactive = true;
			
			this.table.print(printMode, headerFormat, footerFormat, showPrintDialog, printRequestAttributeSet, interactive);
		} 
		catch (PrinterException | HeadlessException ex) {
			Logger.getLogger(FrameItems.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jButton3ActionPerformed

     private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
          this.jButton1ActionPerformed(null);
     }//GEN-LAST:event_formInternalFrameOpened

     private void comboSupplierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSupplierItemStateChanged
		this.rowFilter.includeSupplier((String) this.comboBoxModelSuppliers1.getSelectedItem());
		this.applyRowFilter();
     }//GEN-LAST:event_comboSupplierItemStateChanged

     private void comboCategoriesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCategoriesItemStateChanged
          this.rowFilter.includeCategory((String) this.comboBoxModelCategories1.getSelectedItem());
		this.applyRowFilter();
     }//GEN-LAST:event_comboCategoriesItemStateChanged

     private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
          if(evt.getStateChange() == ItemEvent.SELECTED){
			this.rowFilter.includeNegativeQuantites();
			this.applyRowFilter();
		}
     }//GEN-LAST:event_jRadioButton1ItemStateChanged

     private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
          if(evt.getStateChange() == ItemEvent.SELECTED){
			this.rowFilter.includeZeroQuantites();
			this.applyRowFilter();
		}
     }//GEN-LAST:event_jRadioButton2ItemStateChanged

     private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
          if(evt.getStateChange() == ItemEvent.SELECTED){
			this.rowFilter.includePositiveQuantites();
			this.applyRowFilter();
		}
     }//GEN-LAST:event_jRadioButton3ItemStateChanged

     private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
          if(evt.getStateChange() == ItemEvent.SELECTED){
			this.rowFilter.includeAllQuantites();
			this.applyRowFilter();
		}
     }//GEN-LAST:event_jRadioButton4ItemStateChanged

     private void jXSearchField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXSearchField2ActionPerformed
          this.rowFilter.includeDescription(this.jXSearchField2.getText());
		this.applyRowFilter();
     }//GEN-LAST:event_jXSearchField2ActionPerformed

     private void comboBoxModelCategories1ContentsChanged(javax.swing.event.ListDataEvent evt) {//GEN-FIRST:event_comboBoxModelCategories1ContentsChanged
          comboCategories.setEnabled(comboBoxModelCategories1.getSize() > 1);
     }//GEN-LAST:event_comboBoxModelCategories1ContentsChanged

     private void comboBoxModelSuppliers1ContentsChanged(javax.swing.event.ListDataEvent evt) {//GEN-FIRST:event_comboBoxModelSuppliers1ContentsChanged
          comboSupplier.setEnabled(comboBoxModelSuppliers1.getSize() > 1);
     }//GEN-LAST:event_comboBoxModelSuppliers1ContentsChanged

     private void tableModelItems1TableChanged(javax.swing.event.TableModelEvent evt) {//GEN-FIRST:event_tableModelItems1TableChanged
          jXSearchField2.setText("");
		jXSearchField2.setEditable(tableModelItems1.getRowCount() > 0);
     }//GEN-LAST:event_tableModelItems1TableChanged


     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.ButtonGroup buttonGroup1;
     private com.redis.pos.aza.admin.gui.items.ComboBoxModelCategories comboBoxModelCategories1;
     private com.redis.pos.aza.admin.gui.items.ComboBoxModelSuppliers comboBoxModelSuppliers1;
     private javax.swing.JComboBox<String> comboCategories;
     private javax.swing.JComboBox<String> comboSupplier;
     private javax.swing.Box.Filler filler1;
     private javax.swing.Box.Filler filler10;
     private javax.swing.Box.Filler filler12;
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
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JPanel jPanel4;
     private javax.swing.JPanel jPanel5;
     private javax.swing.JProgressBar jProgressBar1;
     private javax.swing.JRadioButton jRadioButton1;
     private javax.swing.JRadioButton jRadioButton2;
     private javax.swing.JRadioButton jRadioButton3;
     private javax.swing.JRadioButton jRadioButton4;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JToolBar.Separator jSeparator1;
     private javax.swing.JToolBar.Separator jSeparator2;
     private javax.swing.JToolBar.Separator jSeparator4;
     private javax.swing.JToolBar jToolBar1;
     private javax.swing.JToolBar jToolBar2;
     private javax.swing.JToolBar jToolBar3;
     private org.jdesktop.swingx.JXSearchField jXSearchField2;
     private javax.swing.JLabel labelCounter;
     private com.redis.pos.aza.admin.gui.items.RowFilterItems rowFilter;
     private org.jdesktop.swingx.JXTable table;
     private com.redis.pos.aza.admin.gui.items.TableModelItems tableModelItems1;
     // End of variables declaration//GEN-END:variables
}
