package org.hibernate.bugs.entity;

import java.io.Serializable;

public interface CompositePK extends Serializable {
	int getId();

	public int getClientId();

}
