package fr.iutvalence.info.dut.m2107;

/**
 * Classe principale permettant de lancer ses entrainement ou d'en créer
 */
public class Entrainement {

	/**
	 * Type d'entrainement (force, endurance, etc.)
	 */
	private boolean typeEntrainement;
	/**
	 * Nom de l'entrainement
	 */
	private String libelleEntrainement;
	
	public Entrainement (boolean typeEntrainement0, String libelleEntrainement0)
	{
		this.typeEntrainement=typeEntrainement0;
		this.libelleEntrainement=libelleEntrainement0;
	}
	

	/**
	 * Nombre de séance dans l'entrainement
	 */
	public int getNbSeance() {
		// TODO - implement Entrainement.getNbSeance
		throw new UnsupportedOperationException();
	}

	/**
	 * Création de l'entrainement
	 */
	public void creationEntrainement() {
		// TODO - implement Entrainement.creationEntrainement
		throw new UnsupportedOperationException();
	}

	/**
	 * Méthode supprimant l'entrainement
	 */
	public void supprimer() {
		// TODO - implement Entrainement.supprimer
		throw new UnsupportedOperationException();
	}

}