package Ex2;

import java.sql.Date;

public class Employe {
	public String  nom;
	public String  prenom;
	public String  adresse;
	public int  cin;
	public int  matricule; 
	public Date  dateEmbauche;
	public int  salaire;
	public boolean assure=false;
	
	public Employe(String  nom,String  prenom,String  adresse,int  cin,int  matricule,Date  dateEmbauche,int  salaire){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.cin=cin;
		this.matricule=matricule; 
		this.dateEmbauche=dateEmbauche;
		this.salaire=salaire;
	}
	
	
	public void affiche(){
		System.out.println(" Le Nom est "+this.nom+" Le Prenom est "+this.prenom+" L adresse est "+this.adresse+" Le Num CIN est "+this.cin
		+" La Matricule est "+this.matricule+" La  DateEmbauche est "+this.dateEmbauche+" Le salaire est "+this.salaire
		);
	}
}
