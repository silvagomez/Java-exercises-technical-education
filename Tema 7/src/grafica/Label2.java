package grafica;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Label2 extends JFrame{
	
	private JLabel labelA, labelB, labelC;
	
	Label2(){
		setLayout(null);
		JTextField campo=new JTextField();
		
		labelA=new JLabel("Interfaz Gráfica");
		labelB=new JLabel("Nombre");
		
		labelC=new JLabel("BBVA");
		
		labelA.setBounds(50, 10, 100, 40);
		labelB.setBounds(50, 40, 100, 40);
		labelC.setBounds(50, 80, 100, 40);
		
		add(labelA);
		add(labelB);
		add(labelC);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
