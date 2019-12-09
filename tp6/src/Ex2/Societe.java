package Ex2;

public class Societe {

	public int i,j,taille=5,nbre=0;
	public String code;
	public String  nom;
	public Employe[] TabEmploye= new Employe[taille];
	
	public Societe( String code,String  nom){
		 this.code=code;
		 this.nom=nom;
	}
	public void affiche(){
		j=0;
		for(i=0;i<this.TabEmploye.length;i++){
			if(this.TabEmploye[i]!=null){
				j=i+1;
			}
		}
		System.out.println(" Le Nom de la Societe est "+this.nom+" Le Code  est "+this.code+"Elle contient "+j+ " employes");
		j=0;
		for(i=0;i<this.TabEmploye.length;i++){
			if(this.TabEmploye[i]!=null){
				j=i+1;
				System.out.println(" L employe num "+j+" est ");
				this.TabEmploye[i].affiche();
			}
		}
	}
	public void ajouterEmp(Employe e){
		this.TabEmploye[nbre]=e;
		this.nbre=this.nbre+1;
	}
	
}
