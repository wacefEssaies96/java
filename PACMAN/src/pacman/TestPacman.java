package pacman;

import javax.swing.JFrame;

public class TestPacman {
	public static JFrame fen = new JFrame();
	public static Traitement traitement = new Traitement();
	
	public static void main(String[] args) {
		
		fen.setVisible(true);
		fen.setTitle("PACMAN");
		fen.setSize(1024,768);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setLocationRelativeTo(null);
		fen.setResizable(false);
		fen.setContentPane(traitement);
	}

}
