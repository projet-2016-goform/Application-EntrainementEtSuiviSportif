package fr.iutvalence.info.dut.m2107;
import java.util.*;

/**
 * Ensemble d'exercices a faire à une date donnée
 */
public interface Seance {

	List<Exercices> createExercices();
	int getNbExercice();
	void getLibelleExercice();
}