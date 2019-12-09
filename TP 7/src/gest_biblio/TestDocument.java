package gest_biblio;

public class TestDocument {
	
	public static void main(String [] args) {
		Document tabDoc[] = new Document[10];
		
		/*tabDoc[0] = new Document("Bienvenue chez les chtis",1001);
		tabDoc[1] = new Livre(1002,"Nicolas Sarkozy, le manuel vaudou","Y.Rolognes",500);
		tabDoc[2] = new Roman("J.Mesrine","L'instint de la mort",1003,150,999);
		tabDoc[3] = new Manuel(1004,"Vive le java","A.Metral-Boitel",200,2);
		tabDoc[4] = new Revue(4,2008,1005,"Science et Vie");
		tabDoc[5] = new Dictionnaire("Français",1006,"Larousse");*/
		
		//   Afficher tous les documents
		
		for (int i=0 ; i<tabDoc.length ; i++) {
			if(tabDoc[i] != null)
				System.out.println(tabDoc[i].toString());
		}
		
		/*Bibliotheque Bibliotheque = new Bibliotheque(50); // Déclaration d’une nouvelle bibliothèque de 50 éléments
		
		Document unDocument = new Roman("A. Metral", "Compte rendu du TP2", 20, 1003,1); 
		Bibliotheque.ajouter(new Document("Je n'ai plus d'idee",1001));   
		Bibliotheque.ajouter(new Livre(1002,"Nicolas Sarkozy, le manuel vaudou","Y.Rolognes",500));    
		Bibliotheque.ajouter(unDocument);         
		Bibliotheque.ajouter(new Manuel(1004,"Vive le java","A.Metral-Boitel",200,2));
		Bibliotheque.ajouter(new Revue(4,2008,1005,"Science et Vie"));
		Bibliotheque.ajouter(new Dictionnaire("Français",1006,"Larousse"));   
		System.out.println("--------------DOCUMENTS---------------------");
		Bibliotheque.afficherDocuments();
		System.out.println("-------------------------------------------"); 
		System.out.println("---------------AUTEURS----------------------");
		Bibliotheque.afficherAuteurs(); 
		System.out.println("----------------END-------------------------");
		System.out.println("-----DOCUMENTS SANS LE NUM 1003-------------"); 
		Bibliotheque.supprimer(unDocument); 
		Bibliotheque.afficherDocuments(); 
		System.out.println("----------------------END------------------"); */
		 
		Livrotheque l = new Livrotheque(5);
		
		l.ajouter(new Document("Je n'ai plus d'idee",1001));
		l.afficherDocuments();
		
	}
}
