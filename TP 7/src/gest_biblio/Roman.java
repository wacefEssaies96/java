package gest_biblio;

public class Roman extends Livre {
	
	private int prixLitt;
	
	Roman(String auteur,String titre,int numEnreg,int nbpage,int prixLitt){
		super(numEnreg,titre,auteur,nbpage);
		this.prixLitt = prixLitt;
	}

	public String toString() {
		return "Prix Literaire : "+prixLitt+" Numero d'enregistrement : "+getNumEnreg()+" Titre : "+getTitre()+" Auteur : "+getAuteur()+ " Nombre de page : "+getNbPage();
	}
	
	public int getPrixLitt() {
		return prixLitt;
	}

}
