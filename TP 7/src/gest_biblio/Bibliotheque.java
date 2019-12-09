package gest_biblio;

public class Bibliotheque {
	
	protected Document[] tabdoc;
	protected int capacite;
	
	Bibliotheque(int capacite){
		this.capacite = capacite;
		this.tabdoc = new Document[capacite];
	}
	
	public void afficherDocuments() {
		for(int i = 0 ; i<capacite ; i++) {
			if(tabdoc[i]!=null)
			System.out.println(tabdoc[i].toString());
		}
	}
	
	Document document(int i) {
		return tabdoc[i];
	}
	
	boolean ajouter(Document doc) {
		for(int i=0 ; i<tabdoc.length ; i++) {
			if(tabdoc[i] == null) {
				tabdoc[i] = doc;
				return true;
			}
		}
		return false;
	}
	
	boolean supprimer(Document doc) {
		for (int i = 0 ; i < tabdoc.length ; i++) {
			if(tabdoc[i] == doc) {
				tabdoc[i]=null;
			}
		}
		return true;
	}
	
	public void afficherAuteurs() {
		for (int i=0;i<tabdoc.length;i++) {
			if(tabdoc[i] instanceof Livre) {
				System.out.println(tabdoc[i].toString());
			}
		}
	}
}
