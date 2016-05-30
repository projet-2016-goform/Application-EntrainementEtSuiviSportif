package fr.iutvalence.info.dut.m2107.test;

import fr.iutvalence.info.dut.m2107.Exercices;
import junit.framework.*;
/**
 * test de estExerice d'un exerice
 */
public class testExercices extends TestCase {

	public testExercices(String name)
	{
		super(name);
	}

	/**
	 * methode de test
	 */
	public void estExercice(){
		/** 
		 * Premier test sur un caractère non valide ou chiffre sur le nom de l'exercice
		 */
		assertEquals(Exercices.estUnExercice("Pompe@2",5),false);
		assertEquals(Exercices.estUnExercice("2Pompe",5),false);
		
		/**
		 *  Deuxième test sur un nombre non valide de répétition 
		 */
		assertEquals(Exercices.estUnExercice("PompeV1",0),false);
		assertEquals(Exercices.estUnExercice("Pompe", -1),false);
		assertEquals(Exercices.estUnExercice("Pompe", 251),false);
	
		/**
		 *  test exercice valide
		 */
		assertEquals(Exercices.estUnExercice("PompeV1",5),true);
	}
	public static Test suite() 
	{
		TestSuite suite= new TestSuite();
		suite.addTest(new testExercices("estExercice"));
		return suite;
	}
}
