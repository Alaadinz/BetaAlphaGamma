package legendOfZoe;

public abstract class Case {
	protected String representation;
	//protected Point position;
	
	public String getRepresentation() {
		return representation;
	}
	
	// Methode qui defenit si une interraction entre Zoe et la case est possible
	// ==> TODO(possibleemnt entre Monstre vivant et Zoe aussi
	public abstract boolean interactionPossible();
	
	
	//Interaction entre Personnage et la case
	public abstract void interagir();
	
	

}
