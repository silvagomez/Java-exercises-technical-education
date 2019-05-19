package grafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldNumerosColores extends JFrame implements ActionListener {
	
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JLabel l1,l2,l3;
	private JTextField t1,t2,t3;
	private JButton b1,b2,b3;
	private String cad1, cad2;
	
	

	public TextFieldNumerosColores() {
		// TODO Auto-generated constructor stub
	}
	
	void m1() {
		
		p1.setLayout(null);
		p1.setBounds(100, 100, 300, 300);
		add(p1);
		
		p2.setLayout(null);
		p2.setBounds(100, 100, 300, 300);
		add(p2);
		
		l1=new JLabel("Primer número");
		l1.setBounds(20, 20, 100, 40);
		p1.add(l1);
		
		l2=new JLabel("Segundo número");
		l2.setBounds(20,50,100,40);
		p1.add(l2);
		
		l3=new JLabel("Resultado");
		l3.setBounds(20,20,100,40);
		p2.add(l3);
		
		p1.setBackground(Color.CYAN);
		p2.setBackground(Color.MAGENTA);
		
		p1.setVisible(true);
		p2.setVisible(false);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextFieldNumerosColores window = new TextFieldNumerosColores();
		window.setBounds(100, 100, 600, 600);
		window.setVisible(true);
		window.setResizable(false);
		window.m1();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}



	

}
