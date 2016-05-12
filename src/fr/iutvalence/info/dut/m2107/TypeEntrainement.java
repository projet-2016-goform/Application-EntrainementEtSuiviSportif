package fr.iutvalence.info.dut.m2107;

public enum TypeEntrainement {
	FITNESS("Fitnesse"),
	ENDURANCE("Endurance"),
	INTENSE("Intense");
	
	private final String typeEntrainement;
	
	private TypeEntrainement(String type)
	{
		this.typeEntrainement = type;
	}
	
	@Override
	public String toString() {
		return typeEntrainement;
	}
}
