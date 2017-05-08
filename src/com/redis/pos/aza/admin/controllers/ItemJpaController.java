/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.controllers;

import com.redis.pos.aza.admin.controllers.exceptions.NonexistentEntityException;
import com.redis.pos.aza.admin.controllers.exceptions.PreexistingEntityException;
import com.redis.pos.aza.admin.entities.Item;
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
public class ItemJpaController implements Serializable {

	public static ItemJpaController getInstance(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aza-adminPU");
		ItemJpaController itemJpaController = new ItemJpaController(entityManagerFactory);
		return itemJpaController;
	}
	
	public ItemJpaController(EntityManagerFactory emf) {
		this.emf = emf;
	}
	private EntityManagerFactory emf = null;

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public List<Item> findItemEntities() {
		return findItemEntities(true, -1, -1);
	}

	public List<Item> findItemEntities(int maxResults, int firstResult) {
		return findItemEntities(false, maxResults, firstResult);
	}

	private List<Item> findItemEntities(boolean all, int maxResults, int firstResult) {
		EntityManager em = getEntityManager();
		try {
			CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(Item.class));
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

	public Item findItem(int id) {
		EntityManager em = getEntityManager();
		try {
			return em.find(Item.class, id);
		} finally {
			em.close();
		}
	}

	public int getItemCount() {
		EntityManager em = getEntityManager();
		try {
			CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			Root<Item> rt = cq.from(Item.class);
			cq.select(em.getCriteriaBuilder().count(rt));
			Query q = em.createQuery(cq);
			return ((Long) q.getSingleResult()).intValue();
		} finally {
			em.close();
		}
	}

	public void close() {
		emf.close();
	}
}
