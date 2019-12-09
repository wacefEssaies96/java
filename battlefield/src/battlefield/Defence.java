package battlefield;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Defence extends JPanel {
	private int fireX;
	private int fireY;
	private int emplacementx;
	private int emplacementy;
	
	public Defence(){
		emplacementx = 500; 
		emplacementy = 600;
		fireX = emplacementx;
		fireY = emplacementy;
	}
	
	public void emplacement(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(emplacementx, emplacementy, 25, 25);
		
	}
	public void fire(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(fireX, fireY, 2, 2);
	}
	public void setFireX(int x) {
		fireX = x;
	}
	public void setFireY(int y) {
		fireY = y;
	}
	public int getFireX() {
		return fireX;
	}
	public int getFireY() {
		return fireY;
	}
	
}
