package exercice1;

public class Cylindre extends Cercle {
	
	private float hauteur;
	
	public Cylindre(float x,float y,float rayon,float hauteur) {
		super(x,y,rayon);
		this.hauteur = hauteur;
	}
	
	public double calculSurface() {
		return (super.calculSurface()*hauteur);
	}
	
	public String toString() {
		return ("Je suis un cylindre de rayon "+super.rayon+" et de hauteur "+hauteur+ " Centre : "+super.x+super.y);
	}
	
}
