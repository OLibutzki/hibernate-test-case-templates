package org.hibernate.bugs.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "adult")
public class Adult extends Person {

	public Adult() {
		someInitMethod();
	}

	@Override
	public void someInitMethod() {

	}
}