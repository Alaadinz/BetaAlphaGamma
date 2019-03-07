package legendOfZoe;

public class Monstre extends Personnage {
	
	public Monstre (String nom, int HP, int maxHp, int nbVies, boolean tour, boolean etatDeVie, boolean deplacementValide) {
		super(nom, HP, dmg, maxHp, nbVies, tour, etatVie, deplacementValide);
		this.nom = nom;
		this.HP  = HP;
		this.dmg = dmg;
		this.maxHp = maxHp;
		this.nbVies = 1;
		this.tour = false;
		this.etatVie = true;
		}
	
	public int getHP() {
		return super.HP;
		}
	public void setHP(int HP) {
		super.setHP(HP);
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
	public boolean getEtatVie() {
		return etatVie;
		}
	public void setEtatVie(boolean etatVie) {
		super.setEtatVie(etatVie);
		}

	
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}



}
