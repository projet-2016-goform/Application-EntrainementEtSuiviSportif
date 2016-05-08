package fr.iutvalence.info.dut.m2107;
import java.util.*;
import java.lang.Math;
/**
 * Représentation d'une personne
 */
public class Personne implements GoForm {

	/**
	 * Prénom de la personne
	 */
	private String prenom;
	/**
	 * Nom de la personne
	 */
	private String nom;
	/**
	 * Mail de la personne
	 */
	private String mail;
	/**
	 * Mot de passe de la personne
	 */
	private String mdp;
	/**
	 * Age de la personne
	 */
	private int age;
	/**
	 * Taille de la personne
	 */
	private int taille;
	/**
	 * Poids de la personne
	 */
	private int poids;
	
	public String getPrenom() {
		return this.prenom;
	}

	public String getNom() {
		return this.nom;
	}

	public String getMail() {
		return this.mail;
	}

	public String getMdp() {
		return this.mdp;
	}

	public int getAge() {
		return this.age;
	}
	
	public int getTaille() {
		return this.taille;
	}
	
	public int getPoids() {
		return this.poids;
	}

	public Personne(String prenom, String nom, String mail, String mdp, int age, int taille, int poids) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.mail = mail;
		this.mdp = mdp;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
	}

	@Override
	public double calculIMC() {
		return this.poids / Math.pow(this.taille, 2);
	}

	@Override
	public Utilisateur enregistre() {
		// TODO Auto-generated method stub
		return null;
	}

}