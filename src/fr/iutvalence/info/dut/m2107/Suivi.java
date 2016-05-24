package fr.iutvalence.info.dut.m2107;
import java.util.*;
/**
 * Propre à chaque utilisateur, le suivis affiche des statistiques relative aux entrainements
 */
public class Suivi {
	
	public static final int NB_EXERCICES_MAX = 250;

	private Date date;
	private int width;
	private int height;
	
	private Suivi[][] suivis;
	private Seance seance = new SeanceTest();
			

	public Suivi(Date date) {
		// Affichage de la liste des exercice fait dans la journée
		System.out.println(date);
	}

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