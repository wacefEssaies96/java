package tp8_ex2;

public class Produitnonsolde implements Produit {
	
	private String designation;
	private int prix_unitaire;
	private int quantite;
	
	public Produitnonsolde(String designation,int prix_unitaire,int quantite){
		this.designation = designation;
		this.prix_unitaire = prix_unitaire;
		this.quantite = quantite;
	}
	public void affiche() {
		System.out.println("Designation : "+getDesignation());
		System.out.println("Prix unitaire : "+getPrix_unitaire());
		System.out.println("Quantite = "+getQuantite());
	}
	public int calcul() {
		return prix_unitaire*quantite;
	}
	public String getDesignation() {
		return designation;
	}
	public int getPrix_unitaire() {
		return prix_unitaire;
	}
	public int getQuantite() {
		return quantite;
	}
}
