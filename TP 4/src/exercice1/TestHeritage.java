package exercice1;

public class TestHeritage {
	public static void main(String[] args) {
		Cercle c = new Cercle(1,2,3);
		System.out.println(c.calculPerimetre());
		System.out.println(c.calculSurface());
		System.out.println(c.toString());
		Cylindre cc = new Cylindre(4,5,6,7);
		System.out.println(cc.calculPerimetre());
		System.out.println(cc.calculSurface());
		System.out.println(cc.toString());
	}
}
