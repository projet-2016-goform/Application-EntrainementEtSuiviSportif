package fr.iutvalence.info.dut.m2107;

/**
 * Statut permettent de supprimer ou cr�er un entrainement
 */
public class Admin extends Personne {

	public Admin(String prenom, String nom, String mail, String mdp, int age,
			int taille, int poids) 
	{
		super(prenom, nom, mail, mdp, age, taille, poids);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Permet de cr�er un entrainement propos� dans une cat�gorie precise de l'utilisateur.
	 */
	public void creationEntrainement() {
		// TODO - implement Admin.creationEntrainement
		throw new UnsupportedOperationException();
	}

	/**
	 * Permet de supprimer un entrainement
	 */
	public void supprimer() {
		// TODO - implement Admin.supprimer
		throw new UnsupportedOperationException();
	}

}