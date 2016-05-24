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
	assertEquals(Inscription.estUneInscription("moi@couc45ou.","Aze","Aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("@couc45ou.fr","Aze","Aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@.fr","Aze","Aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moicouc45ou.fr","Aze","Aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moicouc45ou","Aze","Aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription(".com","Aze","Aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("","Aze","Aze",15,"Att0", 20,15),false);
	/**
	 * Deuxième test sur le prenom pour tester si il y a bien la majuscule[A-Z] et des caractères [a-z] et aucun caractère de type [0-9] 
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","aze","Aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","0ze","Aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","aZe","Aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","","aze",15,"Att0", 20,15),false);
	/**
	 * Troixème test sur le nom pour tester si il y a bien la majuscule [A-Z] et des caractères [a-z] et aucun caractère de type [0-9]
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","0ze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","eZe",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","aze",15,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","",15,"Att0", 20,15),false);
	/**
	 * Quatrième test sur le age qui doit être strictement supérieur a 0 et non négatif
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",0,"Att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",-15,"Att0", 20,15),false);
	/**
 	* Cinquième test sur le mot de passe qui doit avoir une majuscule ou un caractère simple [A-Z][a-zA-Z0-9]
 	*/
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"att0", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"", 20,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"atZ0", 20,15),false);
	/**
	 * Sixième test sur la taille qui doit être comprise entre 0 exclu et 300 exclu
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 300,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 0,15),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0",-1,15),false);/**
	 * Spetième test  test sur le poids qui doit être strictement supérieur a 0 et non négatif
	 */
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,0),false);
	assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",-15,"Att0", 20,-15),false);
	
	
	
	
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