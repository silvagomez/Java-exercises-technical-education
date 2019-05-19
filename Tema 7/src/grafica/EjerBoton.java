package grafica;

import java.awt.event.*;

import javax.swing.*;

public class EjerBoton extends JFrame implements ActionListener{
	
	JButton boton1;
	
	public EjerBoton() {
		//Siempre colocar setLayout(null);
		setLayout(null);
		
		boton1=new JButton("Pulsar para terminar");
		boton1.setBounds(10,20,300,30);
		add(boton1);
		boton1.addActionListener(this);//se activa cuando hacemos click en el boton
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			System.exit(0);
		}
	}
	
	public static void main(String[] ar) {
		EjerBoton ventana=new EjerBoton();
		ventana.setBounds(100,100,400,300);
		ventana.setResizable(false);/* el operador no puede modificar el tamaño de la ventana*/
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}
