package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxPueblos extends JFrame implements ActionListener {
	
	private JLabel l1;
	private JButton b1;
	private JComboBox combo1;
	private String[] pueblos = {"","Chia","Cota","Sopo"};

	public ComboBoxPueblos() {
		// TODO Auto-generated constructor stub
		
	}
	
	void m1() {
		setLayout(null);
		l1= new JLabel("Combo Box");
		l1.setBounds(100, 20, 100, 40);
		add(l1);
		
		combo1= new JComboBox(pueblos); //añadiendo array de pueblos
		combo1.setBounds(90, 60, 100, 20);
		add(combo1);
		
		/*
		combo1.addItem("");
		combo1.addItem("Chia");
		combo1.addItem("Cota");
		combo1.addItem("Sopo");*/
		combo1.addItem("Guasca");
		
		combo1.addActionListener(this);		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==combo1) {
			String seleccionado=(String)combo1.getSelectedItem();
			setTitle(seleccionado);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComboBoxPueblos town = new ComboBoxPueblos();
		town.m1();
		town.setBounds(100, 100, 300, 200);
		town.setResizable(false);
		town.setVisible(true);
		town.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	

}
