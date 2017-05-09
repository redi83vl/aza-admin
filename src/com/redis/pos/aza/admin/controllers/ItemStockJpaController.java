/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.controllers;

import com.redis.pos.aza.admin.controllers.exceptions.NonexistentEntityException;
import com.redis.pos.aza.admin.controllers.exceptions.PreexistingEntityException;
import com.redis.pos.aza.admin.entities.ItemStock;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class ItemStockJpaController implements Serializable {
	
	public static ItemStockJpaController getInstance(){
		return new ItemStockJpaController(Persistence.createEntityManagerFactory("aza-adminPU"));
	}

	public ItemStockJpaController(EntityManagerFactory emf) {
		this.emf = emf;
	}
	private EntityManagerFactory emf = null;

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public List<ItemStock> findItemStockEntities() {
		return findItemStockEntities(true, -1, -1);
	}

	public List<ItemStock> findItemStockEntities(int maxResults, int firstResult) {
		return findItemStockEntities(false, maxResults, firstResult);
	}

	private List<ItemStock> findItemStockEntities(boolean all, int maxResults, int firstResult) {
		EntityManager em = getEntityManager();
		try {
			CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(ItemStock.class));
			Query q = em.createQuery(cq);
			if (!all) {
				q.setMaxResults(maxResults);
				q.setFirstResult(firstResult);
			}
			return q.getResultList();
		} finally {
			em.close();
		}
	}

	public ItemStock findItemStock(int id) {
		EntityManager em = getEntityManager();
		try {
			return em.find(ItemStock.class, id);
		} finally {
			em.close();
		}
	}

	public int getItemStockCount() {
		EntityManager em = getEntityManager();
		try {
			CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			Root<ItemStock> rt = cq.from(ItemStock.class);
			cq.select(em.getCriteriaBuilder().count(rt));
			Query q = em.createQuery(cq);
			return ((Long) q.getSingleResult()).intValue();
		} finally {
			em.close();
		}
	}
	
}
