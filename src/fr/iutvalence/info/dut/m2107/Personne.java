/**
 * Représentation d'un personne
 */
public class Personne implements GoForm {

	/**
	 * Prénom de la personne
	 */
	private string prenom;
	/**
	 * Nom de la personne
	 */
	private string nom;
	/**
	 * Mail de la personne
	 */
	private string mail;
	/**
	 * Mot de passe de la personne
	 */
	private string mdp;
	/**
	 * Age de la personne
	 */
	private int age;

	public string getPrenom() {
		return this.prenom;
	}

	public string getNom() {
		return this.nom;
	}

	public string getMail() {
		return this.mail;
	}

	public string getMdp() {
		return this.mdp;
	}

	public int getAge() {
		return this.age;
	}

	public void personne() {
		// TODO - implement Personne.personne
		throw new UnsupportedOperationException();
	}

}