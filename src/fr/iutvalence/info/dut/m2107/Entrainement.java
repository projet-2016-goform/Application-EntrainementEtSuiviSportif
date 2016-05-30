package fr.iutvalence.info.dut.m2107;

import java.awt.List;
import java.text.DateFormat;
import java.util.*;

/** 
 * Classe permettant de lancer ses entrainements ou d'en cr�er
 */
public class Entrainement {

	/** 
	 * Type d'entrainement (force, endurance, etc.)
	 */
	private TypeEntrainement type;
	
	/** 
	 * Nom de l'entrainement 
	 */
	private String libelle;
	
	/**
	 * Date de l'entrainement
	 */
	private Date date;
	
	/** 
	 *Liste de s�ances  
	 */
	private ArrayList<Seance> seances;
	
	/** 
	 * Methode pour ajouter une s�ance d'exercices
	 * @return la s�ance 
	 */
	
	public ArrayList<Seance> createSeances()
	{
		final ArrayList<Seance> seances = new ArrayList<>();
		//seances.add(new Seance(null));
		return seances;
	}
	
	/**
	 * Cr�ation d'un entrainement
	 * @param type
	 * @param libelle
	 * @param date
	 * @param seances
	 */
	public Entrainement (TypeEntrainement type, String libelle, Date date, ArrayList<Seance> seances)
	{
		this.type = type;
		this.libelle = libelle;
		this.date = date;
		this.seances = seances;
	}
	
	/**
	 * Obtenir la date de la s�ance
	 * @return date
	 */
	public Date getDate() {
		return this.date;
	}
	
	/**
	 * Nombre de s�ance dans l'entrainement
	 */
	public int getNbSeance() {
		// TODO - implement Entrainement.getNbSeance
		throw new UnsupportedOperationException();
	}

	/**
	 * Cr�ation de l'entrainement // DONE
	 */
	public void creationEntrainement() {
		// TODO - implement Entrainement.creationEntrainement
		throw new UnsupportedOperationException();
	}

	/**
	 * M�thode supprimant l'entrainement // DONE
	 */
	public void supprimer() {
		// TODO - implement Entrainement.supprimer
		throw new UnsupportedOperationException();
	}

}