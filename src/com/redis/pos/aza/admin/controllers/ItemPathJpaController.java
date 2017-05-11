/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.controllers;

import com.redis.pos.aza.admin.controllers.exceptions.NonexistentEntityException;
import com.redis.pos.aza.admin.controllers.exceptions.PreexistingEntityException;
import com.redis.pos.aza.admin.entities.ItemPath;
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
public class ItemPathJpaController implements Serializable {
	
	public static ItemPathJpaController getInstance(){
		return new ItemPathJpaController(Persistence.createEntityManagerFactory("aza-adminPU"));
	}

	public ItemPathJpaController(EntityManagerFactory emf) {
		this.emf = emf;
	}
	private EntityManagerFactory emf = null;

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public List<ItemPath> findItemPathEntities() {
		return findItemPathEntities(true, -1, -1);
	}

	public List<ItemPath> findItemPathEntities(int maxResults, int firstResult) {
		return findItemPathEntities(false, maxResults, firstResult);
	}

	private List<ItemPath> findItemPathEntities(boolean all, int maxResults, int firstResult) {
		EntityManager em = getEntityManager();
		try {
			CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(ItemPath.class));
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

	public ItemPath findItemPath(Integer id) {
		EntityManager em = getEntityManager();
		try {
			return em.find(ItemPath.class, id);
		} finally {
			em.close();
		}
	}

	public int getItemPathCount() {
		EntityManager em = getEntityManager();
		try {
			CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			Root<ItemPath> rt = cq.from(ItemPath.class);
			cq.select(em.getCriteriaBuilder().count(rt));
			Query q = em.createQuery(cq);
			return ((Long) q.getSingleResult()).intValue();
		} finally {
			em.close();
		}
	}
	
}
