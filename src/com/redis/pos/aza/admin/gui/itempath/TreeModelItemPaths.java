/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.gui.itempath;

import com.redis.collection.tree.TreeNode;
import com.redis.pos.aza.admin.controllers.ItemPathJpaController;
import com.redis.pos.aza.admin.entities.ItemPath;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class TreeModelItemPaths extends DefaultTreeModel{
	
	public TreeModelItemPaths(){
		super(new DefaultMutableTreeNode("*"));
	}
	
	@Override
	public void reload(){
		
		List<ItemPath> items = ItemPathJpaController.getInstance().findItemPathEntities();
		
		TreeNode node = new TreeNode("*");
		for(ItemPath item: items){			
			node
				.addChild(item.getCategory())
				.addChild(item.getType())
				.addChild(item.getBrand());
		}
		
		this.setRoot(node.toDefaultMutableTreeNode());
	}
	
}
