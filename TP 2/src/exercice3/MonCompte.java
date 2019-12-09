package exercice3;

public class MonCompte {
	private double solde;
	static int nombreComptes;
	
	MonCompte(double solde){
		this.solde = solde;
		nombreComptes +=1;
	}
	MonCompte(){
		solde = 0;
		nombreComptes +=1;
	}
	public double getSolde() {
		return solde;
	}
	public static int getNombreCompte() {
		return nombreComptes;
	}
	public void retirer(double montant) {
		solde -= montant;
	}
	public void affiche() {
		System.out.println("Solde : "+solde);
	}
	public void deposer(double montant) {
		solde += montant;
	}
	void transferer(double montant, MonCompte compte) {
		solde -= montant;
		compte.solde += montant;
	}
}
