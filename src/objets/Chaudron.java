package objets;

public class Chaudron {
	private int quantitePotion =0;
	private int forcePotion=0;


	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public Boolean resterPotion() {
		return quantitePotion != 0;
	}

	public int prendreLouche() {
		quantitePotion--;
		if (!resterPotion()) {
			forcePotion = 0;
		}
		return forcePotion;
	}
}
