package gest_biblio;

public class Document {
	private int numEnreg;
	private String titre;
	
	Document(String titre,int numEnreg){
		this.numEnreg = numEnreg;
		this.titre = titre;
	}
	public boolean equals(Document doc) {
		return doc.numEnreg == numEnreg && doc.titre == titre;
	}
	public String toString() {
		return "Numero d'enregistrement : "+numEnreg+" Titre : "+titre;
	}
	
	public int getNumEnreg() {
		return numEnreg;
	}
	public String getTitre() {
		return titre;
	}
}
