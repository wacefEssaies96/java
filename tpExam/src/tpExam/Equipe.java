package tpExam;

public class Equipe {
	private int capacite;
	private String ne;
	private double budget;
	
	protected Joueur[] joueur;
	
	Equipe(int capacite,String ne,double budget){
		this.capacite = capacite;
		this.ne = ne;
		this.budget = budget;
		this.joueur = new Joueur[capacite];
	}
	public void getListeJoueur() {
		for (int i = 0 ; i<joueur.length ; i++) {
			System.out.println(joueur[i].toString());
		}
	}
	
	/*public boolean ajouterJoueur(Joueur j) {
		
	}*/
}
