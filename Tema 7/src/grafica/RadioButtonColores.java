package grafica;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RadioButtonColores extends JFrame implements ChangeListener{
	
	private JRadioButton rb1, rb2, rb3;
	private ButtonGroup bg;

	public RadioButtonColores() {
		// TODO Auto-generated constructor stub
		setLayout(null);
	}
	void m1() {
		
		bg=new ButtonGroup();
		
		rb1=new JRadioButton("Red");
		rb2=new JRadioButton("Green");
		rb3=new JRadioButton("Blue");
		
		rb1.setBounds(40, 20, 100, 40);
		rb2.setBounds(40, 60, 100, 40);
		rb3.setBounds(40, 100, 100, 40);
		
		rb1.addChangeListener(this);
		rb2.addChangeListener(this);
		rb3.addChangeListener(this);
		
		add(rb1);
		add(rb2);
		add(rb3);
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		Color color = null;
		// TODO Auto-generated method stub
		if(rb1.isSelected()) color=Color.red;
		if(rb2.isSelected()) color=Color.green;
		if(rb3.isSelected()) color=Color.blue;
		getContentPane().setBackground(color);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtonColores box=new RadioButtonColores();
		box.m1();
		box.setBounds(100, 100, 200, 200);
		box.setVisible(true);
		box.setResizable(false);
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	

}
