package fr.iutvalence.info.dut.m2107;

/**
 * Permettra de choisir entre homme et femme afin d'eviter les champs autres
 */
public enum Sexe {
	HOMME("FEMME"), 
	FEMME("HOMME");
	
	/** Le sexe */ 
	private final String sexe;
	
	/** 
	 * Constructeur d'un sexe 
	 * @param sexe
	 */
	private Sexe(String sexe)
	{
		this.sexe = sexe;
	}
	
	
	/**
	 * retourne le mot de passe
	 * @return Le mot de passe correspondant, sous forme d'une chaine de caractères.
	 */
	public String toString() {
		return sexe;
	}
}