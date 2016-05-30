package fr.iutvalence.info.dut.m2107;
/**
 * Un enum d'un type d'entrainement
 */
public enum TypeEntrainement {
	FITNESS("Fitnesse"),
	ENDURANCE("Endurance"),
	INTENSE("Intense");
	
	/** 
	 * le type d'entrainement
	 */
	private final String typeEntrainement;
	
	/**
	 * Le type d'entrainement 
	 * @param type
	 */
	private TypeEntrainement(String type)
	{
		this.typeEntrainement = type;
	}
	
	/**
	 * retourne le type d'entrainement
	 * @return Le type d'entrainement correspondant, sous forme d'une chaine de caractères.
	 */
	public String toString() {
		return typeEntrainement;
	}
}
