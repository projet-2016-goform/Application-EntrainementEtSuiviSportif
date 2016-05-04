package fr.iutvalence.info.dut.m2107;
import java.util.*;
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

	public void personne() {
		// TODO - implement Personne.personne
		throw new UnsupportedOperationException();
	}

}