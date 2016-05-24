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
	 * Deuxi�me test sur le prenom pour tester si il y a bien la majuscule[A-Z] et des caract�res [a-z] et aucun caract�re de type [0-9] 
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","aze","Aze",15,"Att0", 20,15),false);
	/**
	 * Troix�me test sur le nom pour tester si il y a bien la majuscule [A-Z] et des caract�res [a-z] et aucun caract�re de type [0-9]
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","aze",15,"Att0", 20,15),false);
	/**
	 * Quatri�me test sur le poids qui doit �tre strictement sup�rieur a 0 et non n�gatif
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,15),false);
	/**
 	* Cinqui�me test sur le mot de passe qui doit avoir une majuscule ou un caract�re simple 
 	*/
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,15),false);
	/**
	 * Sixi�me test 
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,15),false);
	/**
	 * Speti�me test 
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