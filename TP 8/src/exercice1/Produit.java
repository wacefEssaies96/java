package exercice1;

public abstract class Produit implements Magasin {
	private String designation;
	private float prix_unitaire;
	private int quantite;
	
	Produit(String designation,float prix_unitaire,int quantite){
		this.designation = designation;
		this.prix_unitaire = prix_unitaire;
		this.quantite = quantite;
	}
	
	public void affiche() {
		System.out.println("designation : "+designation+" prix_unitaire : "+prix_unitaire+" quantite : "+quantite);
	}
	public abstract double Calcul();
	
	public String getDesignation() {
		return designation;
	}
	public float getPrix_unitaire() {
		return prix_unitaire;
	}
	public int getQuantite(){
		return quantite;
	}
}
