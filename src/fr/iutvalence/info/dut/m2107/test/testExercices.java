package fr.iutvalence.info.dut.m2107.test;

import fr.iutvalence.info.dut.m2107.Exercices;
import junit.framework.*;
public class testExercices extends TestCase {

	public testExercices(String name)
	{
		super(name);
	}

	public void estExercice(){
		/** test avec un caractere invalide dans une chaine */
		assertEquals(Exercices.estUnExercice("Pompe@2",5),false);
		/** Un nombre d'exercice qui n'est pas strictement supérieur a 1 **/
		
		assertEquals(Exercices.estUnExercice("PompeV1",0),false);
		/** Un nombre d'exercices négatif qui n'est pas un entier valide*/ 
		assertEquals(Exercices.estUnExercice("Pompe", -1),false);
		/** Une entrée d'exercice valide */
		assertEquals(Exercices.estUnExercice("PompeV1",5),true);
	}
	public static Test suite() 
	{
		TestSuite suite= new TestSuite();
		suite.addTest(new testExercices("estExercice"));
		return suite;
		}
}
