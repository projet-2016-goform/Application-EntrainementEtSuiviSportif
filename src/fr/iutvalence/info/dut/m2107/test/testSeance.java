package fr.iutvalence.info.dut.m2107.test;

import fr.iutvalence.info.dut.m2107.Exercices;
import fr.iutvalence.info.dut.m2107.Seance;
import junit.framework.*;

public class testSeance extends TestCase {


		public testSeance(String name)
		{
			super(name);
		}

		public void estSeance(){
			
			//assertEquals(Seance.estSeance());
		}
		public static Test suite() 
		{
			TestSuite suite= new TestSuite();
			suite.addTest(new testExercices("estExercice"));
			return suite;
			}
}
