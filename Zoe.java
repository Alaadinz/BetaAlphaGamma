package legendOfZoe;



public class Zoe extends Personnage{
	
	private boolean possedeHexa = false;
	private String nom;
	private Point position;
	private int HP = 100;
	private int dmg = 50;
	private int maxHp = 100;
	private int nbVies = 5;
	private boolean etatVie = true;
	private int nbHexa = 0;
	//private boolean tour;
	
	
	

	public Zoe (Point point, String nom, boolean possedeHexa) {
		super(point, nom);
		this.position = point;
		this.nom = nom;
		
		
		//this.tour = true;
		this.possedeHexa = possedeHexa;
		
	}
	
	public String getNom () {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
		
	public int getHP() {
		return HP;
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
		return dmg;
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
	
	public boolean peuxMonterNiveaux() {
		return possedeHexa;
	}
	
	public int getNbHexa() {
		return nbHexa;
	}
	
	public void setNbHexa(int nbHexa) {
		this.nbHexa = nbHexa;
	}
	
	public void incrementerNbHexa () {
		setNbHexa(getNbHexa()+1);
	}
	
	public boolean getPossedeHexa() {
		return possedeHexa;
	}
	// Quand on commence un Niveaux. Possede Hexa est False
	public  void setPossedeHexa(boolean peuxMonterNiveaux ) {
		this.possedeHexa = peuxMonterNiveaux;
	}
	
	
	
	
	
	// ==> TODO methode pour le deplacement 
	
	
		
		
		
		
		
	
	
	
public void afficher() {
	}
}
