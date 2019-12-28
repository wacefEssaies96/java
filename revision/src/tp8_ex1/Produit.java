package tp8_ex1;

public abstract class Produit {
	
	private String designation;
	private int prix_unitaire;
	private int quantite;
	
	Produit(String designation,int prix_unitaire,int quantite){
		this.designation = designation;
		this.prix_unitaire = prix_unitaire;
		this.quantite = quantite;
	}
	
	public void affiche() {
		System.out.println("Designation : "+this.designation);
		System.out.println("Prix unitaire : "+this.prix_unitaire);
		System.out.println("Quantite = "+this.quantite);
	}
	
	public abstract int calcul();
	
	public String getDesignation() {
		return this.designation;
	}
	public int getPrix_unitaire() {
		return this.prix_unitaire;
	}
	public int getQuantite() {
		return this.quantite;
	}
}
