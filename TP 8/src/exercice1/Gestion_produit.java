package exercice1;

public class Gestion_produit {
	public static void main(String[] args) {
		Produit tab_produit[] = new Produit[5];
		tab_produit[0]=new Produitsolde(1,"test",2,3);
		tab_produit[1]=new Produitsolde(4,"test2",5,6);
		tab_produit[2]=new Produitnonsolde("test2",5,6);
		tab_produit[3]=new Produitnonsolde("test2",5,6);
		tab_produit[4]=new Produitnonsolde("test2",5,6);
		
		double max = tab_produit[0].Calcul();
		
		for (int i=0;i<5;i++) {
			if(tab_produit[i].Calcul()>max) {
				max = tab_produit[i].Calcul();
			}
		}
		
	}
	

}
