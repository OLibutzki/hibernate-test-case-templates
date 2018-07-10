package org.hibernate.bugs.entity;

import javax.persistence.Entity;

@Entity
public class Adult extends Person {

	public Adult() {
		someInitMethod();
	}

	@Override
	public void someInitMethod() {

	}
}