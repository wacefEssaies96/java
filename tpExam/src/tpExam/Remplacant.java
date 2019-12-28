package tpExam;

public class Remplacant extends Joueur {
	private int adc;
	private int afc;
	private double salaire;
	
	Remplacant(String nom,String prenom,String poste,int dossar,int adc,int afc){
		super(nom,prenom,poste,dossar);
		this.adc = adc;
		this.afc = afc;
		salaire = 2000;
	}
	
	public String toString() {
		return super.toString()+"addc : "+adc+" afc : "+afc;
	}
	public double calculRevenus() {
		double revenu = salaire;
		if(super.getPoste() == "attaquant") {
			revenu *= 1.3;
			return revenu;
		}
		if(super.getPoste() == "defenseur") {
			revenu *=  1.2;
			return revenu;
		}
		return revenu;
	}

}
