package grafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ComboBoxRGB extends JFrame implements ActionListener {
	
	private JLabel l1,l2,l3;
	private JComboBox cb1,cb2,cb3;
	private JButton b1,b2;
	private String[] num=new String[256];
	private Color colour;
	private int r,g,b;

	public ComboBoxRGB() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		
		
		//ESTO EN PROGRAMACIÓN SE VE MAL, NO SE USA
		/*
		for (int i = 0; i < num.length; i++) {
			int a=i;
			num[i]=Integer.toString(a);
		}*/
	}
	
	void m1() {
		
		
		
		l1=new JLabel("Rojo");
		l2=new JLabel("Verde");
		l3=new JLabel("Azul");
		l1.setBounds(70,20,100,40);
		l2.setBounds(70, 50, 100, 40);
		l3.setBounds(70,80,100,40);
		add(l1);
		add(l2);
		add(l3);
		
		cb1=new JComboBox();
		cb2=new JComboBox();
		cb3=new JComboBox();
		for (int i = 0; i < 256; i++) {
			cb1.addItem(i);
			cb2.addItem(i);
			cb3.addItem(i);
		}
		cb1.setBounds(140, 30, 50, 20);
		cb2.setBounds(140, 60, 50, 20);
		cb3.setBounds(140, 90, 50, 20);
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb3.addActionListener(this);
		add(cb1);
		add(cb2);
		add(cb3);
		
		b1=new JButton("Push Me");
		b1.setBounds(100, 130, 100, 100);
		b1.addActionListener(this);
		add(b1);
				
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b1) {
			
			r=(Integer)cb1.getSelectedItem();
			g=(Integer)cb2.getSelectedItem();
			b=(Integer)cb3.getSelectedItem();
			
			colour=new Color(r, g, b);
			
			b1.setBackground(colour);
			
			String hex="#"+Integer.toHexString(r)+Integer.toHexString(g)+Integer.toHexString(b);
			setTitle(hex);
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComboBoxRGB cor=new ComboBoxRGB();
		cor.m1();
		cor.setBounds(100, 100, 600, 300);
		cor.setResizable(false);
		cor.setVisible(true);
		cor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	

}
