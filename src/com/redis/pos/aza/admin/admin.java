/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin;

import com.redis.pos.aza.admin.gui.FrameMain;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class admin {

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(() -> {
			new FrameMain().setVisible(true);
		});
	}
	
}
