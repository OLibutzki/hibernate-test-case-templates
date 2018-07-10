package org.hibernate.bugs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.bugs.entity.Adult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This template demonstrates how to develop a test case for Hibernate ORM,
 * using the Java Persistence API.
 */
public class JPAUnitTestCase {

	private EntityManagerFactory entityManagerFactory;

	@Before
	public void init() {
		entityManagerFactory = Persistence.createEntityManagerFactory("templatePU");
	}

	@After
	public void destroy() {
		entityManagerFactory.close();
	}

	// Entities are auto-discovered, so just add them anywhere on class-path
	// Add your tests, using standard JUnit.
	@Test
	public void hhh123Test() throws Exception {
		final EntityManager entityManager = entityManagerFactory.createEntityManager();
		{
			entityManager.getTransaction().begin();
			Adult adult = new Adult();
			adult.setName("Arjun Kumar");
			entityManager.persist(adult);
			entityManager.getTransaction().commit();
		}
		{
			entityManager.getTransaction().begin();
			final List<Adult> adultsCalledArjun = entityManager
					.createQuery("SELECT a from Adult a WHERE a.name = :name", Adult.class)
					.setParameter("name", "Arjun Kumar").getResultList();
			final Adult adult = adultsCalledArjun.iterator().next();
			entityManager.remove(adult);
			entityManager.getTransaction().commit();
		}
		entityManager.close();

	}
}
