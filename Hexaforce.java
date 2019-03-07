package legendOfZoe;

//==> TODO interraction entre Hexa et niveau 

public class Hexaforce extends Item {
	
	public Hexaforce() {
		
	}

	// interraction Zoe et Hexaforce est true
	public boolean interactionPossible(Zoe zoe) {
		return true;
	}
	
	//L'orsque Zoe interragit avec Hexaforce, possedeHexa devient True
	public void interragir(Zoe zoe) {
		Zoe.setPossedeHexa(true);
		
	}
	

}
