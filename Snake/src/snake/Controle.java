package snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controle implements KeyListener {
	public void keyPressed(KeyEvent k) {
        if(k.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(Main.test.getDirection()!=2)
                Main.test.setDirection(1);
         
        }
        if(k.getKeyCode() == KeyEvent.VK_LEFT){
            if(Main.test.getDirection()!=1)
                Main.test.setDirection(2);
        }
        if(k.getKeyCode() == KeyEvent.VK_UP){
            if(Main.test.getDirection()!=3)
                Main.test.setDirection(4);
        }
        if(k.getKeyCode() == KeyEvent.VK_DOWN){
            if(Main.test.getDirection()!=4)
                Main.test.setDirection(3);
        }
        if(k.getKeyCode() == KeyEvent.VK_ESCAPE){
            System.out.println("ESCAPE IS PRESSED");
        }
        if(k.getKeyCode() == KeyEvent.VK_ENTER){
            Main.test.setDirection(1);
            System.out.println("ENTER IS PRESSED");
        }
    }
    public void keyReleased(KeyEvent a) {
    }
    public void keyTyped(KeyEvent b) {
    }
	

}
