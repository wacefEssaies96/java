package Ex1;

public class Vehicule {

	public String marque;
	public int dateachat;
	public double prixachat;
	public double prixcourant;

	public Vehicule(String marque,int dateachat,double prixachat){
		this.marque=marque;
		this.dateachat=dateachat;
		this.prixachat=prixachat;
	}
	
	public void affiche(){

		System.out.println("");
		System.out.print(" La marque est "+this.marque+" La Date d'achat"+this.dateachat+" Le prix d'achat"+this.prixachat+" Le prix courantest "+this.prixcourant);
	}
	public void calculePrix(int anneActuelle){
		this.prixcourant=this.prixachat-this.prixachat*0.01*(anneActuelle-this.dateachat);
	}
}
