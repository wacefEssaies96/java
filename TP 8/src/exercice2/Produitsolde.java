package exercice2;

public class Produitsolde implements Produit {
	private String designation;
	private float prix_unitaire;
	private int quantite;
	private int taux_remise;
	Produitsolde(String designation,float prix_unitaire,int quantite,int taux_remise){
		this.designation = designation;
		this.prix_unitaire = prix_unitaire;
		this.quantite = quantite;
		this.taux_remise = taux_remise;
	}
	public void affiche() {
		System.out.println(prix_unitaire+" "+quantite+" "+designation+" "+taux_remise);
	}

	public double calcul() {
		return (prix_unitaire*(1+(taux_remise/100))*quantite);
	}

}
