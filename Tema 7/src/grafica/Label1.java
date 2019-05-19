package grafica;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.Iterator;

public class Label1 extends JFrame{
	
	//private JLabel labelA, labelB, labelC;
	
	Label1(){
		setLayout(null);
		/*
		labelA=new JLabel("ING");
		labelB=new JLabel("Kuxa");
		labelC=new JLabel("BBVA");
		
		labelA.setBounds(50, 10, 100, 40);
		labelB.setBounds(50, 40, 100, 40);
		labelC.setBounds(50, 80, 100, 40);
		
		add(labelA);
		add(labelB);
		add(labelC);
		*/
		//SOLUCION MIX ARRAY Y ARRAYLIST
		/*
		String[] empresas = {"ING","Kuxa","BBVA"};
		
		ArrayList<JLabel>labels = new ArrayList();
		
		byte fila=10;
		
		for (int i = 0; i < empresas.length; i++) {
			labels.add(new JLabel(empresas[i]));
			labels.get(i).setBounds(50, fila, 100, 40);
			add(labels.get(i));
			fila+=20;
		}
		*/
		
		// ARRAYLIST E ITERATOR
		
		ArrayList<JLabel>labels = new ArrayList();
		ArrayList<String>empresas = new ArrayList();
		
		empresas.add("ING");
		empresas.add("Kuxa");
		empresas.add("BBVA");
		
		
		/*No funciona terminar
		Iterator it = empresas.iterator();
		while(it.hasNext()) {
			JLabel aux = new JLabel(it.hasNext());
			labels.add(aux);
			labels.add(new Jlabel(empresas.get(index)))
		}
		*/

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Label1 lb = new Label1();
		lb.setTitle("Empresas");
		lb.setBounds(800,100,400,170); 
		lb.setVisible(true); 
		lb.setResizable(false);
		lb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
