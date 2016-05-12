package fr.iutvalence.info.dut.m2107;
import java.util.Scanner;
/**
 * Il s'agit d'une personne sans droits
 */
public class Anonyme extends Personne implements GoForm {

	public Anonyme(String prenom, String nom, String mail, String mdp, int age, int taille, int poids) {
		super(prenom, nom, mail, mdp, age, taille, poids);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Permet de s'insrire après avoir renseigné tous les attributs de la super classe personne
	 * @return 
	 */
	public Personne Inscritpion() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un mail :");
		String mail = sc.nextLine();

		System.out.println("Entrez votre nom :");
		String nom = sc.nextLine();
		
		System.out.println("Entrez votre prénom :");
		String prenom = sc.nextLine();
		
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
		
		Personne personne = new Personne(prenom, nom, mail, password, age, taille, poids);
		
		return personne;
	}

}