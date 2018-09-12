package org.hibernate.bugs.entity;

import javax.persistence.Entity;

@Entity
public class Book extends MyProduct {
	public Book(long productId) {
		super(productId);
	}

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}