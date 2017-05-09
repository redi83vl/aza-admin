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
@Table(name = "ItemStock")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "ItemStock.findAll", query = "SELECT i FROM ItemStock i")
	, @NamedQuery(name = "ItemStock.findById", query = "SELECT i FROM ItemStock i WHERE i.id = :id")
	, @NamedQuery(name = "ItemStock.findByCode", query = "SELECT i FROM ItemStock i WHERE i.code = :code")
	, @NamedQuery(name = "ItemStock.findByCategory", query = "SELECT i FROM ItemStock i WHERE i.category = :category")
})
public class ItemStock implements Serializable {

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
	@Column(name = "unit")
	private String unit;
	@Basic(optional = false)
     @Column(name = "Qendra")
	private double qendra;
	@Basic(optional = false)
     @Column(name = "Fieri")
	private double fieri;
	@Basic(optional = false)
     @Column(name = "Pajtoni")
	private double pajtoni;
	@Basic(optional = false)
     @Column(name = "Elbasani")
	private double elbasani;
	@Basic(optional = false)
     @Column(name = "Kavaja")
	private double kavaja;
	@Basic(optional = false)
     @Column(name = "Vlora")
	private double vlora;
	@Basic(optional = false)
     @Column(name = "Durresi")
	private double durresi;
	@Basic(optional = false)
     @Column(name = "Shkodra")
	private double shkodra;
	@Basic(optional = false)
     @Column(name = "Selvia")
	private double selvia;
	@Basic(optional = false)
     @Column(name = "Lushnja")
	private double lushnja;
	@Basic(optional = false)
     @Column(name = "Korca")
	private double korca;
	@Basic(optional = false)
     @Column(name = "Servisi")
	private double servisi;
	@Basic(optional = false)
     @Column(name = "Shumica")
	private double shumica;
	@Basic(optional = false)
     @Column(name = "Total")
	private double total;

	public ItemStock() {
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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getQendra() {
		return qendra;
	}

	public void setQendra(double qendra) {
		this.qendra = qendra;
	}

	public double getFieri() {
		return fieri;
	}

	public void setFieri(double fieri) {
		this.fieri = fieri;
	}

	public double getPajtoni() {
		return pajtoni;
	}

	public void setPajtoni(double pajtoni) {
		this.pajtoni = pajtoni;
	}

	public double getElbasani() {
		return elbasani;
	}

	public void setElbasani(double elbasani) {
		this.elbasani = elbasani;
	}

	public double getKavaja() {
		return kavaja;
	}

	public void setKavaja(double kavaja) {
		this.kavaja = kavaja;
	}

	public double getVlora() {
		return vlora;
	}

	public void setVlora(double vlora) {
		this.vlora = vlora;
	}

	public double getDurresi() {
		return durresi;
	}

	public void setDurresi(double durresi) {
		this.durresi = durresi;
	}

	public double getShkodra() {
		return shkodra;
	}

	public void setShkodra(double shkodra) {
		this.shkodra = shkodra;
	}

	public double getSelvia() {
		return selvia;
	}

	public void setSelvia(double selvia) {
		this.selvia = selvia;
	}

	public double getLushnja() {
		return lushnja;
	}

	public void setLushnja(double lushnja) {
		this.lushnja = lushnja;
	}

	public double getKorca() {
		return korca;
	}

	public void setKorca(double korca) {
		this.korca = korca;
	}

	public double getServisi() {
		return servisi;
	}

	public void setServisi(double servisi) {
		this.servisi = servisi;
	}

	public double getShumica() {
		return shumica;
	}

	public void setShumica(double shumica) {
		this.shumica = shumica;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public Object[] toArray(){
		return new Object[]{
			this.code, 
			this.category, 
			this.description, 
			this.unit, 
			this.qendra, 
			this.fieri, 
			this.pajtoni, 
			this.elbasani,
			this.kavaja,
			this.vlora,
			this.durresi,
			this.shkodra,
			this.selvia,
			this.lushnja,
			this.korca,
			this.shumica,
			this.servisi,
			this.total
		};
	}
	
	public static int getFieldCount(){
		return 18;
	}
	
	public static String getFieldName(int idx){
		switch(idx){
			case 0: return "Kodi";
			case 1: return "Kategoria";
			case 2: return "Pershkrimi";
			case 3: return "Njesia";
			case 4: return "Qendra";
			case 5: return "Fieri";
			case 6: return "Pajtoni";
			case 7: return "Elbasani";
			case 8: return "Kavaja";
			case 9: return "Vlora";
			case 10: return "Durresi";
			case 11: return "Shkodra";
			case 12: return "Selvia";
			case 13: return "Lushnja";
			case 14: return "Korca";
			case 15: return "Shumica";
			case 16: return "Servisi";
			case 17: return "Total";
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
			case 8: return Double.class;
			case 9: return Double.class;
			case 10: return Double.class;
			case 11: return Double.class;
			case 12: return Double.class;
			case 13: return Double.class;
			case 14: return Double.class;
			case 15: return Double.class;
			case 16: return Double.class;
			case 17: return Double.class;
			default: return Object.class;
		}
	}
	
	public static Boolean isFieldEditable(int idx){
		return false;
	}
	
}
