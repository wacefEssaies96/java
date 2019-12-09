package gest_biblio;

public class Livrotheque extends Bibliotheque {
	Livrotheque(int capacite) {
		super(capacite);
	}
	public boolean ajouter(Document doc) {
        if (doc instanceof Livre)
            return super.ajouter(doc);
        return false;
    }
	public Livre livre(int i) {
		 /*if(super.document(i) instanceof Livre) {
			 return super.document(i);
		 }
		 else
			 return null;*/
		return livre(i);
	}
	public void afficherAuteur() {
		
	}
}
