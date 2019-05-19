package machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Maquina extends JFrame implements ActionListener, ChangeListener{
	
	private JLabel l1,l2,l3;
	private ArrayList <JLabel>labels;
	private ArrayList <JRadioButton>radios;
	private JRadioButton rb1, rb2, rb3;
	private ButtonGroup bg;
	private JTextField t1,t2;
	private JComboBox cb1, cb2;
	private JButton b1, b2;
	
	private String[] titulo={"BEBIDAS","PRECIO","PAGO"};
	private String[] bebidas={"Agua","Chocolate","Café"};
	private String[] precios= {"0.70","1.30","2.55"};
	
	private int x1=50;
	private int y2=60;
	private float num=0.00f;
	
	private DecimalFormat df;
	private DecimalFormatSymbols simbolos;

	public Maquina() {
		// TODO Auto-generated constructor stub
		setLayout(null);
	}
	
	void m1() {
		
		//SOLUCION MIX ARRAY Y ARRAYLIST PARA LOS TITULOS
		
		labels=new ArrayList();	
		for (int i = 0; i < titulo.length; i++) {
			labels.add(new JLabel(titulo[i]));
			labels.get(i).setBounds(x1, 10, 100, 40);
			add(labels.get(i));
			x1+=150;
		}
		
		//PARTE BEBIDAS - RADIO BUTTONS VERSION CON ARRAY
		bg=new ButtonGroup();
		radios=new ArrayList();
		for (int i = 0; i < precios.length; i++) {
			radios.add(new JRadioButton(bebidas[i]));
			radios.get(i).setBounds(40, y2, 100, 40);
			radios.get(i).addChangeListener(this);
			add(radios.get(i));
			bg.add(radios.get(i));
			y2+=40;
		}
		
		//PARTE BEBIDAS - RADIO BUTTONS VERSION SIN ARRAY
		/*
		bg=new ButtonGroup();
		rb1=new JRadioButton("Agua");
		rb2=new JRadioButton("Chocolate");
		rb3=new JRadioButton("Café");
		rb1.setBounds(40, 60, 100, 40);
		rb2.setBounds(40, 100, 100, 40);
		rb3.setBounds(40, 140, 100, 40);
		rb1.addChangeListener(this);
		rb2.addChangeListener(this);
		rb3.addChangeListener(this);
		add(rb1);
		add(rb2);
		add(rb3);
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		*/
		
		//PARTE PRECIO - TEXTFIELD PRECIO
		
		t1=new JTextField();
		t1.setBounds(190, 60, 60, 110);
		add(t1);
		
		//PARTE PAGO - COMBOBOX
		
		l1=new JLabel("Euros");
		l2=new JLabel("Centimos");
		l3=new JLabel("VUELTAS");
		l1.setBounds(320, 60, 100, 40);
		l2.setBounds(320, 100, 100, 40);
		l3.setBounds(320, 140, 100, 40);
		add(l1);
		add(l2);
		add(l3);
		
		//EUROS
		cb1=new JComboBox();
		for (int i = 0; i < 6; i++) {
			cb1.addItem(i);
		}
		cb1.setBounds(420, 70, 60, 20);
		cb1.addActionListener(this);
		add(cb1);
		
		//CENTIMOS PARTE DE DECIMALES
		cb2=new JComboBox();
		
		simbolos = new DecimalFormatSymbols();
		simbolos.setDecimalSeparator('.');
		df=new DecimalFormat("0.00",simbolos);
		for ( ;num < 1; num+=0.05f) {
			cb2.addItem(df.format(num));
		}
		cb2.setBounds(420, 110, 60, 20);
		cb2.addActionListener(this);
		add(cb2);
		
		t2=new JTextField();
		t2.setBounds(420, 150, 60, 20);
		add(t2);
		
		// BUTTONS
		
		b1=new JButton("Extraer");
		b2=new JButton("Salir");
		b1.setBounds(320, 220, 160, 40);
		b2.setBounds(320, 280, 160, 40);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);

	}
	
	@Override
	public void stateChanged(ChangeEvent a) {
		// TODO Auto-generated method stub
		
		if(radios.get(0).isSelected()) {
			t1.setText(precios[0]);
			t2.setText(null);
		}
		if(radios.get(1).isSelected()) {
			t1.setText(precios[1]);
			t2.setText(null);
		}
		if(radios.get(2).isSelected()) {
			t1.setText(precios[2]);
			t2.setText(null);
		}
		
		//VERSION SIN ARRAY
		/*
		if(rb1.isSelected()) {
			t1.setText(precios[0]);
			t2.setText(null);
		}else if(rb2.isSelected()) {
			t1.setText(precios[1]);
			t2.setText(null);
		}else if(rb3.isSelected()) {
			t1.setText(precios[2]);
			t2.setText(null);
		}else {
			
		}*/
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
			if(e.getSource()==b1) {
				try {
					int euro=(Integer)cb1.getSelectedItem();
					int centimo=(Integer)cb2.getSelectedItem();
					String costo=t1.getText();
					
					float ingresoeuro=(float) euro;
					float ingresocentimo=(float) centimo;
					float cobro=Float.parseFloat(costo);
					
					float total=(ingresoeuro+centimo);
					float vuelta=total-cobro;
				}catch(NumberFormatException ex){
					setTitle("error");
				}
				/*	
				if(total<cobro) {
					t2.setText("Error");
					setTitle("Dinero insuficiente");
				}else {
				t2.setText(String.valueOf(vuelta));
				setTitle("Extrayendo");
				}
			*/	
			}
			/*
		} catch (ClassCastException e2) {
			// TODO: handle exception
		}
		*/
		
		
		
		
		if(e.getSource()==b2) {
			System.exit(0);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maquina mazinger=new Maquina();
		mazinger.m1();
		mazinger.setBounds(100, 100, 600, 400);
		mazinger.setVisible(true);
		mazinger.setResizable(false);
		mazinger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	

}
