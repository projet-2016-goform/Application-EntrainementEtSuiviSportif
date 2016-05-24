package fr.iutvalence.info.dut.m2107;
import java.util.Scanner;
/**
 * Il s'agit d'une personne sans droits
 */
public class Inscription {

	/**
	 * Permet de s'insrire après avoir renseigné tous les attributs de la super classe personne
	 * @return 
	 */
	public Utilisateur Inscritpion() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un mail :");
		String mail = sc.nextLine();

		System.out.println("Entrez votre nom :");
		String nom = sc.nextLine();
		
		System.out.println("Entrez votre prénom :");
		String prenom = sc.nextLine();
		
		System.out.println("Entrez votre sexe :");
		Sexe sexe = Sexe.valueOf(sc.next().toUpperCase());
		
		System.out.println("Entrez votre age :");
		int age = sc.nextInt();
		
		System.out.println("Entrez un mot de passe :");
		String password = sc.nextLine();
		
		System.out.println("Entrez votre taille en Cm :");
		int taille = sc.nextInt();
		
		System.out.println("Entrez votre poids en Kg :");
		int poids = sc.nextInt();
		
		System.out.println("Type d'entrainement souhaité ? :");
		TypeEntrainement type = TypeEntrainement.valueOf(sc.next().toUpperCase());
		
		Utilisateur personne = new Utilisateur(prenom, nom,sexe, mail, password, age, taille, poids);
		
		return personne;
	}
	// Email doit être avec un caractère puis un  @ un autre type de caractère et enfin un point suivit d'autre caractère tout en miniscule.
	private static final String EMAIL_PATTERN = "^[_aA-Za-z0-9--]+(\\.[_A-Za-z0-9--]+)*@[A-Za-z0-9--]+(\\.[A-Za-z0-9--]+)+$";
	// Name comprend nom et prenom avec une majuscule en debut
	private static final String TYPE_NAME = "^[A-Z][a-zA-Z]+$";
	//Mot de passe comprend une majusculte en début puis n'importe quel caractère de type [a-z 0-9]
	private static final String MOT_DE_PASSE ="^[A-Z][A-Za-z0-9]+";

			
	public static boolean estUneInscription(String mail, String name, String prenom, int age, String MDP, int taille, int poids) {
		if (mail.matches(EMAIL_PATTERN) && name.matches(TYPE_NAME)&& prenom.matches(TYPE_NAME)&& age > 0 && MDP.matches(MOT_DE_PASSE)
				&& (taille > 0 && taille < 300) && poids > 0 )
			return true;
		else return false;
	
		
	}
}

