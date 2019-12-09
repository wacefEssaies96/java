package pacman;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Joueur extends JPanel {
	private int joueurX;
	private int joueurY;
	private int direction;
	private int time;
	public Joueur(){
		time=200;
		direction = 1;
		
	}
	public void paintComponent(Graphics g) {
		joueurX = TestPacman.traitement.getWidth()/2-10;
		joueurY = TestPacman.traitement.getHeight()/2-10;
		g.setColor(Color.YELLOW);
		g.fillOval(joueurX, joueurY, 20, 20);
	}
	
	private static void sleep(int time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
	public int getJoueurX() {
		return joueurX;
	}
	public int getJoueurY() {
		return joueurY;
	}
	public void setJoueurX(int joueurX) {
		this.joueurX=joueurX;
	}
	public void setJoueurY(int joueurY) {
		this.joueurY=joueurY;
	}
}
