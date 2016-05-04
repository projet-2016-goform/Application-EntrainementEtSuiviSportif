package fr.iutvalence.info.dut.m2107;

/**
 * Statut d'une personne ayant un imc et plusieurs droits relatif aux entrainement
 */
public class Utilisateur extends Personne implements Profil {

	/**
	 * Identifiant permettant de diff�rencier les utilisateurs
	 */
	private int id;
	/**
	 * Imc de chaque utilisateur
	 */
	private int imc;

	/**
	 * R�cupere l'imc de l'utilisateur
	 */
	public int getImc() {
		return this.imc;
	}

	/**
	 * Permet de cr�er un entrainement
	 */
	public void creationEntrainement() {
		// TODO - implement Utilisateur.creationEntrainement
		throw new UnsupportedOperationException();
	}

	/**
	 * Permet de se connecter en respectant les param�tres fix�s
	 * @param mail
	 * @param mdp
	 */
	public void connexion(String mail, String mdp) {
		// TODO - implement Utilisateur.connexion
		throw new UnsupportedOperationException();
	}

	public void modifier() {
		// TODO - implement Utilisateur.modifier
		throw new UnsupportedOperationException();
	}

	/**
	 * Apr�s chaque entrainement, l'utilisateut peu le valider afin qu'on lui en propose un autre
	 */
	public Entrainement validationEntrainement() {
		// TODO - implement Utilisateur.validationEntrainement
		throw new UnsupportedOperationException();
	}

	/**
	 * Pendant chaque entrainement, un utilisateur peu abandonner un entrainement, ce qui annulera sa progression dans ce dernier
	 */
	public void abandonnerEntrainement() {
		// TODO - implement Utilisateur.abandonnerEntrainement
		throw new UnsupportedOperationException();
	}

}