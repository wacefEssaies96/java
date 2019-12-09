package pacman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Control implements KeyListener {

	public void keyPressed(KeyEvent arg0) {
		int x = TestPacman.traitement.getJoueurX();
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			TestPacman.traitement.setJoueurX(x+=5);
			TestPacman.traitement.repaint();
			/*TestPacman.traitement.joueur.setJoueurX(x+=5);
			TestPacman.traitement.joueur.repaint();
			TestPacman.traitement.repaint();*/
		}
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
