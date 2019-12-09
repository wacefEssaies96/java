package battlefield;

import javax.swing.JFrame;


public class Main {
	public static JFrame fenetre = new JFrame();
	public static Map map = new Map();

	
	public static void main(String[] args) {
		
		fenetre.setSize(1900,1000);
		fenetre.setTitle("Battlefield");
		//fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		fenetre.setResizable(false);
		fenetre.setContentPane(map);
		map.move();
	}
	
}
