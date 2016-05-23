package fr.iutvalence.info.dut.m2107;

/**
 * Statut permettent de supprimer ou cr�er un entrainement
 */
public class Admin extends Utilisateur {
	/**
	 * Droit de l'administrateur pour le diff�rentier d'un utilisateur
	 */
	private boolean droits;

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