package snake;

import javax.swing.JFrame;

public class Main {
	static Object test = new Object();
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setTitle("snake_wacef");
        window.setSize(1024,800);
        window.setResizable(false);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(test);
        test.move(1);
    }
}
