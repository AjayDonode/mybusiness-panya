package org.dnex.panya.user.model;

import org.springframework.boot.orm.jpa.EntityScan;

@EntityScan
//@Table(schema = "panya", name = "user")
public class User {

	private long id;
	private String name;
	private String lastName;
	private Address address; // [street1,stree2,city,state,country,zip]
	private Contact contact;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
