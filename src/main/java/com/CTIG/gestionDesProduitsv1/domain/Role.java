package com.CTIG.gestionDesProduitsv1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity	
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private String name;
	@ManyToMany
	private User user;
	
	public Role() {
		
	}

	public Role(String name, User user) {
		
		this.name = name;
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
