package Ex1;

public class Avion extends Vehicule{
	public String typemoteur ;
	public int nbrh_vol;

	/*("HELICES" ou "REACTION") ;*/
	
	public  Avion(String marque,int dateachat,double prixachat,String typemoteur,int nbrh_vol){
		super(marque,dateachat,prixachat);
		this.typemoteur=typemoteur;
		this.nbrh_vol=nbrh_vol;
	}
	public void affiche(){
		
		super.affiche();
		System.out.println("");
		System.out.print(" Le type de moteur est "+this.typemoteur+" Le nombres nombre d'heures de vol est "+this.nbrh_vol);
	}
	public void calculePrix(int anneActuelle){
		if(super.marque=="HELICES" )
			
		super.prixcourant=super.prixachat-0.1*(nbrh_vol/100)*super.prixachat;
		
		else
			super.prixcourant=super.prixachat-0.1*(nbrh_vol/1000)*super.prixachat;
		
		if(super.prixcourant<0){
			super.prixcourant=0;
		}
		
	}
}
