package bola;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bola_7 extends JFrame{
	
	int x=30;
	int y=30;
	boolean bajar=true,subir=true;	 
			
	void moverBola() {
		// BOLA_7 DIAGONAL CON PARADA FINAL
		if(x<250 && y<250){ 
		x=x+5;
		y=y+5;
		}
					
	}
		
	public void paint (Graphics g) {
		super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.RED);
			//SUAVIZA LOS BORDES DE LA BOLA
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.fillOval (x, y, 30 ,30);
	}
			
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Bola_7 obj = new Bola_7();
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


