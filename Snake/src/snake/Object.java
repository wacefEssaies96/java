package snake;

	import javax.swing.*;
	import java.awt.*;
	import java.util.Random;

public class Object extends JPanel {
    private int score;
    private int time;
    private int snakex;
    private int snakey;
    private int snakex1;
    private int snakey1;
    private int direction;
    private int rx;
    private int ry;
    
    private int[][] tab ;
    int taille;
    private static Random rand = new Random();
    Object(){
        score = 0;
        time = 20;
        snakex=350;
        snakey=250;
        snakex1=snakex-20;
        snakey1=250;
        direction=1;
        setRx(randx());
        setRy(randy());
        tab = new int [20][20];
        taille = 20;
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new Controle());
    }
    public void paintComponent(Graphics g){

        g.setColor(Color.BLACK);
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        g.setColor(Color.WHITE);
        g.drawRect(10,100,this.getWidth()-20,this.getHeight()-120);

       /* g.setColor(Color.RED);
        g.fillRect(snakex,snakey,20,20);*/

        g.setColor(Color.RED);
        g.fillRect(snakex1,snakey1,20,20);


        Font fscore = new Font("Courier", Font.BOLD, 25);
        g.setFont(fscore);
        g.setColor(Color.white);
        g.drawString("Score : "+score, 50, 50);

       if(collision()) {
           score += 10;
           reAjoute();
       }
       if(getDirection()==0){
           Font fgame = new Font("Courier",Font.BOLD,40);
           g.setFont(fgame);
           g.setColor(Color.RED);
           g.drawString("Game Over ! replay ? (Enter/Escape)",this.getWidth()/2-400,this.getHeight()/2);
       }
       g.setColor(Color.CYAN);
       g.fillOval(rx,ry,20,20);
    }
    private boolean collision(){
        return getSnakeX1() > rx - 15 && getSnakeX1() < rx + 15 && getSnakeY1() > ry - 15 && getSnakeY1() < ry + 15;
    }
    private void reAjoute(){
        rx=randx();
        ry=randy();
    }

    void move(int d){
       while(getDirection()!=0) {
    	   int x = getSnakeX1();
    	   d= getDirection();
    	   if(d == 1) {
    		   x+=1;
    		   x*=20;
    		   setSnakeX1(x);
    		   repaint();
    		   sleep(time);
    	   }
    	   if((getSnakeX1() > (this.getWidth() - 40)) || (getSnakeX1() < 15) || (getSnakeY1() < 110) || (getSnakeY1() > (this.getHeight() - 45))){
               d=0;
               setDirection(0);
               repaint();
           }
       }
            
    }

    /*			sleep			*/

    private static void sleep(int time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    /*				getters and setters			*/

    //getterSnake

    public int getSnakeX(){
        return snakex;
    }
    public int getSnakeX1(){
        return snakex1;
    }
    public int getSnakeY(){
        return snakey;
    }
    public int getSnakeY1(){
        return snakey1;
    }

    //GETTER DIRECTION

    public int getDirection(){
        return direction;
    }

    //setterSNAKE

    public void setSnakeX(int snakex){
        this.snakex=snakex;
    }
    public void setSnakeX1(int snakex1){
        this.snakex1=snakex1;
    }
    public void setSnakeY(int snakey){
        this.snakey=snakey;
    }
    public void setSnakeY1(int snakey1){
        this.snakey1=snakey1;
    }

    public void setDirection(int direction){
        this.direction=direction;
    }
    public int randx(){
        return rx = rand.nextInt(650)+50;
    }
    public int randy(){
        return ry = rand.nextInt(450)+150;
    }
    public int getRx() {
        return rx;
    }
    public int getRy(){
        return rx;
    }
    public void setRx(int rx){
        this.rx = rx;
    }
    public void setRy(int ry){
        this.ry = ry;
    }
}

