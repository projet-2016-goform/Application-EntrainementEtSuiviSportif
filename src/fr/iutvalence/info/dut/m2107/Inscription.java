package fr.iutvalence.info.dut.m2107;
import java.util.Scanner;
/**
 * Il s'agit d'une personne sans droits
 */
public abstract class Inscription {

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
		//Sexe sexe = sc.nextLine();
		
		System.out.println("Entrez votre age :");
		int age = sc.nextInt();
		
		System.out.println("Entrez un mot de passe :");
		String password = sc.nextLine();
		
		System.out.println("Entrez votre taille :");
		int taille = sc.nextInt();
		
		System.out.println("Entrez votre poids :");
		int poids = sc.nextInt();
		
		System.out.println("Type d'entrainement souhaité ? :");
		//TypeEntrainement entrainement = sc.nextLine();
		
		//Utilisateur personne = new Utilisateur(prenom, nom,sexe, mail, password, age, taille, poids);
		
		return null;
	}

}
