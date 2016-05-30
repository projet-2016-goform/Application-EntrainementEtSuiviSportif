package fr.iutvalence.info.dut.m2107;

/**
 * Statut d'une personne ayant un imc et plusieurs droits relatif aux entrainement
 */
public class Utilisateur implements Profil {

	/**
	 * Prénom de la personne
	 */
	private String prenom;
	/**
	 * Nom de la personne
	 */
	private String nom;
	/**
	 * Mail de la personne
	 */
	private String mail;
	/**
	 * Mot de passe de la personne
	 */
	private String mdp;
	/**
	 * Age de la personne
	 */
	private int age;
	/**
	 * Taille de la personne
	 */
	private int taille;
	/**
	 * Poids de la personne
	 */
	private int poids;
	/**
	 * Imc de chaque utilisateur
	 */
	private double imc;
	/**
	 * Sexede l'utilisateur
	 */
	private Sexe sexe;
	
	
	/**
	 * Constructeur d'un utilisteur
	 * @param prenom
	 * @param nom
	 * @param sexe
	 * @param mail
	 * @param mdp
	 * @param age
	 * @param taille
	 * @param poids
	 */
	public Utilisateur(String prenom, String nom, Sexe sexe, String mail, String mdp, int age, int taille, int poids) {
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
		this.mail = mail;
		this.mdp = mdp;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.imc = this.poids / Math.pow(this.taille, 2);
	}
	
	/**
	 * retourne le prenom 
	 * @return le prenom correspondant, sous forme d'une chaine de caractères.
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * retourne le nom
	 * @return le nom correspondant, sous forme d'une chaine de caractères.
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * retourne le sexe
	 * @return le sexe correspondant, sous forme d'une chaine de caractères (Un enum).
	 */
	public Sexe getSexe() {
		return this.sexe;
	}
	
	/**
	 * retourne le mail
	 * @return le mail correspondant, sous forme d'une chaine de caractères.
	 */
	public String getMail() {
		return this.mail;
	}

	/**
	 * retourne le mot de passe
	 * @return le mot de passe  correspondant, sous forme d'une chaine de caractères.
	 */
	public String getMdp() {
		return this.mdp;
	}

	/**
	 * retourne l'age
	 * @return l'age  correspondant, sous forme d'un entier.
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * retourne la taille 
	 * @return la taille correspondant, sous forme d'un entier.
	 */
	public int getTaille() {
		return this.taille;
	}
	
	/**
	 * retourne le poids
	 * @return le poids  correspondant, sous forme d'un entier.
	 */
	public int getPoids() {
		return this.poids;
	}

	/**
	 * retourne l'imc 
	 * @return l'imc correspondant, sous forme d'un nombre réel double.
	 */
	public double getImc() {
		return this.imc;
	}

	/**
	 * methode permettant une deconnexion avec le nom
	 * @param nom
	 */
	public void deconnexion(String nom){
		
	}
	
	/**
	 * Permet de créer un entrainement
	 */
	public void creationEntrainement() {
		
		// TODO - implement Utilisateur.creationEntrainement
		throw new UnsupportedOperationException();
	}



	/**
	 * Après chaque entrainement, l'utilisateut peut le valider afin qu'on lui en propose un autre
	 */
	public Entrainement validationEntrainement() {
		// TODO - implement Utilisateur.validationEntrainement
		// TODO - Mettre a jour le suivis en fontion
		throw new UnsupportedOperationException();
	}

	/**
	 * Pendant chaque entrainement, un utilisateur peu abandonner un entrainement, ce qui annulera sa progression dans ce dernier
	 */
	public void abandonnerEntrainement() {
		// TODO - implement Utilisateur.abandonnerEntrainement
		throw new UnsupportedOperationException();
	}
	
	/**
	 * retourne le profil
	 * @return le profil sous forme d'une chaine de caractère 
	 */
	public String toString() {
		return "Votre profil : "
				+ 
				
				System.getProperty("line.separator")+
				"IMC :" + getImc()+
				System.getProperty("line.separator")+
				"Prenom :" + getPrenom()+
				System.getProperty("line.separator")+
				"Nom :" + getNom()+
				System.getProperty("line.separator")+
				"Sexe :" + getSexe()+
				System.getProperty("line.separator")+
				"Mail :" + getMail()+
				System.getProperty("line.separator")+
				"AGE :" + getAge()+
				System.getProperty("line.separator")+
				"Taille :" + getTaille()+
				System.getProperty("line.separator")+
				"Poids :" + getPoids();
	}
}