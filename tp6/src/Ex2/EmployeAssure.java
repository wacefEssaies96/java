package Ex2;

import java.sql.Date;

public class EmployeAssure extends Employe{

	public int cnss;
	public Date dateInscrption;
	public boolean assure=true;
	public EmployeAssure(String  nom,String  prenom,String  adresse,int  cin,int  matricule,Date  dateEmbauche,int  salaire,int cnss,Date dateInscrption)
	{
		super(nom, prenom, adresse, cin, matricule, dateEmbauche, salaire);
		this.cnss=cnss;
		this.dateInscrption=dateInscrption;
	}
	
	public void affiche(){
		System.out.println(" ");
		System.out.println(" Ce employe est  Assure : ");
		super.affiche();
		System.out.println(" Le Num Cnss est "+this.cnss+" La  Date Inscrption est "+this.dateInscrption);
	}
}
