package exercice1;

public class Rectangle {
	//Attributs
	private int longeur;
	private int largeur;
	//Constructeurs
	
	//Constructeur sans param�tres
	Rectangle(){
		System.out.println("Creation d'un objet avec le constructeur 1");
	}
	//Constructeur avec 1 param�tre
	Rectangle(int x){
		System.out.println("Creation d'un objet avec le constructeur 2");
		longeur = 2*x;
		largeur = x;
	}
	//Constructeur avec 2 param�tres
	Rectangle(int x,int y){
		System.out.println("Creation d'un objet avec le constructeur 3");
		longeur = x;
		largeur = y;
	}
	public int calcul_surface() {
		return longeur * largeur;
	}
}
