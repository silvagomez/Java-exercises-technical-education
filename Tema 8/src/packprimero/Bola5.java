package packprimero;

	
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
	@SuppressWarnings("serial")
	public class Bola5 extends JPanel {
		
		private int x = 0;
		private int y = 0;
		private Color c=new Color(170,50,25);
		private String contra;
		

		 void moverBola() {
			
			//x = x + 1;
			//y = y + 1;
			x=(int)(Math.random()*200)+1;
			y=(int)(Math.random()*200)+1;
			
			/*try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		 void volverBola() {
			 x=x-1;
			 y=y-1;
		 }

		@Override
		public void paint(Graphics g) {
			super.paint(g); 
			Graphics2D g2d = (Graphics2D) g;
			//g2d.setColor(Color.ORANGE);
			g2d.setColor(getC());
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
			g2d.fillOval(x, y, 30, 30);
			
		}

		public Color getC() {
			return c;
		}

		public void setC(Color c) {
			
			if(getContra().equals("")) {
				System.out.println("No puedes cambiar el color de la bola");
			}
			else {
				this.c = c;
		}
		
		/*void password() {
			
			if(getContra().equals("")) {
				System.out.println("No puedes cambiar el color de la bola");
			}
			else {
				setC(c=new Color(25,50,170));
			}
		*/	
			
		}
		public String getContra() {
			return contra;
		}
		public void setContra(String contra) {
			this.contra = contra;
		}
	}
