/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui;

import com.redis.pos.aza.admin.gui.itemdiscounts.FrameItemDiscounts;
import com.redis.pos.aza.admin.gui.items.FrameItems;
import com.redis.pos.aza.admin.gui.itemstocks.FrameItemStocks;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class FrameMain extends javax.swing.JFrame {
	
	public FrameMain() {
		initComponents();
		
		this.jMenuItem1ActionPerformed(null);
	}
	
	@SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          acrylLookAndFeel1 = new com.jtattoo.plaf.acryl.AcrylLookAndFeel();
          aeroLookAndFeel1 = new com.jtattoo.plaf.aero.AeroLookAndFeel();
          aluminiumLookAndFeel1 = new com.jtattoo.plaf.aluminium.AluminiumLookAndFeel();
          hiFiLookAndFeel1 = new com.jtattoo.plaf.hifi.HiFiLookAndFeel();
          lunaLookAndFeel1 = new com.jtattoo.plaf.luna.LunaLookAndFeel();
          mcWinLookAndFeel1 = new com.jtattoo.plaf.mcwin.McWinLookAndFeel();
          jToolBar1 = new javax.swing.JToolBar();
          jButton1 = new javax.swing.JButton();
          jButton2 = new javax.swing.JButton();
          jButton3 = new javax.swing.JButton();
          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jDesktopPane1 = new javax.swing.JDesktopPane();
          jMenuBar1 = new javax.swing.JMenuBar();
          jMenu1 = new javax.swing.JMenu();
          jMenu2 = new javax.swing.JMenu();
          jMenu3 = new javax.swing.JMenu();
          jMenuItem1 = new javax.swing.JMenuItem();
          jMenuItem2 = new javax.swing.JMenuItem();
          jMenuItem3 = new javax.swing.JMenuItem();
          jMenuItem4 = new javax.swing.JMenuItem();
          jMenuItem5 = new javax.swing.JMenuItem();
          jMenuItem6 = new javax.swing.JMenuItem();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setTitle("AZA Stock Monitor");
          setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

          jToolBar1.setFloatable(false);
          jToolBar1.setRollover(true);

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic/book-32.png"))); // NOI18N
          jButton1.setToolTipText("Katalogu i Artikujve");
          jButton1.setFocusable(false);
          jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });
          jToolBar1.add(jButton1);

          jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic/Shop-32.png"))); // NOI18N
          jButton2.setToolTipText("Gjendja e artikujve ne stok");
          jButton2.setFocusable(false);
          jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jButton2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
               }
          });
          jToolBar1.add(jButton2);

          jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic/Discount-32.png"))); // NOI18N
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

          jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

          jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
          jLabel1.setText("<html>\n\t<p>\n\t\tCopyright &copy; 2017 redis-it.com<br/>\n\t\tLagja \"Pavaresia\", Skele, Vlore (AL)<br/>\n\t\t+355 69 84 93 238 redjan.shabani@gmail.com\n\t</p>\n</html>");
          jPanel1.add(jLabel1);

          getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

          javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
          jDesktopPane1.setLayout(jDesktopPane1Layout);
          jDesktopPane1Layout.setHorizontalGroup(
               jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 693, Short.MAX_VALUE)
          );
          jDesktopPane1Layout.setVerticalGroup(
               jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 363, Short.MAX_VALUE)
          );

          getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

          jMenu1.setText("File");
          jMenuBar1.add(jMenu1);

          jMenu2.setText("Pamje");

          jMenu3.setText("Look & Feel");

          jMenuItem1.setText(acrylLookAndFeel1.getName());
          jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem1ActionPerformed(evt);
               }
          });
          jMenu3.add(jMenuItem1);

          jMenuItem2.setText(aeroLookAndFeel1.getName());
          jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem2ActionPerformed(evt);
               }
          });
          jMenu3.add(jMenuItem2);

          jMenuItem3.setText(aluminiumLookAndFeel1.getName());
          jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem3ActionPerformed(evt);
               }
          });
          jMenu3.add(jMenuItem3);

          jMenuItem4.setText(hiFiLookAndFeel1.getName());
          jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem4ActionPerformed(evt);
               }
          });
          jMenu3.add(jMenuItem4);

          jMenuItem5.setText(lunaLookAndFeel1.getName());
          jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem5ActionPerformed(evt);
               }
          });
          jMenu3.add(jMenuItem5);

          jMenuItem6.setText(mcWinLookAndFeel1.getName());
          jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem6ActionPerformed(evt);
               }
          });
          jMenu3.add(jMenuItem6);

          jMenu2.add(jMenu3);

          jMenuBar1.add(jMenu2);

          setJMenuBar(jMenuBar1);

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          for(JInternalFrame jInternalFrame : this.jDesktopPane1.getAllFrames()){
			if(jInternalFrame instanceof FrameItems){
				jInternalFrame.moveToFront();
				return;
			}
		}
		
		
		FrameItems frameItems = new FrameItems();
		jDesktopPane1.add(frameItems);
		frameItems.setVisible(true);
		
		try {
			frameItems.setMaximum(true);
		} 
		catch (PropertyVetoException ex) {
			Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jButton1ActionPerformed

     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          for(JInternalFrame jInternalFrame : this.jDesktopPane1.getAllFrames()){
			if(jInternalFrame instanceof FrameItemStocks){
				jInternalFrame.moveToFront();
				return;
			}
		}
		
		FrameItemStocks frameItemStocks = new FrameItemStocks();
		jDesktopPane1.add(frameItemStocks);
		frameItemStocks.setVisible(true);
		
		try {
			frameItemStocks.setMaximum(true);
		} 
		catch (PropertyVetoException ex) {
			Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jButton2ActionPerformed

     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          for(JInternalFrame frame : this.jDesktopPane1.getAllFrames()){
			if(frame instanceof FrameItemDiscounts){
				frame.moveToFront();
				return;
			}
		}
		
		FrameItemDiscounts frame = new FrameItemDiscounts();
		jDesktopPane1.add(frame);
		frame.setVisible(true);
		
		try {
			frame.setMaximum(true);
		} 
		catch (PropertyVetoException ex) {
			Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jButton3ActionPerformed

     private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
		try {
			UIManager.setLookAndFeel(acrylLookAndFeel1);
			SwingUtilities.updateComponentTreeUI(this);
		} 
		catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jMenuItem1ActionPerformed

     private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          try {
			UIManager.setLookAndFeel(aeroLookAndFeel1);
			SwingUtilities.updateComponentTreeUI(this);
		} 
		catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jMenuItem2ActionPerformed

     private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
           try {
			UIManager.setLookAndFeel(hiFiLookAndFeel1);
			SwingUtilities.updateComponentTreeUI(this);
		} 
		catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jMenuItem4ActionPerformed

     private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
           try {
			UIManager.setLookAndFeel(mcWinLookAndFeel1);
			SwingUtilities.updateComponentTreeUI(this);
		} 
		catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jMenuItem6ActionPerformed

     private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
           try {
			UIManager.setLookAndFeel(lunaLookAndFeel1);
			SwingUtilities.updateComponentTreeUI(this);
		} 
		catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jMenuItem5ActionPerformed

     private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
          try {
			UIManager.setLookAndFeel(aluminiumLookAndFeel1);
			SwingUtilities.updateComponentTreeUI(this);
		} 
		catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
		}
     }//GEN-LAST:event_jMenuItem3ActionPerformed

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private com.jtattoo.plaf.acryl.AcrylLookAndFeel acrylLookAndFeel1;
     private com.jtattoo.plaf.aero.AeroLookAndFeel aeroLookAndFeel1;
     private com.jtattoo.plaf.aluminium.AluminiumLookAndFeel aluminiumLookAndFeel1;
     private com.jtattoo.plaf.hifi.HiFiLookAndFeel hiFiLookAndFeel1;
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JButton jButton3;
     private javax.swing.JDesktopPane jDesktopPane1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JMenu jMenu1;
     private javax.swing.JMenu jMenu2;
     private javax.swing.JMenu jMenu3;
     private javax.swing.JMenuBar jMenuBar1;
     private javax.swing.JMenuItem jMenuItem1;
     private javax.swing.JMenuItem jMenuItem2;
     private javax.swing.JMenuItem jMenuItem3;
     private javax.swing.JMenuItem jMenuItem4;
     private javax.swing.JMenuItem jMenuItem5;
     private javax.swing.JMenuItem jMenuItem6;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JToolBar jToolBar1;
     private com.jtattoo.plaf.luna.LunaLookAndFeel lunaLookAndFeel1;
     private com.jtattoo.plaf.mcwin.McWinLookAndFeel mcWinLookAndFeel1;
     // End of variables declaration//GEN-END:variables
}
