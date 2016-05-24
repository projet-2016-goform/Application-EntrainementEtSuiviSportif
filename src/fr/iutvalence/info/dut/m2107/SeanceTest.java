package fr.iutvalence.info.dut.m2107;

import java.util.LinkedList;
import java.util.List;

public class SeanceTest implements Seance {
	
	public List<Exercices> createExercices()
	{
		final List<Exercices> exercices = new LinkedList<>();
		exercices.add(new Exercices("Pompe",20));
		exercices.add(new Exercices("Jump",50));
		exercices.add(new Exercices("Squat",30));
		exercices.add(new Exercices("Abdos",10));
		return exercices;
	}
	
	/**
	 * Obtenir le nombre d'exercices d'une séance
	 * @return taille de la liste
	 */
	public int getNbExercice() {
		List<Exercices> exercices = createExercices();
		return exercices.size();
	}
	
	public void getLibelleExercice() {
		final List<Exercices> exercices = createExercices();
		
	    for(Exercices exercice : exercices){
	        System.out.println(exercice);
	    }
	}
}
