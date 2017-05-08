/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
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
	@NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i")
	, @NamedQuery(name = "Item.findById", query = "SELECT i FROM Item i WHERE i.id = :id")
	, @NamedQuery(name = "Item.findByCode", query = "SELECT i FROM Item i WHERE i.code = :code")
	, @NamedQuery(name = "Item.findByCategory", query = "SELECT i FROM Item i WHERE i.category = :category")
	, @NamedQuery(name = "Item.findByDescription", query = "SELECT i FROM Item i WHERE i.description = :description")
	, @NamedQuery(name = "Item.findByUnit", query = "SELECT i FROM Item i WHERE i.unit = :unit")
	, @NamedQuery(name = "Item.findByCost", query = "SELECT i FROM Item i WHERE i.cost = :cost")
	, @NamedQuery(name = "Item.findByPrice0", query = "SELECT i FROM Item i WHERE i.price0 = :price0")
	, @NamedQuery(name = "Item.findByPrice1", query = "SELECT i FROM Item i WHERE i.price1 = :price1")
	, @NamedQuery(name = "Item.findByQuantity", query = "SELECT i FROM Item i WHERE i.quantity = :quantity")})
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public Object[] toArray(){
		return new Object[]{this.code, this.category, this.description, this.supplier, this.cost, this.price0, this.price1, this.quantity};
	}
	
	public static int getFieldCount(){
		return 8;
	}
	
	public static String getFieldName(int idx){
		switch(idx){
			case 0: return "Kodi";
			case 1: return "Kategoria";
			case 2: return "Pershkrimi";
			case 3: return "Fornitori";
			case 4: return "Kosto";
			case 5: return "Cmimi";
			case 6: return "Oferta";
			case 7: return "Sasia";
			default: return "";
		}
	}
	
	public static Class getFieldClass(int idx){
		switch(idx){
			case 0: return String.class;
			case 1: return String.class;
			case 2: return String.class;
			case 3: return String.class;
			case 4: return Double.class;
			case 5: return Double.class;
			case 6: return Double.class;
			case 7: return Double.class;
			default: return Object.class;
		}
	}
	
	public static Boolean isFieldEditable(int idx){
		return false;
	}
}
