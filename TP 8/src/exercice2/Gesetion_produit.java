package exercice2;


public class Gesetion_produit {
	public static void main(String[] args) {
		Produit tab_produit[] = new Produit[5];
		tab_produit[0]=new Produitsolde("test",1,2,3);
		tab_produit[1]=new Produitsolde("test2",4,5, 0);
		tab_produit[2]=new Produitnonsolde("test2",5,6);
		tab_produit[3]=new Produitnonsolde("test2",5,6);
		tab_produit[4]=new Produitnonsolde("test2",5,6);
		int indice = 0;
		double max = tab_produit[0].calcul();
		for (int i=0;i<5;i++) {
			if(tab_produit[i].calcul()>max) {
				max = tab_produit[i].calcul();
				indice = i;
			}
		}
		tab_produit[indice].affiche();
	}
}
