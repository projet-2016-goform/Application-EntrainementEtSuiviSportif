package fr.iutvalence.info.dut.m2107.test;
import fr.iutvalence.info.dut.m2107.Inscription;
import junit.framework.*;
/**
 *test de classe d'une inscription
 */
public class testInscription extends TestCase {


	public testInscription(String name)
			{
				super(name);
			}
	
		/** 
		 * Methode de test  
		 */
	public void estInscription()
	{
		/**
		 * Premier test sur le mail pour test le pattern
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
		 * Deuxi�me test sur le prenom pour tester si il y a bien la majuscule[A-Z] et des caract�res [a-z] et aucun caract�re de type [0-9] 
		 */
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","aze","Aze",15,"Att0", 20,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","0ze","Aze",15,"Att0", 20,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","aZe","Aze",15,"Att0", 20,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","","aze",15,"Att0", 20,15),false);
		/**
		 * Troix�me test sur le nom pour tester si il y a bien la majuscule [A-Z] et des caract�res [a-z] et aucun caract�re de type [0-9]
		 */
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","0ze",15,"Att0", 20,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","eZe",15,"Att0", 20,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","aze",15,"Att0", 20,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","",15,"Att0", 20,15),false);
		/**
		 * Quatri�me test sur le age qui doit �tre strictement sup�rieur a 0 et non n�gatif
		 */
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",0,"Att0", 20,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",-15,"Att0", 20,15),false);
		/**
	 	* Cinqui�me test sur le mot de passe qui doit avoir une majuscule ou un caract�re simple [A-Z][a-zA-Z0-9]
	 	*/
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"att0", 20,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"", 20,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"atZ0", 20,15),false);
		/**
		 * Sixi�me test sur la taille qui doit �tre comprise entre 0 exclu et 300 exclu
		 */
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 300,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 0,15),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0",-1,15),false);
		/**
		 * Speti�me test  test sur le poids qui doit �tre strictement sup�rieur a 0 et non n�gatif
		 */
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",15,"Att0", 20,0),false);
		assertEquals(Inscription.estUneInscription("moi@couc45ou.com","Aze","Aze",-15,"Att0", 20,-15),false);
		
		
		
		
		/**
		 * Test d'une inscription correct 
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