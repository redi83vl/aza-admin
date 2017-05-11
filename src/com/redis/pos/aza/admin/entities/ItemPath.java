/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
@Entity
@Table(name = "ItemPath")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "ItemPath.findAll", query = "SELECT i FROM ItemPath i")
	, @NamedQuery(name = "ItemPath.findById", query = "SELECT i FROM ItemPath i WHERE i.id = :id")
	, @NamedQuery(name = "ItemPath.findByCategory", query = "SELECT i FROM ItemPath i WHERE i.category = :category")
	, @NamedQuery(name = "ItemPath.findByType", query = "SELECT i FROM ItemPath i WHERE i.type = :type")
	, @NamedQuery(name = "ItemPath.findByBrand", query = "SELECT i FROM ItemPath i WHERE i.brand = :brand")
	, @NamedQuery(name = "ItemPath.findByModel", query = "SELECT i FROM ItemPath i WHERE i.model = :model")})
public class ItemPath implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "id")
	@Id
	private Integer id;
	@Column(name = "category")
	private String category;
	@Column(name = "type")
	private String type;
	@Column(name = "brand")
	private String brand;
	@Column(name = "model")
	private String model;

	public ItemPath() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
