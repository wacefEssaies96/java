package exercice2;

public class Produitnonsolde implements Produit {
	
	String designation;
	float prix_unitaire;
	int quantite;
	
	Produitnonsolde(String designation,float prix_unitaire,int quantite){
		this.designation = designation;
		this.prix_unitaire = prix_unitaire;
		this.quantite = quantite;
	}
	

	public void affiche() {
		System.out.println(prix_unitaire+" "+quantite+" "+designation);
	}

	public double calcul() {
		return (prix_unitaire * quantite);
	}

	
	

}
