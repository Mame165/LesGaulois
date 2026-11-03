package personnages;

import objets.Equipement;
import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force, nb_trophees;
	private int effetPotion = 1;
	private Village village;
	private Equipement[] trophees = new Equipement[100];

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




	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public void sePresenter() {
		if (village == null) {
			System.out.println(prendreParole()+"\"" + "Bonjour, je m'appelle "+ nom + ". Je voyage de villages en villages."+"\"");
		}
		else if (village.getChef().equals(this)) {
			System.out.println(prendreParole()+"\"" + "Bonjour, je m'appelle "+ nom + ". Je suis le chef du village : "+ village.getNom()+".\"");
		}
		else {
			System.out.println(prendreParole() + "\"" + "Bonjour, je m'appelle "+ nom + ". J'habite le village : " + village.getNom()+ ".\"");
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
		effetPotion = 1;
		}
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
	}
}
