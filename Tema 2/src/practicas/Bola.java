package practicas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bola extends JFrame{
	int x=30;
	int y=30;
	boolean bajar=true,subir=true;
	 
			
	void moverBola() {
		// BOLA_2 HORIZONTAL SIN PARAR
		/*x=x+5; 
		y=y+0;*/
			
		// BOLA_3 VERTICAL SIN PARAR
		/*x=x+0; 
		 y=y+5;*/
			
		// BOLA_4 HORIZOTAL CON PARADA FINAL
		/*if(x<250) { 
			x=x+5;
			y=y+0;
		}*/
			
		// BOLA_5 VERTICAL CON PARADA FINAL
		/*if(y<250) { 
			x=x+0;
			y=y+5;
		}*/
		
		// BOLA_6 DIAGONAL SIN PARAR
		/*x=x+5; 
		y=y+5;*/
		
		// BOLA_7 DIAGONAL CON PARADA FINAL
		/*if(x<250 && y<250){ 
			x=x+5;
			y=y+5;
		}*/
		
		// BOLA_8 DIAGONAL Y SE DEVUELVE
		/*if(x<250 && y<250 && bajar==true) { 
			
			x=x+5;
			y=y+5;

		}
		else {
			bajar=false;
			}
		
		if(bajar==false && x!=20) {
			x=x-5;
			y=y-5;
		}
		else{
		}*/	
		
		//BOLA_9 HORIZONTAL Y SE DECUELVE
		/*if(x<250 && bajar==true) { 
			x=x+5;
		}
		else {
			bajar=false;
		}
		if(bajar==false && x!=10) {
			x=x-5;
		}
		else {
			
		}*/
		
		//BOLA_10 PING PONG
		
		if(x<250 && y<250 && bajar==true) {
			x=x+5;
			y++;
			
		}
		else {
			bajar=false;
		}
		
		if(bajar==false && x!=10) {
			x=x-5;
			y++;
		}
		else {
			bajar=true;
		}
		
		if(bajar==true && x<250) {
			x=x+5;
			y++;
		}
		else {
			bajar=false;
		}
		if(bajar==false && subir==true) {
			x=x-1;
			y=y+5;
		}
		
				
		}
		
			public void paint (Graphics g) {
				super.paint(g);
					Graphics2D g2d = (Graphics2D) g;
					g2d.setColor(Color.RED);
					g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//SUAVIZA LOS BORDES DE LA BOLA
					g2d.fillOval (x, y, 30 ,30);
			}
			

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Bola obj = new Bola();
		obj.setBounds (0,0,300,300);
		obj.setVisible (true);
		obj.setResizable (false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(;;) {
			obj.moverBola();
			obj.repaint();
			Thread.sleep(20);
		}
		
		

	}
	
}


