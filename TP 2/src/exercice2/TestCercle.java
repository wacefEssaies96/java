package exercice2;

public class TestCercle {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		Cercle c = new Cercle(p,1);
		c.translate(5, 5);
		c.affiche();
	}

}
