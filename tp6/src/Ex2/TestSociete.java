package Ex2;

import java.sql.Date;

public class TestSociete {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date d1 = new Date(118,9,16);
		
		Societe s1 =new Societe("s1","SocInfo");
		
		EmployeAssure empas1 =new EmployeAssure("prenom1","nom1","adresse1",1,1,d1,1,1,d1);
		
		EmployeAssure empas2 =new EmployeAssure("prenom2","nom2","adresse2",2,2,d1,2,2,d1);
		
		EmployeNonAssure empnas3 =new EmployeNonAssure("prenom3","nom3","adresse3",3,3,d1,3);
		
		EmployeNonAssure empnas4 =new EmployeNonAssure("prenom4","nom4","adresse4",4,4,d1,4);
		

		s1.ajouterEmp(empas1);
		s1.ajouterEmp(empas2);
		s1.ajouterEmp(empnas3);
		s1.ajouterEmp(empnas4);
		
		s1.affiche();

	}

}
