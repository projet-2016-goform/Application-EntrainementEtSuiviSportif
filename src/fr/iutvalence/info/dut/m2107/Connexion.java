package fr.iutvalence.info.dut.m2107;

public class Connexion {
	
	private String mail;
	private String mdp;
	
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
	
	
	public String getMail() {
		return mail;
	}
	


	public String getMdp() {
		return mdp;
	}

	

	@Override
	public String toString() {
		return "Vous vous �tes connect� avec le mail :" + mail;
	}
	// Email doit �tre avec un caract�re puis un  @ un autre type de caract�re et enfin un point suivit d'autre caract�re tout en miniscule.
	private static final String EMAIL_PATTERN = "^[_aA-Za-z0-9--]+(\\.[_A-Za-z0-9--]+)*@[A-Za-z0-9--]+(\\.[A-Za-z0-9--]+)+$";

	//Mot de passe comprend une majusculte en d�but puis n'importe quel caract�re de type [a-z 0-9]
	private static final String MOT_DE_PASSE ="^[A-Z][A-Za-z0-9]+";
	
	public static boolean estUneConnexion(String mail, String MDP) {
		if(mail.matches(EMAIL_PATTERN)&& MDP.matches(MOT_DE_PASSE))
			return true;
		else return false;
	}
	
}