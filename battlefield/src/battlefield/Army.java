package battlefield;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Army extends JPanel {
	private static Image soldier;
	private static ImageIcon lien = new ImageIcon("image/soldier.png");
	private int x;
	private int y;
	
	Army(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void paintComponent(Graphics g) {
		soldier = lien.getImage();
		g.drawImage(soldier,x,y,null);	
	}
	
}
