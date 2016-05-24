package fr.iutvalence.info.dut.m2107;

/**
 * Permettra de choisir entre homme et femme afin d'eviter les champs autres
 */
public enum Sexe {
	HOMME("FEMME"), 
	FEMME("HOMME");
	
	private final String sexe;
	
	private Sexe(String sexe)
	{
		this.sexe = sexe;
	}
	
	@Override
	public String toString() {
		return sexe;
	}
}