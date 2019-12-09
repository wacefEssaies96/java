package exercices;
import java.util.Scanner;
public class Exercices {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Exercice 2 System.out.println(somme(10));
		
		//Exercice 3 
		/*System.out.println("Give a number : ");
		int x = sc.nextInt();
		System.out.println("Le carrée de "+x+" est "+carree(x));*/
		
		//Exercice 4
		/*System.out.println("Give a number : ");
		int f = sc.nextInt();
		System.out.println("Le factoriel de "+f+" est "+factoriel(f));*/
		
		//Ecercice 5
		System.out.println("Donner une chaine : ");
		String s = sc.nextLine();
		
		if(palindrome(s)) 
			System.out.println(s+" est un palindrome !");
		else 
			System.out.println(s+" n'est pas un palindrome !");
		
	}
	
	//Exercice 2
	static int somme(int n) {
		if( n == 0 ) {
			return 0;
		}
		return (n + somme(n-1));
	}
	
	
	//Exercice 3
	static int carree(int x) {
		return x*x;
	}
	
	//Exercice 4
	private static int factoriel(int f) {
		if(f==0) {
			return 1;
		}
		return f * factoriel(f-1);
	}
	
	//Exercice 5
	private static boolean palindrome(String s) {
		for(int i=0,j=s.length()-1 ; i<s.length() && j>=0  ; i++ , j--) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	
	
}
