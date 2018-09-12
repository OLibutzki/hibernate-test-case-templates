package org.hibernate.bugs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MyProduct {
    @Id
    private long productId;
    
    private String name;
    
	public MyProduct(long productId) {
		this.productId = productId;
	}

	
	public long getProductId() {
		return productId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
}