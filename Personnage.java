package legendOfZoe;

public abstract class Personnage {
	protected String nom; 		// nom du personnage.
	protected int HP;			// pourcentage de vie.
	protected int maxHp;		// ourcentage maximal de vie
	protected static int dmg; 			// pourcentage de dommages.
	protected int nbVies; 		// nombres de vies. 
	
	protected boolean tour; 	// Boolean qui determine si c'est le tour du personnage.
	protected static boolean etatVie; 	// Boolean qui determine si le personnage est vivant ou non vivant.
	protected boolean deplacementValide; // Boolean pour defenir si un deplacement est valide ou invalide.
	
	public Personnage (int HP, int dmg,int maxHp, int nbVies) {
		
		this.nom = nom;
		this.HP  = HP;
		this.dmg = dmg;
		this.maxHp = maxHp;
		this.nbVies = nbVies;
		this.tour = tour;
		this.etatVie = etatVie;
		
	}
	
	//Getters et Setters
	public String getNom() {
		return nom;
	}
	public int getHP() {
		return HP;
		}
	public int getMaxHp() {
		return maxHp;
	}
	public int getDmg() {
		return dmg;
		}
	public int getNbVies() {
		return nbVies;
	}
	
	public boolean getTour() {
		return tour;
	}
	public boolean getEtatVie() {
		return etatVie;
	}
	public boolean deplacementValide() {
		return deplacementValide;
	}
	public void setDmg(int dmg) {
		this.dmg=dmg;
	}
	public void setNbVies (int nbVies) {
		this.nbVies = nbVies;
		}
	//Setter pour HP
	public void setHP(int HP) {
		if (HP <0) { // Dans le cas ou HP descends en bas de 0;
			this.HP = 0;
		}else {
			this.HP = HP;
		}
	}
	public void setEtatVie(boolean etatVie) {
		this.etatVie = etatVie;
	}
	
	// Methode pour decrementer les HP lors d'une attaque 
	public void attaquer (Personnage autre ) {
		autre.setHP(autre.getHP()-this.getDmg());
		}
	
	//Methode pour decrementer une vie
	public void decrementNbVies () {
		if (this.HP == 0) {
			setNbVies(getNbVies()-1);
			this.HP = 100; //Personnage perds une vie et son pourcentage de vie "Reset"
			if(this.nbVies == 0) {
				this.etatVie = false;    // => TODO valider si c'est bon
			}
			//  ==> TODO rajouter une facon de reset le nombre de HP apres decrementation de vie
		}
	}
	
	
	public abstract void afficher ();
	
	
}
