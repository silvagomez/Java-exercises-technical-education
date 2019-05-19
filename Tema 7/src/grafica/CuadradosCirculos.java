package grafica;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class CuadradosCirculos extends JFrame {
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(50, 150, 50, 50);
		g.drawOval(50, 50, 50, 50);
		g.fillRect(150, 150, 50, 50);
		g.drawRect(150, 50, 50, 50);
		}
	public static void main(String[] args) {
		CuadradosCirculos obj = new CuadradosCirculos();
		obj.setTitle("Cuadrados y Circulos");
		obj.setBounds(700,400,300, 300);
		obj.setVisible(true);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}