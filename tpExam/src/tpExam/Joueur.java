package tpExam;

public class Joueur {
	private  String nom;
	private String prenom;
	protected String poste;
	private int dossar;
	Joueur(String nom,String prenom,String poste,int dossar){
		this.nom = nom;
		this.prenom = prenom;
		this.poste =  poste;
		this.dossar = dossar;
	}
	public String toString() {
		return "nom : "+nom+" prenom : "+prenom+" poste : "+poste+" dossar : "+dossar ;
	}
	public String getPoste() {
		return poste;
	}
}
