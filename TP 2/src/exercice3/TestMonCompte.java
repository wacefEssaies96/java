package exercice3;

public class TestMonCompte {

	public static void main(String[] args) {
		MonCompte b = new MonCompte(500);
		MonCompte b1 = new MonCompte(400);
		b.affiche();
		b1.affiche();
		System.out.println(MonCompte.getNombreCompte());
	}

}
