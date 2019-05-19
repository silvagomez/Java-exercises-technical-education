
package packprimero;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


	public class Bola1 extends JFrame {
		
		private int x = 0;
		private int y = 0;
		
		void moverBola() {
			
			//x = x + 1;
			//y = y + 1;
			x=(int)(Math.random()*250);
			y=(int)(Math.random()*250);
		}
		
		void repetir() {
			for(;;) {
					moverBola();
					repaint();
					
					try {
						Thread.sleep(80);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.RED);			
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
			g2d.fillOval(x, y, 30, 30);
			
		}
		public static void main(String[] args) {
			
			Bola1 obj = new Bola1();	
			
			obj.setBounds(0,0,300, 300);
			obj.setVisible(true);
            obj.setResizable(true);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			obj.repetir();
		
	}

}

