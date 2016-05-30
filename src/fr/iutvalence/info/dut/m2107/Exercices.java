package fr.iutvalence.info.dut.m2107;
import java.util.*;
/**
 *  Exercice r�alis� durant une s�ance
 */
public class Exercices {

	/** 
	 * Le pattern d'un exercice 
	 */
	// Commence par n'importe quel caract�re et peu contenir des chiffres sauf en debut 
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
	 *  Nombre de r�p�tition de cet entrainement 
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
	 * @return Le libelle correspondant, sous forme d'une chaine de caract�res.
	 */
	public String getLibelle() {
		return this.libelle;
	}

	/**
	 * retourne la quantit� 
	 * @return la quantit� correspondant, sous forme d'un entier.
	 */
	public int getQuantite() {
		return this.quantite;
	}
	
	/**
	 * Methode pour cr�er un exerice.
	 */
	public void creationExercices() {
		// TODO - implement Exercices.creationExercices // DONE
		throw new UnsupportedOperationException();
	}
	/**
	 * M�thode pour supprimer un exerice.
	 */
	public void supprimer() {
		// TODO - implement Exercices.supprimer // DONE
		throw new UnsupportedOperationException();
	}

	/**
	 *  Faire un string pour dire l'exercice
	 * @return Un string pour r�capitul� la quantit� et le libelle d'un exerice
	 */
	public String toString() {
		return "Exercices [libelle=" + libelle + ", quantite=" + quantite + "]";
	}

	
	/**
	 *Cr�ation d'une m�thode booleen pour le test d'un exercice true si les conditions sont ok. 
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