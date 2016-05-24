package fr.iutvalence.info.dut.m2107.test;
import fr.iutvalence.info.dut.m2107.Inscription;
import junit.framework.*;

public class testInscription extends TestCase {


public testInscription(String name)
		{
			super(name);
		}
public void estInscription()
{
	/**
	 * Premier test si le mail est ok ou non.
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou","Aze","Aze",15,"Att0", 20,15),false);
	/**
	 * Deuxième test sur le prenom pour tester si il y a bien la majuscule[A-Z] et des caractères [a-z] et aucun caractère de type [0-9] 
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","aze","Aze",15,"Att0", 20,15),false);
	/**
	 * Troixème test sur le nom pour tester si il y a bien la majuscule [A-Z] et des caractères [a-z] et aucun caractère de type [0-9]
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","aze",15,"Att0", 20,15),false);
	/**
	 * Quatrième test sur le poids qui doit être strictement supérieur a 0 et non négatif
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,15),false);
	/**
 	* Cinquième test sur le mot de passe qui doit avoir une majuscule ou un caractère simple 
 	*/
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,15),false);
	/**
	 * Sixième test 
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,15),false);
	/**
	 * Spetième test 
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,15),false);
	
	
	
	
	/**
	 * Test du tout qui fonctionne
	 */
	
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,15),true);
	assertEquals(Inscription.estUneInscription("moi@coucou.com","Aze","Aze",15,"Att0", 20,15),true);
}


public static Test suite() 
{
	  TestSuite suite= new TestSuite();
	  suite.addTest(new testInscription("estInscription"));
	  return suite;
}

}