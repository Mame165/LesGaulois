package village_gaulois;

import objets.Equipement;
import objets.Trophee;
import personnages.Gaulois;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophees[nbTrophee]= new Trophee(gaulois, equipement);
		nbTrophee++;
	}
	public String extraireInstructionsOCaml() {
		String chaine = "let musee = [ ";
		for (int i = 0; i < nbTrophee; i++) {
			String nom = trophees[i].donnerNom();
			String equip = trophees[i].getEquipement().toString();
			chaine += "\n\"" + nom + "\", " + "\"" + equip+"\"";
			if (i<nbTrophee-1) {
				chaine +=";";
			}
		}
		return chaine + "\n ]";
	}
}
