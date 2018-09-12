package org.hibernate.bugs.entity;

import javax.persistence.Entity;

@Entity
public class Pen extends MyProduct {
	private String color;
	
	public Pen(long productId) {
		super(productId);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}