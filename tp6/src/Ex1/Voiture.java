package Ex1;

public class Voiture extends Vehicule{
	
	public float cylindrée;
	public int nbrportes;
	public float puissance;
	public float kilométrage;
	
	public  Voiture(String marque,int dateachat,double prixachat,float cylindrée,int nbrportes,float puissance,float kilométrage){
		super(marque,dateachat,prixachat);
		this.cylindrée=cylindrée;
		this.nbrportes=nbrportes;
		this.puissance=puissance;
		this.kilométrage=kilométrage;
	}
	public void affiche(){
		super.affiche();
		System.out.println("");
		System.out.print(" La cylindrée est "+this.cylindrée+" Le nombres de portes est "+this.nbrportes+" La puissance"+this.puissance+" Le kilométrage est "+this.kilométrage);
	}

	public void calculePrix(int anneActuelle){
		if(super.marque=="Ferrari" || super.marque=="Porsche")
			
		super.prixcourant=super.prixachat-super.prixachat*0.02*(anneActuelle-super.dateachat)-0.05*(kilométrage/10000)+0.2*super.prixachat;
		
		else
			super.prixcourant=super.prixachat-super.prixachat*0.02*(anneActuelle-super.dateachat)-0.05*(kilométrage/10000)-0.1*super.prixachat;
		if(super.prixcourant<0){
			super.prixcourant=0;
		}
		
	}
}
