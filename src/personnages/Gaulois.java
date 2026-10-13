package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village = new Village("village", 0, Gaulois chef);

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	

	@Override
	public String toString() {
		return nom;
	}
	public void frapper(Romain romain) {
		String monRomain = romain.getNom();
		System.out.println(nom + "envoie un grand coup dans la machoire de " + monRomain);
		romain.recevoirCoup((force*effetPotion)/3);
		if (effetPotion >1) {
			effetPotion--;
		}
	}
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}


}





