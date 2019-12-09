package exercice2;

public class Mesure {
	private int valeur;
	final int min = -100;
	final int max = 100;
	static int nbMesure = 0;
	static int somMesure = 0;
	Mesure(int valeur){
		if (valeur <min || valeur>max) {
			System.out.println("Mesure hors intervalle");
		}else{
			this.valeur = valeur;
			nbMesure+=1;
			somMesure+=valeur;
		}
	}
	public void affiche() {
		System.out.println("La mesure : "+this.valeur);
	}
	public static void afficheMoy() {
		int moy = somMesure/nbMesure;
		System.out.println("Moyenne : "+moy);
	}
}
