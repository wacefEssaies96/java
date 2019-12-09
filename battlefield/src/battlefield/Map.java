package battlefield;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Map extends JPanel {
	private boolean newgame;
	private static int size,x,y;
	private static Image road;
	private static ImageIcon lien = new ImageIcon("image/road1.jpeg");
	private static int time = 15;
	private Army [] tableau;
	private Random rand = new Random();
	private int[] randtab;
	private Defence d = new Defence();

	public Map(){
		newgame = true;
		size = 6;
		x=0;
		y=438;
		tableau = new Army [size];
		randtab = new int [size*2];
	}
	
	/*Generate new coordination*/
	public void newGame() {
		if(newgame == true) {
			for(int i=0 ; i<randtab.length ; i+=2) {
				randtab[i] = randX();
				randtab[i+1] = randY();
			}
			newgame = false;
		}
	}
	/*Create new objects*/
	public void create(Graphics g) {
		newGame();
		for(int i = 0,j = 0 ; i < tableau.length ; i++ , j+=2) {
			tableau[i] = new Army(randtab[j],randtab[j+1]);
			tableau[i].paintComponent(g);
		}
		
	}
	public void paintComponent(Graphics g) {
		road = lien.getImage();
		g.drawImage(road,0,-150,null);
		Road road = new Road();
		road.paintComponent(g);
		create(g);	
		d.emplacement(g);
		d.fire(g);
		
	}
	
	public void move() {
		while(true) {
			for(int i=0 ; i<randtab.length ; i+=2) {
				randtab[i] += 2;
				sleep(time);
				repaint();
			}
		}
	}
	
	private static void sleep(int time){
		try{
			Thread.sleep(time);
		}
		catch(InterruptedException ex){
            ex.printStackTrace();
        }
	}
	
	
	public static int getRoadX() {
		return x;
	}
	public static int getRoadY() {
		return y;
	}
	
	/*Randomizer*/
	public int randX() {
		return rand.nextInt(40)+30;
	}
	public int randY() {
		return rand.nextInt(50)+430;
	}

}