package com.walid.mobi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="article")
public class Article implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.TABLE)
	//@Column(name="idArt")
	private Long idArt;
	
	@Column(name="quanititeSeuil")
	private Integer quantiteSeuil;
	
	@Column(name="prix")
	private double prix;
	
	@ManyToOne
	@JoinColumn(name="idCmd")
	private Commande commande;
	
	@ManyToOne
	@JoinColumn(name="idCl")
	private Client client;
	
	public Long getIdArt() {
		return idArt;
	}
	public void setIdArt(Long id) {
		this.idArt = id;
	}
	public Integer getQuantiteSeuil() {
		return quantiteSeuil;
	}
	public void setQuantiteSeuil(Integer quantiteSeuil) {
		this.quantiteSeuil = quantiteSeuil;
	}
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public Article(double prix, Integer quantiteSeuil) {
		super();
		this.quantiteSeuil = quantiteSeuil;
		this.prix = prix;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Article [quantiteSeuil=" + quantiteSeuil + ", prix=" + prix + "]";
	}
	


	

}
