package fr.iutvalence.info.dut.m2107;
import java.util.*;
/**
 * Exercice r�alis� durant une s�ance
 */
public class Exercices {

	Collection<Seances> collectionExercices;
	/**
	 * Nom de l'entrainement
	 */
	private String libelle;
	/**
	 * Nombre de r�p�tition de cet entrainement
	 */
	private int quantite;
	
	public Exercices(String libelle0, int quantite0)
	{
		this.libelle=libelle0;
		this.quantite=quantite0;
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

}