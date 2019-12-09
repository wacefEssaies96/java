package gest_biblio;

public class Revue extends Document {
	
	private int mois;
	private int annee;
	
	Revue(int mois,int annee,int numEnreg,String titre){
		super(titre,numEnreg);
		this.mois = mois;
		this.annee = annee;
	}
	
	public void affiche() {
	
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	public String toString() {
		return "Numero d'enregistrement : "+getNumEnreg()+" Titre : "+getTitre()+" Date : "+mois+"/"+annee;
	}
}
