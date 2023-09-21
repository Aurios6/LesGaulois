package personnage;

public class Romains {
	private String nom;
	private int force;
	
	public Romains(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	private void recevoirCoup(int coupForce) {
		force -= coupForce;
		
		if (force > 0){
			parler("A�e");
		}else {
			parler("j'abandonne");
		}

	}
	
}
	


