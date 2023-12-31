package personnage;

public class Village {
	private String nom;
	private int nbVillageoisMax;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
		
	public Village(String nom,int nbVillageois, int nbVillageoisMax) {
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.nbVillageoisMax = nbVillageoisMax;
		villageois = new Gaulois[nbVillageoisMax];
		}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		}
	
	public String getNom() {
		return nom;
		}
	
	public void ajouterHabitant(Gaulois gaulois){
			 villageois[nbVillageois] = gaulois;
			 nbVillageois ++;
		

	}
	public  void trouverHabitant(int numVillageois){
		System.out.println(villageois[numVillageois].getNom());
	}
	
	public static void main(String[] arg) {
		Village VillageDesIrreductibles;
		VillageDesIrreductibles = new Village("Village Des Irreductibles", 30 , 0);
		System.out.println(VillageDesIrreductibles.getNom());
	}
	
}


