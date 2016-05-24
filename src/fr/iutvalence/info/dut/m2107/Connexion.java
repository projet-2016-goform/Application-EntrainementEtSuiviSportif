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

	@Override
	public String toString() {
		return "Vous vous êtes connecté avec le mail :" + mail;
	}
	
}