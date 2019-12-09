package exercice1;

public class Produitnonsolde extends Produit{
	
	Produitnonsolde(String designation,float prix_unitaire,int quantite){
		super(designation,prix_unitaire,quantite);
	}
	public double Calcul() {
		return (super.getPrix_unitaire()*super.getQuantite());
	}
	
}
