package org.hibernate.bugs.entity;


@SuppressWarnings("all")
public class PersonId implements CompositePK {

	private int id;

	private int clientId;

	public PersonId() {
	}

	public PersonId(int aId, int aClientId) {
		setId(aId);
		setClientId(aClientId);
	}

	public int getId() {
		return id;
	}

	public void setId(int aId) {
		this.id = aId;
	}

	public int getClientId() {

		return clientId;
	}

	public void setClientId(int aClientId) {
		clientId = aClientId;
	}

	@Override
	public String toString() {

		Class<?> clazz = getClass();
		return clazz.getSimpleName() + "@Id=" + getId() + ",clientId=" + getClientId();
	}
}
