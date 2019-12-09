package exercice1;

public class Fonction_Math {
	Fonction_Math(){
		
	}
	public static int  factoriel(int valeur) {
		int i,k=1;
		for(i=1;i<=valeur;i++) {
			k=i*k;
		}
		System.out.println("Factoriel de "+valeur+" est "+k);
		return k;
	}
	public static int Somme(int valeur) {
		int i,k=1;
		for(i=0;i<valeur;i++) {
			k+=i;
		}
		System.out.println("Somme de "+valeur+" est "+k);
		return k;
	}
	public static double racineCarree(double valeur) {
		//double k = Math.sqrt(valeur);
		//return k;
		double k;
		k=Math.sqrt(valeur);
		System.out.println("racine carrée de "+valeur+" est "+k);
		return k;
		
	}
}
