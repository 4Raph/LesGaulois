package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef (Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int n) {
		return villageois[n];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + trouverHabitant(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix",6,0,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois ("Astérix",6);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		Gaulois obelix = new Gaulois ("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}

}
