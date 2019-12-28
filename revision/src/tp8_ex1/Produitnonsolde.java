package tp8_ex1;

public class Produitnonsolde extends Produit {
	
	public Produitnonsolde(String designation,int prix_unitaire,int quantite){
		super(designation,prix_unitaire,quantite);
	}
	
	public void affiche() {
		System.out.println("Designation : "+super.getDesignation());
		System.out.println("Prix unitaire : "+super.getPrix_unitaire());
		System.out.println("Quantite = "+super.getQuantite());
	}
	public int calcul() {
		return super.getPrix_unitaire()*super.getQuantite();
	}
}
