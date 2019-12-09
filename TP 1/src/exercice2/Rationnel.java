package exercice2;

public class Rationnel {
	private int numerateur;
	private int denominateur;
	
	Rationnel(int numerateur,int denominateur){
		this.denominateur = denominateur;
		this.numerateur = numerateur;
		
	}
	
	Rationnel(){
		numerateur = 1;
		denominateur = 2;
	}
	
	public int getNumerateur() {
		return numerateur;
	}
	public int getDenominateur() {
		return denominateur;
	}
	public void affiche() {
		System.out.println(getNumerateur()+" / "+getDenominateur());
	}
	public static void add(Rationnel r1, Rationnel r2) {
		int x1 = r1.getDenominateur();
		int y1 = r1.getNumerateur();
		int x2 = r2.getDenominateur();
		int y2 = r2.getNumerateur();
		int variable;
		if(x1!=x2){
			variable = x1;
			x1*=x2;
			y1*=x2;
			y2*=variable;
			x2*=variable;
			System.out.println(y1+" / "+x1);
			System.out.println(y2+" / "+x2);
		}
		System.out.println("("+y1+" / "+x1+") + ("+y2+" / "+x2+") = ("+(y2+y1)+" / "+x1+")");
	}
	public static void multi(Rationnel r1,Rationnel r2) {
		int x1 = r1.getDenominateur();
		int y1 = r1.getNumerateur();
		int x2 = r2.getDenominateur();
		int y2 = r2.getNumerateur();
		System.out.println((y1*=y2)+" / "+(x1*=x2));
	}
	public static void multi(Rationnel r1,int x) {
		int x1 = r1.getDenominateur();
		int y1 = r1.getNumerateur();
		System.out.println((y1*=x)+" / "+(x1*=x));
	}
	public void inverse() {
		int variable=this.denominateur;
		this.denominateur = this.numerateur;
		this.numerateur = variable;
	}
	
}
