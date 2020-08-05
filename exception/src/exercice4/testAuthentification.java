package exercice4;

public class testAuthentification {

	public static void main(String[] args) {
		
				Authentification auth;
				boolean error = true;
				while(error) {
					try {
						auth = new Authentification();
						error = false;
					}
					catch(WrongInputLength e1) {
						System.out.println(e1.toString());
					}
					catch(WrongLoginException e2) {
						System.out.println(e2.toString());
					}
					catch(WrongPwdException e3) {
						System.out.println(e3.toString());
					}
					
				}
		
	}

}
