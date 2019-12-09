package battlefield;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ObjetTest extends JPanel {
	private int x;
	private int y;
	public ObjetTest(){
		x=0;
		y=438;
	}
	public int getRoadX() {
		return x;
	}
	public int getRoadY() {
		return y;
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(0,438,Main.map.getWidth(),98);
	}

}
