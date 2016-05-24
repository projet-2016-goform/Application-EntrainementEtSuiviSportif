package fr.iutvalence.info.dut.m2107;
import java.util.*;
/**
 * Exercice r�alis� durant une s�ance
 */
public class Exercices {

	Collection<Seance> collectionExercices;
	/**
	 * Nom de l'entrainement
	 */
	private String libelle;
	/**
	 * Nombre de r�p�tition de cet entrainement
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