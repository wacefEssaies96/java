package exercice1;

public class Produitsolde extends Produit {
	
	private float taux_remise;
	
	Produitsolde(float taux_remise,String designation,float prix_unitaire,int quantite){
		super(designation,prix_unitaire,quantite);
		this.taux_remise = taux_remise;
	}
	public void affiche() {
		System.out.println(getDesignation()+" "+getPrix_unitaire()+" "+getQuantite()+" "+taux_remise);
	}
	public double Calcul() {
		return (super.getPrix_unitaire()*(1+(taux_remise/100))*super.getQuantite());
	}
}
