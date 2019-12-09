package Ex1;

public class GestionVehicules {

	private static int ANNEE_ACTUELLE = 2017;
	public static void main(String[] args) {
		Voiture[] garage = new Voiture[3]; 
		Avion[] hangar= new Avion[2];
		/*(String marque,int dateachat,double prixachat,float cylindrée,int nbrportes,float puissance,float kilométrage)*/
		garage[0] = new Voiture("Peugeot", 2005, 147325.7, 2.5f, 5, 180,12000);
		garage[1] = new Voiture("Porsche", 1999, 250000.00, 6.5f, 2, 280,81320);
		garage[2] = new Voiture("Fiat", 2001, 7327.30, 1.6f, 3, 65, 3000);
		
		hangar[0] = new Avion("Cessna", 1982, 1230673.90, "HELICES",250);
		hangar[1] = new Avion("Nain Connu", 1993, 4321098.00,"REACTION", 1300);
		
		for (int i = 0; i < garage.length; i++)
		{
			garage[i].calculePrix(ANNEE_ACTUELLE);
			garage[i].affiche();
			System.out.println("");
		}
		for (int i = 0; i < hangar.length; i++) 
		{
			hangar[i].calculePrix(ANNEE_ACTUELLE);
			hangar[i].affiche();
			System.out.println("");
		}

	}

}
