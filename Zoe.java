package legendOfZoe;

public class Zoe extends Personnage{
	
	private boolean possedeHexa = false;
	
	private String nom = "Zoe";
	private int HP = 100;
	private int dmg = 50;
	private int maxHp = 100;
	private int nbVies = 5;
	private boolean etatVie = true;
	private boolean tour = true;
	
	
	

	public Zoe (String nom, int HP, int dmg, int maxHp, int nbVies, boolean tour, boolean etatVie, boolean deplacementValide) {
		super (nom, HP, dmg, maxHp, nbVies, tour, etatVie, deplacementValide);
		
		this.tour = true;
		this.possedeHexa = false;
	}
	
	public String getNom () {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = "Zoe";
	}
		
	public int getHP() {
		return super.HP;
	}
	public void setHP(int HP) {
		super.setHP(HP);
		}
	public int getMaxHp() {
		return maxHp;
	}
	
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	
	public int getdmg() {
		return super.dmg;
	}
	public void setDmg(int dmg) {
		super.setDmg(dmg);	
	}
	public int getNbVies() {
		return nbVies;
	}
	public void setNbVies(int nbVies) {
		super.setNbVies(nbVies);
	}
	public void decrementNbVies() {
		super.decrementNbVies();
	}
	
	public void incrementNbVies() {
		setNbVies(getNbVies()+1);
	}
	
	public void fillHP() {
		setHP(getMaxHp());
	}
	
	public boolean getEtatVie() {
		return etatVie;
		
	}
	public void setEtatVie(boolean etatVie) {
		super.setEtatVie(etatVie);
	}
	
	
	
	public boolean getPossedeHexa() {
		return possedeHexa;
	}
	// Quand on commence un Niveaux. Possede Hexa est False
	public static void setPossedeHexa(boolean possedeHexa ) {
		this.possedeHexa = possedeHexa;
	}
	
	
	
	
	
	// ==> TODO methode pour le deplacement 
	
	
		
		
		
		
		
	
	
	
	public void afficher() {
	}
}
