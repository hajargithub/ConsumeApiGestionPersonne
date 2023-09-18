package com.codingTech.entity;

import java.util.Date;



import org.springframework.format.annotation.DateTimeFormat;

public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private int age;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateNaissance;
	public Personne() {
		super();
	}
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}
