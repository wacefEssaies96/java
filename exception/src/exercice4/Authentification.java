package exercice4;

import java.util.Scanner;

public class Authentification {
	
	final String LoginCorrect = "scott";
	final String PwdCorrect = "tiger";
	
	public Authentification() throws WrongPwdException, WrongInputLength, WrongLoginException{
		getUserLogin();
		getUserPassword();
	}
	
	public void getUserLogin() throws WrongInputLength, WrongLoginException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le nom d'utilisateur");
		String user = sc.nextLine();
		if(user.length() > 8 ) {
			throw new WrongInputLength();
		}
		if(!user.equals(LoginCorrect)) {
			throw new WrongLoginException();
		}

	}
	public void getUserPassword() throws WrongPwdException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le mot de passe");
		String pwd = sc.nextLine();
		if(!pwd.equals(PwdCorrect)) {
			throw new WrongPwdException ();
		}
	
	}
}
