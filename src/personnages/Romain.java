package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements= new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup>0;
		int forceInit = force;
		force = force - forceCoup;
		if (force < 1) {
			parler("J\'abandonne");
			assert isInvariantVerified();
		}
		else {
			parler("Aie ");
			assert isInvariantVerified();
		}
		assert forceInit>force;
	}
	
	private boolean isInvariantVerified() {
		return force >=0;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0: {
			ajouterEquipement(equipement);
			break;
		}
		case 1:{
			if (equipements[0]==equipement) {
				System.out.println("Le soldat "+ nom+ " possède déjà un "+ equipement.toString()+" !");
				break;
			}
			else {
				ajouterEquipement(equipement);
				break;
			}
		}
		default:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
		}
	}

	private void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement]= equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom+ " s'équipe avec un "+ equipement.toString()+" !");
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}
