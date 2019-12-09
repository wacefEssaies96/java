package exercice1;

public class Cercle extends Point {
	
	protected float rayon;
	
	public Cercle(float x,float y,float rayon){
		super(x,y);
		this.rayon = rayon;
	}
	
	public double calculSurface() {
		return ((rayon*rayon) * Math.PI);
	}
	public double calculPerimetre() {
		return (2*Math.PI*rayon);
	}
	public String toString() {
		return "Je suis un cercle de rayon de "+rayon+" et de centre ("+x+","+y+").";
	}
}
