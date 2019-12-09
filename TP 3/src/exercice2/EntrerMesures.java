package exercice2;

public class EntrerMesures {

	public static void main(String[] args) {
		Mesure m1 = new Mesure(100);
		Mesure m2 = new Mesure(50);
		Mesure m3 = new Mesure(-100);
		Mesure m4 = new Mesure(200);
		Mesure m5 = new Mesure(40);
		m1.affiche();
		m2.affiche();
		m3.affiche();
		m4.affiche();
		m5.affiche();
		Mesure.afficheMoy();
	}

}
