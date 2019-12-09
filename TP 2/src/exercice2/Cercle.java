package exercice2;

public class Cercle {
	float x;
	float y;
	float r;
	
	Cercle(Point p, float r){
		x = p.getX();
		y = p.getY();
		this.r = r;
	}
	public void affiche() {
		System.out.println("X : "+x+" Y : "+y+" Rayon : "+r);
	}
	public void translate(float dx,float dy) {
		x = dx;
		y = dy;
	}
}
