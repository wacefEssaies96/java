package exercice2;

public class Point {
	private float x,y;
	
	Point(){
		
	}
	Point(float x,float y){
		this.x = x;
		this.y = y;
	}
	
	public void affiche() {
		System.out.println("Abscisse : "+x+" Ordonnée : "+y);
	}
	
	public void deplace(float dx,float dy) {
		x = dx;
		y = dy;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	public String toString() {
		return "Abscisse : "+getX()+" Ordonnée : "+getY();
	}
	public boolean equals(Point p) {
		return p.x == x && p.y == y;
	}
}
