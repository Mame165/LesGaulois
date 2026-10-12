package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;


	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public Boolean resterPotion() {
		return quantitePotion != 0;
	}

	public int prendreLouche() {
		quantitePotion -= 1;
		if (!resterPotion()) {
			forcePotion = 0;
		}
		return forcePotion;
	}
}
