package pacman;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
public class Border extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(20,20,TestPacman.traitement.getWidth()-40,TestPacman.traitement.getHeight()-40);
		
		g.setColor(Color.gray);
		g.fillRect(40,40,TestPacman.traitement.getWidth()-80,20);
		g.fillRect(40,40,20,TestPacman.traitement.getHeight()-80);
		
		g.fillRect(TestPacman.traitement.getWidth()-60,40,20,TestPacman.traitement.getHeight()-80);	
		g.fillRect(40,TestPacman.traitement.getHeight()-60,TestPacman.traitement.getWidth()-80,20);	
		//g.drawRect();
		
	}
}
