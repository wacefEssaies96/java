package exercice2;

public class TestRationnel {

	public static void main(String[] args) {
		Rationnel r1 = new Rationnel();
		Rationnel r2 = new Rationnel(10,2);
		
		r1.affiche();
		//r2.affiche();
		
		//Rationnel.add(r1,r2);
		//Rationnel.multi(r1, r2);
		//Rationnel.multi(r1, 2);
		r1.inverse();
		r1.affiche();

	}

}
