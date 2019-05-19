package pruebaLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Prueba2 extends JFrame{
	
	private JPanel p1=new JPanel();
	private JPanel p2=new JPanel();

	public Prueba2() {
		// TODO Auto-generated constructor stub
	}
	
	void m1() {
		
		p1.setLayout(new GridLayout(4, 3)); //5? para el JTextField
		
		for (int i = 1; i <= 9; i++) {
			p1.add(new JButton(""+i));
		}
		p1.add(new JButton("" + 0));
		p1.add(new JButton("Start"));
		p1.add(new JButton("Stop"));
		//add(p1,BorderLayout.EAST);
		
		add(new JButton("Este botón está sobre la Ventana"),BorderLayout.WEST);
		
	}
	
	void m2() {
		p2.setLayout(new BorderLayout());
		p2.add(new JTextField("Esto es un JTextField"),BorderLayout.NORTH);
		p2.add(p1);
		
		add(p2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prueba2 frame=new Prueba2();
		frame.m1();
		frame.m2();
		frame.setSize(430, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
