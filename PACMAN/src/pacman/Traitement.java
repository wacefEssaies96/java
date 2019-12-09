package pacman;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
	
public class Traitement extends JPanel {
	private int joueurX;
	private int joueurY;
	//public Joueur joueur = new Joueur();
	//public Border border = new Border();
	Traitement(){
		this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new Control());
	}
	public void paintComponent(Graphics g) {
		//BACKGROUND
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		g.setColor(Color.yellow);
		g.fillOval(joueurX, joueurY, 20, 20);
		
		//joueur.paintComponent(g);
		//border.paintComponent(g);
		
	}
	
	/*public void move(int d) {
		int x = getJoueurX();
		int y = getJoueurY();
		while(d!=0) {
			if(d == 1) {
				setJoueurY(x+=5);
				sleep(time);
				repaint();
			}
			if(d == 2) {
				setJoueurY(x-=5);
				sleep(time);
				repaint();
			}
			if(x>1000||x<20) {
				d=0;
			}
		}
	}*/
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
