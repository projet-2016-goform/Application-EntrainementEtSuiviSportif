package fr.iutvalence.info.dut.m2107.test;
/**
 * Classe de test d'une connexion
 */
import fr.iutvalence.info.dut.m2107.Connexion;
import junit.framework.*;

public class testConnexion extends TestCase{
	

		public testConnexion(String name)
		{
			super(name);
		}

		public void estConnexion()
		{
			/*** Premier test sur le mail pour test le pattern **/
			assertEquals(Connexion.estUneConnexion("moi@couc45ou","Motdepasse"),false);
			assertEquals(Connexion.estUneConnexion("moi@couc45ou.","Motdepasse"),false);
			assertEquals(Connexion.estUneConnexion("@couc45ou.fr","Motdepasse"),false);
			assertEquals(Connexion.estUneConnexion("moi@.fr","Motdepasse"),false);
			assertEquals(Connexion.estUneConnexion("moicouc45ou.fr","Motdepasse"),false);
			assertEquals(Connexion.estUneConnexion("moicouc45ou","Motdepasse"),false);
			assertEquals(Connexion.estUneConnexion(".com","Motdepasse"),false);
			assertEquals(Connexion.estUneConnexion("","Motdepasse"),false);
			
			/**
		 	* Deuxieme test sur le mot de passe qui doit avoir une majuscule ou un caractère simple [A-Z][a-zA-Z0-9]
		 	*/
			assertEquals(Connexion.estUneConnexion("moi@couc45ou.com","att0"),false);
			assertEquals(Connexion.estUneConnexion("moi@couc45ou.com",""),false);
			assertEquals(Connexion.estUneConnexion("moi@couc45ou.com","atZ0"),false);
			
			/**
			 * test connexion valide
			 */
			assertEquals(Connexion.estUneConnexion("moi@couc45ou.com","Motdepasse"),true);

			
		}
		public static Test suite() 
		{
			TestSuite suite= new TestSuite();
			suite.addTest(new testExercices("estExercice"));
			return suite;
	}
}