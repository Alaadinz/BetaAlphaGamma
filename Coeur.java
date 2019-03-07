package legendOfZoe;

public class Coeur extends Item {
	
	private boolean etatCoeur = true;
	public Coeur() {
		
	}

	public boolean interactionPossible() {
		return true;
		}
	
	
	public void interragir() {
	
		  
	}

	public boolean getEtatCoeur() {
		return etatCoeur;
	}

	public void setEtatCoeur(boolean etatCoeur) {
		this.etatCoeur = etatCoeur;
	}
}
