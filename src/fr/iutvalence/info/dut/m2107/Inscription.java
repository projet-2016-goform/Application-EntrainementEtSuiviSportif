package fr.iutvalence.info.dut.m2107;
import java.util.Scanner;
/**
 * La classe inscription permet de s'inscrire et de pouvoir se connecter.
 */
public class Inscription {
	
	/** Le pattern du mail */
	// Email doit être avec un caractère puis un  @ un autre type de caractère et enfin un point suivit d'autre caractère tout en miniscule.
	private static final String EMAIL_PATTERN = "^[_aA-Za-z0-9--]+(\\.[_A-Za-z0-9--]+)*@[A-Za-z0-9--]+(\\.[A-Za-z0-9--]+)+$";
	// Name comprend nom et prenom avec une majuscule en debut
	
	/** Le pattern du nom et prénom */
	private static final String NAME_PATTERN = "^[A-Z][a-zA-Z]+$";
	
	/** Le pattern du mot de passe */
	//Mot de passe comprend une majusculte en début puis n'importe quel caractère de type [a-z 0-9]
	private static final String MOT_DE_PASSE_PATTERN ="^[A-Z][A-Za-z0-9]+";

	/**
	 * Permet de s'insrire après avoir renseigné tous les attributs de la super classe personne
	 * @return cela nous retourne une personne 
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

	/**
	 * Création d'une méthode booleen pour le test d'une Inscription true si les conditions sont ok
	 * @param mail le mail
	 * @param name le nom
	 * @param prenom le prenom
	 * @param age l'age
	 * @param MDP le mot de passe 
	 * @param taille la taille 
	 * @param poids le poids 
	 * @return un booleen qui dit si le test fonctionne.
	 */
	public static boolean estUneInscription(String mail, String name, String prenom, int age, String MDP, int taille, int poids) {
		if (mail.matches(EMAIL_PATTERN) && name.matches(NAME_PATTERN)&& prenom.matches(NAME_PATTERN)&& age > 0 && MDP.matches(MOT_DE_PASSE_PATTERN)
				&& (taille > 0 && taille < 300) && poids > 0 )
			return true;
		else return false;	
	}
}

