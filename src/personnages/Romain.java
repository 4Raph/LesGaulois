package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		assert force >0 : "Force négative";
		equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup (int forceCoup) {
		force-= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne ...");
		}
	}
	
	public void sEquiper (Equipement equipement) {
		switch(nbEquipement) {
			case 0:
				equipements[nbEquipement]=equipement;
				nbEquipement++;
				System.out.println("Le soldat "+ nom + " s'équipe avec un "+ equipement+".");
				break;
			
			case 1:
				if (equipements[0]==equipement) {
					System.out.println("Le soldat "+ nom + " possède déjà un "+ equipement+" !");
				}
				else {
					equipements[nbEquipement]=equipement;
					nbEquipement++;
					System.out.println("Le soldat "+ nom + " s'équipe avec un "+ equipement+".");
				}
				break;
			case 2:
				System.out.println("Le soldat "+ nom +" est déjà bien protégé !");
				break;
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE); 
	}
}
