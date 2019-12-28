package tpExam;

public class TestEquipe {
	
	public static void main(String[] args) {
		
		Equipe eq = new Equipe(5,"eq1",100000);
		
		eq.joueur[0] = new Titulaire("wacef","essaies","attaquant",1,2017);
		eq.joueur[1] = new Titulaire("iheb","ben helel","attaquant",2,2016);
		eq.joueur[2] = new Titulaire("dali","ghozzi","defenseur",23,2015);
		
		eq.joueur[3] = new Remplacant("dali","ghozzi","defenseur",123,2015,2013);
		eq.joueur[4] = new Remplacant("aymen","jlassi","defenseur",13,2015,2016);
		
		
	}
}
