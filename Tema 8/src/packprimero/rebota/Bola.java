package packprimero.rebota;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Bola extends JPanel{
	
	int x=0;
	int y=0;

	public Bola() {
		// TODO Auto-generated constructor stub
	}
	
	void movimiento() {
		x+=1;
		y+=1;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawRect(16, 20, 260, 680);
		g2d.setColor(Color.ORANGE);			
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
		g2d.fillOval(x, y, 30, 30);
	}

}
