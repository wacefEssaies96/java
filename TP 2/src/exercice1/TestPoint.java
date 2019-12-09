package exercice1;

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(1,2.3f);
		Point p2 = new Point();
		p1.affiche();
		p2.affiche();
		System.out.println(p1.equals(p2));
		p1.deplace(-0.5f, 0.7f);
		p2.deplace(p1.getX(), p1.getY());
		p1.affiche();
		p2.affiche();
		System.out.println(p1.equals(p2));
	}
}
