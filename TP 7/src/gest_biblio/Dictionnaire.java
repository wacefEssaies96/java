package gest_biblio;

public class Dictionnaire extends Document {
	
	private String langue;
	
	Dictionnaire(String langue,int numEnreg,String titre){
		super(titre,numEnreg);
		this.langue = langue;
	}
	
	public String toString() {
		return "Langue : "+langue+" Numero d'enregistrement : "+getNumEnreg()+" Titre  "+getTitre();
	}
	
	public String getLangue() {
		return langue;
	}
}
