package fr.iutvalence.info.dut.m2107;

/**
 * Statut permettent de supprimer ou cr�er un entrainement
 * Un admin qui h�rite de utilisateur qui aura un acc�s plus avanc� 
 */
public class Admin extends Utilisateur {

	/**
	 * droits : true si on peu supprimer  ou cr�er un entrainement  
	 */
	private boolean droits;

	/**
	 * constructeur d'un admin qui est red�finie par un droit
	 * @param prenom
	 * @param nom
	 * @param sexe
	 * @param mail
	 * @param mdp
	 * @param age
	 * @param taille
	 * @param poids
	 * @param droits
	 */
	public Admin(String prenom, String nom, Sexe sexe, String mail, String mdp, int age, int taille, int poids, boolean droits) 
	{
		super(prenom, nom, sexe, mail, mdp, age, taille, poids);
		this.droits = droits;
	}

	/**
	 * Permet de cr�er un entrainement propos� dans une cat�gorie precise de l'utilisateur.
	 */
	public void creationEntrainement(boolean droits) {
		// TODO - implement Admin.creationEntrainement
		throw new UnsupportedOperationException();
	}

	/**
	 * Permet de supprimer un entrainement
	 */
	public void supprimer(boolean droits) {
		// TODO - implement Admin.supprimer
		throw new UnsupportedOperationException();
	}

}