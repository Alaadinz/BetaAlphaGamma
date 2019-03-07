package legendOfZoe;

public class Potion extends Item {
	
	public Potion() {
	}
		
		
		public boolean interactionPossible() {
			return true;
			}
		
		public void interragir(Zoe zoe) {
			Zoe.setHP(fillHP);
		}
		

		
		
		
	}


