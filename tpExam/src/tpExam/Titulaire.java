package tpExam;

public class Titulaire extends Joueur {
	private int annee_actuel = 2019;
	private int anneet;
	private double salaire;
	
	Titulaire(String nom,String prenom,String poste,int dossar,int anneet){
		super(nom,prenom,poste,dossar);
		this.anneet = anneet;
		salaire = 2000;
	}
	
	public String toString() {
		return super.toString()+"anneet : "+anneet;
	}
	public double calculRevenu() {
		double revenu = salaire;
		for (int i = anneet ; i<annee_actuel ;i++){
			return revenu*=1.1;
		}
		return revenu;
	}
}	
