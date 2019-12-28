package tp8_ex2;

public class Gestion_produit {
	public static void main(String[] args) {
		
		Produit tab_produit[] = new Produit[5];
		tab_produit[0] = new Produitnonsolde("designation1",1,1);
		tab_produit[1] = new Produitnonsolde("designation2",1,2);
		tab_produit[2] = new Produitnonsolde("designation3",1,1);
		tab_produit[3] = new Produitsolde("designation4",1,3,10);
		tab_produit[4] = new Produitsolde("designation5",1,5,0);
		int max=0;
		for(int i=0;i<tab_produit.length;i++) {
			if(max < tab_produit[i].calcul()){
				max = tab_produit[i].calcul();
			}
		}
		System.out.println(max);
	}
}
