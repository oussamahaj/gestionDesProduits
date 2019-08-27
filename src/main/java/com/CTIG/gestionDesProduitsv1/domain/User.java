package com.CTIG.gestionDesProduitsv1.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String password;
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private Profile profile;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Adresse> adresse=new HashSet<>();
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Produit> produit=new HashSet<>();
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(
	  name = "user_code", 
	  joinColumns = @JoinColumn(name = "user_id"), 
	  inverseJoinColumns = @JoinColumn(name = "role_name"))
	private Set<Role> role=new HashSet<>();
	public User() {
		
	}
	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Adresse> getAdresse() {
		return adresse;
	}
	public void setAdresse(Set<Adresse> adresse) {
		this.adresse = adresse;
	}
	public Set<Produit> getProduit() {
		return produit;
	}
	public void setProduit(Set<Produit> produit) {
		this.produit = produit;
	}
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	
	
	

}
