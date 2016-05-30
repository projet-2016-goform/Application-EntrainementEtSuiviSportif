package fr.iutvalence.info.dut.m2107;

/**
 *  Cette classe nous permet de nous connecter � l'application
 */ 
public class Connexion {

	/** 
	 * le mail
	 */ 
	private String mail;
	/** 
	 *le mot de passe
	 */
	private String mdp;
	
	/**
	 * Le pattern du mail 
	 */
	// Email doit �tre avec un caract�re puis un  @ un autre type de caract�re et enfin un point suivit d'autre caract�re tout en miniscule.
	private static final String EMAIL_PATTERN = "^[_aA-Za-z0-9--]+(\\.[_A-Za-z0-9--]+)*@[A-Za-z0-9--]+(\\.[A-Za-z0-9--]+)+$";
	
	/**
	 * le pattern du mot de passe
	 */
	//Mot de passe comprend une majusculte en d�but puis n'importe quel caract�re de type [a-z 0-9]
	private static final String MOT_DE_PASSE_PATTERN ="^[A-Z][A-Za-z0-9]+";
	
	
	/**
	 * Permet de se connecter en respectant les param�tres fix�s
	 * @param mail
	 * @param mdp
	 * @return 
	 */
	
	public Connexion(String mail, String mdp) {
		this.mail = mail;
		this.mdp = mdp;
	}
	
	/**
	 * retourne le mail
	 * @return Le mail correspondant, sous forme d'une chaine de caract�res.
	 */
	public String getMail() {
		return mail;
	}
	

	/**
	 * retourne le mot de passe
	 * @return Le mot de passe correspondant, sous forme d'une chaine de caract�res.
	 */
	public String getMdp() {
		return mdp;
	}

	

	/**
	 * Faire un string pour dire qu'on est bien connect� 
	 * @return Un string pour dire qu'on est bien conn�ct� 
	 */
	public String toString() {
		return "Vous vous �tes connect� avec le mail :" + this.mail;
	}
	
	/** 
	 * M�thode qui permet de faire un test 
	 * @param mail
	 * @param MDP
	 * @return un booleen qui dit si le test fonctionne.
	 */
	public static boolean estUneConnexion(String mail, String MDP) {
		if(mail.matches(EMAIL_PATTERN)&& MDP.matches(MOT_DE_PASSE_PATTERN))
			return true;
		else return false;
	}
	
}