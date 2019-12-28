package tp8_ex2;

public class Produitsolde implements Produit {
	
	private String designation;
	private int prix_unitaire;
	private int quantite;
	private int taux_remise;
	
	public Produitsolde(String designation,int prix_unitaire,int quantite,int taux_remise){
		this.designation = designation;
		this.prix_unitaire = prix_unitaire;
		this.quantite = quantite;
		this.taux_remise = taux_remise;
	}
	public void affiche() {
		System.out.println(designation+" "+prix_unitaire+" "+quantite);
	}
	public int calcul() {
		return (prix_unitaire*(1+(taux_remise/100))*quantite);
	}
}
