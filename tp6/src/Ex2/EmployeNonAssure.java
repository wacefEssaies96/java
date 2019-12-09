package Ex2;

import java.sql.Date;

public class EmployeNonAssure extends Employe{


	public EmployeNonAssure(String  nom,String  prenom,String  adresse,int  cin,int  matricule,Date  dateEmbauche,int  salaire){
		super(nom, prenom, adresse, cin, matricule, dateEmbauche, salaire);
	}
	
	public void affiche(){
		System.out.println(" ");
		System.out.println(" Ce employe n' est pas  Assure : ");
		super.affiche();
	}
}
