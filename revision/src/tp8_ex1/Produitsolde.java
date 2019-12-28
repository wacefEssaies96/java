package tp8_ex1;

public class Produitsolde extends Produit {
	private int taux_remise;
	Produitsolde(String designation,int prix_unitaire,int quantite,int taux_remise){
		super(designation,prix_unitaire,quantite);
		this.taux_remise = taux_remise;
	}
	
	public void affiche() {
		System.out.println("Designation : "+super.getDesignation());
		System.out.println("Prix unitaire : "+super.getPrix_unitaire());
		System.out.println("Quantite = "+super.getQuantite());
	}
	public int calcul() {
		return super.getPrix_unitaire()*(1+this.taux_remise/100)*super.getQuantite();
	}
}
