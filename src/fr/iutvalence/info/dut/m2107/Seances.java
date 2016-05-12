package fr.iutvalence.info.dut.m2107;
import java.util.*;

/**
 * Ensemble d'exercices a faire a une date donnée
 */
public class Seances {

	/**
	 * Liste d'exercices de la séance
	 */
	private List<Exercices> exercices;
	
	public List<Exercices> createExercices()
	{
		final List<Exercices> exercices = new LinkedList<>();
		exercices.add(new Exercices("Pompe",20));
		exercices.add(new Exercices("Jump",50));
		exercices.add(new Exercices("Squat",30));
		return exercices;
	}

	/**
	 * Créer une séance d'exercices
	 * @param date
	 * @param exercices
	 */
	public Seances(List<Exercices> exercices) {
		super();
		this.exercices = exercices;
	}


	/**
	 * Obtenir le nombre d'exercices d'une séance
	 * @return taille de la liste
	 */
	public int getNbExercice() {
		return this.exercices.size();
	}



	/**
	 * Créer une séance en tant qu'utilisateur
	 */
	public void creationSeances() {
		// TODO - implement Seances.supprimer
		throw new UnsupportedOperationException();
	}
	/**
	 * Supprimer une séance en tant qu'utilisateur
	 */
	public void supprimer() {
		// TODO - implement Seances.supprimer
		throw new UnsupportedOperationException();
	}

}