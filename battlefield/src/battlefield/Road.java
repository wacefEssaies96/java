package battlefield;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Road extends JPanel {
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(Map.getRoadX(),Map.getRoadY(),Main.map.getWidth(),98);
	}

}
