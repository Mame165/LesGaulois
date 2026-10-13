package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] chef = new Gaulois[1];
	private Gaulois[] villageois;
	public Village(final int NB_VILLAGEOIS_MAX) {
		villageois = new [NB_VILLAGEOIS_MAX];
	}
	public Village(String nom, int nbVillageois, Gaulois[] chef) {
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return chef;
	}

	
}
