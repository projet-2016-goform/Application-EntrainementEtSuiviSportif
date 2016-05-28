package fr.iutvalence.info.dut.m2107;

public class Connexion {
	
	private String mail;
	private String mdp;
	
	/**
	 * Permet de se connecter en respectant les paramètres fixés
	 * @param mail
	 * @param mdp
	 * @return 
	 */
	
	public Connexion(String mail, String mdp) {
		this.mail = mail;
		this.mdp = mdp;
	}
	
	
	public String getMail() {
		return mail;
	}
	


	public String getMdp() {
		return mdp;
	}

	

	@Override
	public String toString() {
		return "Vous vous êtes connecté avec le mail :" + mail;
	}
	// Email doit être avec un caractère puis un  @ un autre type de caractère et enfin un point suivit d'autre caractère tout en miniscule.
	private static final String EMAIL_PATTERN = "^[_aA-Za-z0-9--]+(\\.[_A-Za-z0-9--]+)*@[A-Za-z0-9--]+(\\.[A-Za-z0-9--]+)+$";

	//Mot de passe comprend une majusculte en début puis n'importe quel caractère de type [a-z 0-9]
	private static final String MOT_DE_PASSE ="^[A-Z][A-Za-z0-9]+";
	
	public static boolean estUneConnexion(String mail, String MDP) {
		if(mail.matches(EMAIL_PATTERN)&& MDP.matches(MOT_DE_PASSE))
			return true;
		else return false;
	}
	
}