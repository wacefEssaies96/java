package Ex1;

public class Voiture extends Vehicule{
	
	public float cylindr�e;
	public int nbrportes;
	public float puissance;
	public float kilom�trage;
	
	public  Voiture(String marque,int dateachat,double prixachat,float cylindr�e,int nbrportes,float puissance,float kilom�trage){
		super(marque,dateachat,prixachat);
		this.cylindr�e=cylindr�e;
		this.nbrportes=nbrportes;
		this.puissance=puissance;
		this.kilom�trage=kilom�trage;
	}
	public void affiche(){
		super.affiche();
		System.out.println("");
		System.out.print(" La cylindr�e est "+this.cylindr�e+" Le nombres de portes est "+this.nbrportes+" La puissance"+this.puissance+" Le kilom�trage est "+this.kilom�trage);
	}

	public void calculePrix(int anneActuelle){
		if(super.marque=="Ferrari" || super.marque=="Porsche")
			
		super.prixcourant=super.prixachat-super.prixachat*0.02*(anneActuelle-super.dateachat)-0.05*(kilom�trage/10000)+0.2*super.prixachat;
		
		else
			super.prixcourant=super.prixachat-super.prixachat*0.02*(anneActuelle-super.dateachat)-0.05*(kilom�trage/10000)-0.1*super.prixachat;
		if(super.prixcourant<0){
			super.prixcourant=0;
		}
		
	}
}
