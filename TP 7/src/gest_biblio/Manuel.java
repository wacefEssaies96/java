package gest_biblio;

public class Manuel extends Livre {
	
	private int niveau;
	
	Manuel(int numEnreg,String titre,String auteur,int nbpage,int niveau){
		super(numEnreg,titre,auteur,nbpage);
		this.niveau = niveau;
	}
	public String toString() {
		return "Niveau : "+niveau+" Numero D'enregistrement : "+getNumEnreg()+" Titre : "+getTitre()+" Auteur : "+getAuteur()+" Nombre de page : "+getNbPage();
	}
	public boolean equals(Manuel man) {
		return man.getNumEnreg() == this.getNumEnreg() && man.getTitre() == this.getTitre() && man.getAuteur() == this.getAuteur() && man.getNbPage() == this.getNbPage() && man.niveau == this.niveau;
	}
	public int getNiveau() {
		return niveau;
	}
}
