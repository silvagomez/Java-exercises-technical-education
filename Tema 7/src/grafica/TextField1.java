package grafica;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextField1 extends JFrame implements ActionListener {
	
	private JLabel l1, l2;
	private JTextField t1, t2;
	private JButton boton1, boton2;
	private String [] nombres= {"diego","camilo","sergio","cristian"};
	private String [] contrasenha= {"romaol1","romaol2","romaol3","romaol4"};
	
	TextField1() {
		
		setLayout(null);
		
		Font font1 = new Font("Arial", Font.PLAIN,24);
		
		l1=new JLabel("Usuario");
		l2=new JLabel("Contraseña");
		l1.setBounds(20, 10, 130, 40);
		l2.setBounds(20, 45, 130, 40);
		l1.setFont(font1);
		l2.setFont(font1);
		add(l1);
		add(l2);
		
		t1=new JTextField();
		t2= new JTextField();
		t1.setBounds(160,20,100,25);
		t2.setBounds(160,50,100,25);
		t1.setFont(font1);
		t2.setFont(font1);
		add(t1);
		add(t2);
		
		boton1=new JButton("Confirmar");
		boton1.setBounds(70,85,140,30);
		boton1.setFont(font1);
		add(boton1);
		boton1.addActionListener(this);
		boton2=new JButton("Salir");
		boton2.setBounds(70,130,140,30);
		boton2.setFont(font1);
		add(boton2);
		boton2.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==boton1) {
			String cad1=t1.getText();
			String cad2=t2.getText();
			boolean mmm=true;
			for (int i = 0; i < contrasenha.length&&mmm==true; i++) {
				if(cad1.equals(nombres[i])&&cad2.equals(contrasenha[i])) {
					setTitle("Correcto");
					mmm=false;
				}
				else {
					setTitle("Incorrecto");
				}
			}
		}
		
		if (e.getSource()==boton2) {
			System.exit(0);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextField1 ventana=new TextField1();
		ventana.setBounds(100,100,300,210);
		ventana.setVisible(true);
		ventana.setResizable(false);
	
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}

}
