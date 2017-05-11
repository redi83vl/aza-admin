/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.entities;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "Item")
@XmlRootElement
@NamedQueries({
	  @NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i ORDER BY i.code ASC")
	, @NamedQuery(name = "Item.findAllCategories", query = "SELECT DISTINCT i.category FROM Item i ORDER BY i.category ASC")
	, @NamedQuery(name = "Item.findById", query = "SELECT i FROM Item i WHERE i.id = :id")
	, @NamedQuery(name = "Item.findByCode", query = "SELECT i FROM Item i WHERE i.code = :code")
	, @NamedQuery(name = "Item.findByCategory", query = "SELECT i FROM Item i WHERE i.category = :category")
	, @NamedQuery(name = "Item.findByType", query = "SELECT i FROM Item i WHERE i.type = :type")
	, @NamedQuery(name = "Item.findByBrand", query = "SELECT i FROM Item i WHERE i.brand = :brand")
	, @NamedQuery(name = "Item.findByModel", query = "SELECT i FROM Item i WHERE i.model = :model")
	, @NamedQuery(name = "Item.findBySupplier", query = "SELECT i FROM Item i WHERE i.supplier = :supplier")})
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;


	@Basic(optional = false)
     @Column(name = "id")
	@Id
	private int id;
	@Column(name = "code")
	private String code;
	@Column(name = "category")
	private String category;
	@Column(name = "type")
	private String type;
	@Column(name = "brand")
	private String brand;
	@Column(name = "model")
	private String model;
	@Column(name = "description")
	private String description;
	@Column(name = "supplier")
	private String supplier;
	@Column(name = "unit")
	private String unit;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "cost")
	private Double cost;
	@Column(name = "price0")
	private Double price0;
	@Column(name = "price1")
	private Double price1;
	@Column(name = "updated")
	private String updated;
	@Basic(optional = false)
     @Column(name = "quantity")
	private double quantity;

	public Item() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Double getPrice0() {
		return price0;
	}

	public void setPrice0(Double price0) {
		this.price0 = price0;
	}

	public Double getPrice1() {
		return price1;
	}

	public void setPrice1(Double price1) {
		this.price1 = price1;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Object[] toArray() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
}
