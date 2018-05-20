package com.walid.mobi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue
	@Column(name="idCl")
	private Long idCl;

	@Column(name="cin")
	private Integer cin;
   
	@Column(name="nom")
	private String nom;
   
	@Column(name="prenom")
	private String prenom;

	@Column(name="adresse")
	private String adresse;
   
	@Column(name="email")
	private String email;
	
	@OneToMany(mappedBy="client",cascade=CascadeType.ALL)
	private List<Article> articles;
	
	@OneToMany(mappedBy="client",cascade=CascadeType.ALL)
	private List<Commande> commandes;
	
	@OneToMany(mappedBy="client",cascade=CascadeType.ALL)
	private List<Reglement> reglements;
	
	public Long getIdCl() {
		return idCl;
	}
	public void setIdCl(Long id) {
		this.idCl = id;
	}
	public Integer getCin() {
		return cin;
	}
	public void setCin(Integer cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Client(int cin, String nom, String prenom, String adresse, String email) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
	}
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Client [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", email="
				+ email + "]";
	}

}
