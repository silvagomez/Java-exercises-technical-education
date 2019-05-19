package packprimero.inicial;

	
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
	@SuppressWarnings("serial")
	
	public class Bola5 extends JPanel {
		
		int x = 0;
		int y = 0;

		 void moverBola() {
			x = x + 1;
			y = y + 1;
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g); 
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.CYAN);			
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
			g2d.fillOval(x, y, 30, 30);
			
		}
	}
