package fr.iutvalence.info.dut.m2107;
import java.util.*;

import fr.iutvalence.info.dut.m2107.test.SeanceTest;
/**
 * Propre à chaque utilisateur, le suivis affiche des statistiques relative aux entrainements
 */
public class Suivi {
	
	/** 
	 *une constante d'un nombre d'exercice max
	 */
	public static final int NB_EXERCICES_MAX = 250;

	/**
	 * la date
	 */ 
	private Date date;
	
	/**
	 * la largeur
	 */ 
	private int width;
	
	/**
	 * la taille 
	 */
	private int height;
	
	/**
	 * Un tableau double pour un suivi 
	 */
	private Suivi[][] suivis;
	
	private Seance seance = new SeanceTest();
			
	 /**
	  * Constructeur d'un suivi avec une date 
	  * @param date
	  */
	public Suivi(Date date) {
		// Affichage de la liste des exercice fait dans la journée
		System.out.println(date);
	}

	/**
	 * constructeur d'un suivi avec une date de debut et de fin
	 * @param date
	 * @param dateFin
	 */
	public Suivi(Date date, Date dateFin) {
		System.out.println("------ Suivis du jour ------");
		//Affichage d'un tableau (eventuellement d'un graphique) des exercices faits sur un intervalle donné
		width = this.seance.getNbExercice();
		height = NB_EXERCICES_MAX;
		suivis = new Suivi[width][height];
		
		final List<Exercices> seances = seance.createExercices();
		
		//On initialise a vide
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				suivis[i][j] = null;
			}
		}
		
		//On ajoute les données qu'il y a dans la liste de séance	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}