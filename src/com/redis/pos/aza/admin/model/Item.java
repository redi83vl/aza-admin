/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.pos.aza.admin.model;

import java.util.Objects;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class Item {
	private final String code;
	private final String description;
	private final String unit;

	public Item(String code, String description, String unit) {
		this.code = code;
		this.description = description;
		this.unit = unit;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public String getUnit() {
		return unit;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Item other = (Item) obj;
		if (!Objects.equals(this.code, other.code)) {
			return false;
		}
		if (!Objects.equals(this.description, other.description)) {
			return false;
		}
		return Objects.equals(this.unit, other.unit);
	}
}
