package fr.iutvalence.info.dut.m2107;
import java.util.*;

/**
 * Ensemble d'exercices a faire a une date donn�e
 */
public class Seances {

	/**
	 * Liste d'exercices de la s�ance
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
	 * Cr�er une s�ance d'exercices
	 * @param date
	 * @param exercices
	 */
	public Seances(List<Exercices> exercices) {
		super();
		this.exercices = exercices;
	}


	/**
	 * Obtenir le nombre d'exercices d'une s�ance
	 * @return taille de la liste
	 */
	public int getNbExercice() {
		return this.exercices.size();
	}



	/**
	 * Cr�er une s�ance en tant qu'utilisateur
	 */
	public void creationSeances() {
		// TODO - implement Seances.supprimer
		throw new UnsupportedOperationException();
	}
	/**
	 * Supprimer une s�ance en tant qu'utilisateur
	 */
	public void supprimer() {
		// TODO - implement Seances.supprimer
		throw new UnsupportedOperationException();
	}

}