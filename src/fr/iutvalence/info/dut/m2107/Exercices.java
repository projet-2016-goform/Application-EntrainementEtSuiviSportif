package fr.iutvalence.info.dut.m2107;
import java.util.*;
/**
 *  Exercice réalisé durant une séance
 */
public class Exercices {

	/** 
	 * Le pattern d'un exercice 
	 */
	// Commence par n'importe quel caractère et peu contenir des chiffres sauf en debut 
	private static final String TYPE_EXERCICE_PATTERN = "^[a-zA-Z][a-zA-Z0-9]+";
	
	/** 
	 une collection
	 */
	Collection<Seance> collectionExercices;
	
	/**
	 * Nom de l'entrainement
	 */
	private String libelle;

	/**
	 *  Nombre de répétition de cet entrainement 
	 */
	private int quantite;
	
	/**
	 * Constructeur d'un exercice 
	 * @param libelle
	 * @param quantite
	 */
	public Exercices(String libelle, int quantite)
	{
		this.libelle=libelle;
		this.quantite=quantite;
	}

	/**
	 * retourne le libelle
	 * @return Le libelle correspondant, sous forme d'une chaine de caractères.
	 */
	public String getLibelle() {
		return this.libelle;
	}

	/**
	 * retourne la quantité 
	 * @return la quantité correspondant, sous forme d'un entier.
	 */
	public int getQuantite() {
		return this.quantite;
	}
	
	/**
	 * Methode pour créer un exerice.
	 */
	public void creationExercices() {
		// TODO - implement Exercices.creationExercices // DONE
		throw new UnsupportedOperationException();
	}
	/**
	 * Méthode pour supprimer un exerice.
	 */
	public void supprimer() {
		// TODO - implement Exercices.supprimer // DONE
		throw new UnsupportedOperationException();
	}

	/**
	 *  Faire un string pour dire l'exercice
	 * @return Un string pour récapitulé la quantité et le libelle d'un exerice
	 */
	public String toString() {
		return "Exercices [libelle=" + libelle + ", quantite=" + quantite + "]";
	}

	
	/**
	 *Création d'une méthode booleen pour le test d'un exercice true si les conditions sont ok. 
	 * @param libelle
	 * @param quantite
	 * @return un booleen qui dit si le test fonctionne.
	 */
	public static boolean estUnExercice(String libelle, int quantite){
		if(libelle.matches(TYPE_EXERCICE_PATTERN)&& (quantite > 0 && quantite > 250))
			return true ;
		else return false;
	}


}