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
		// TODO - implement Exercices.creationExercices // DONE
		throw new UnsupportedOperationException();
	}

	public void supprimer() {
		// TODO - implement Exercices.supprimer // DONE
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Exercices [libelle=" + libelle + ", quantite=" + quantite + "]";
	}
	
	private static final String TYPE_NAME_EXERCICE = "^[a-zA-Z0-9]+";
	
	/**
	 *Création d'une méthode booleen pour le test d'un exercice true si les conditions sont ok. 
	 * @param libelle
	 * @param quantite
	 * @return
	 */
	public static boolean estUnExercice(String libelle, int quantite){
		if(libelle.matches(TYPE_NAME_EXERCICE)&& quantite > 0)
			return true ;
		else return false;
	}


}