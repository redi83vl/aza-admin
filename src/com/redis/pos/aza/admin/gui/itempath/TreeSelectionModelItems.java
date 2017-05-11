/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.itempath;

import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class TreeSelectionModelItems extends DefaultTreeSelectionModel{

	public String getSeletedCategory(){
		TreePath path = super.getSelectionPath();
		if(path.getPathCount() <= 1) return null;
		return path.getPathComponent(1).toString();
	}
	
	public String getSeletedType(){
		TreePath path = super.getSelectionPath();
		if(path.getPathCount() <= 2) return null;
		return path.getPathComponent(2).toString();
	}
	
	public String getSeletedBrand(){
		TreePath path = super.getSelectionPath();
		if(path.getPathCount() <= 3) return null;
		return path.getPathComponent(3).toString();
	}
}
