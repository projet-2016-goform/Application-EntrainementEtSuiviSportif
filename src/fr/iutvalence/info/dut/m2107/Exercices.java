package fr.iutvalence.info.dut.m2107;
import java.util.*;
/**
 * Exercice réalisé durant une séance
 */
public class Exercices {

	Collection<Seance> collectionExercices;
	/**
	 * Nom de l'entrainement
	 */
	private String libelle;
	/**
	 * Nombre de répétition de cet entrainement
	 */
	private int quantite;
	
	public Exercices(String libelle, int quantite)
	{
		this.libelle=libelle;
		this.quantite=quantite;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void creationExercices() {
		// TODO - implement Exercices.creationExercices
		throw new UnsupportedOperationException();
	}

	public void supprimer() {
		// TODO - implement Exercices.supprimer
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Exercices [libelle=" + libelle + ", quantite=" + quantite + "]";
	}
	


}