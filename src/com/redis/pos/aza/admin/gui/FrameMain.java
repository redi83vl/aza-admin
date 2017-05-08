/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui;

import com.redis.pos.aza.admin.gui.items.FrameItems;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class FrameMain extends javax.swing.JFrame {

	/**
	 * Creates new form FrameMain
	 */
	public FrameMain() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
	 * content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jToolBar1 = new javax.swing.JToolBar();
          jButton1 = new javax.swing.JButton();
          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jDesktopPane1 = new javax.swing.JDesktopPane();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

          jToolBar1.setFloatable(false);
          jToolBar1.setRollover(true);

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ic/book-32.png"))); // NOI18N
          jButton1.setFocusable(false);
          jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });
          jToolBar1.add(jButton1);

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
               .addGap(0, 386, Short.MAX_VALUE)
          );

          getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton jButton1;
     private javax.swing.JDesktopPane jDesktopPane1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JToolBar jToolBar1;
     // End of variables declaration//GEN-END:variables
}
