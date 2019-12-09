package gest_biblio;

public class Livre extends Document {
	
	private int nbpage;
	private String auteur;
	
	Livre(int numEnreg,String titre,String auteur,int nbpage){
		super(titre,numEnreg);
		this.nbpage = nbpage;
		this.auteur = auteur;
	}
	
	public String toString() {
		return "Numero d'enregistrement : "+getNumEnreg()+" Titre : "+getTitre()+" Auteur : "+getAuteur()+" Nombre de pages : "+getNbPage();
	}
	
	public int getNbPage() {
		return nbpage;
	}
	public String getAuteur() {
		return auteur;
	}

}
