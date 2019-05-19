package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTest extends JFrame implements ActionListener {
	
	private JPanel p1;
	private JLabel l1;
	private JTextField tf1;
	private JButton b1, b2, b3, b4;
	private JTextArea ta1;
	private JScrollPane s1;
	
	File fichero = new File("innovation.txt");
		Scanner s = null;
	private String linea, parrafo="";
	
	public TextAreaTest() {
		// TODO Auto-generated constructor stub
		
	}
	
	void m1() {
		
		setLayout(null);
		//p1.setBounds(100, 100, 400, 400);
		//add(p1);
		
		l1= new JLabel("Palabra");
		l1.setBounds(250, 20, 100, 40);
		add(l1);
		
		tf1= new JTextField();
		tf1.setBounds(300, 30, 100, 20);
		add(tf1);
		
		ta1= new JTextArea();
		//ta1.setBounds(20, 20, 200, 200);
		add(ta1);
		
		ta1.setLineWrap(true);
		
		s1= new JScrollPane(ta1);
		s1.setBounds(20, 20, 200, 200);
		add(s1);
		
		b1= new JButton("Probar");
		b1.setBounds(250, 100, 80, 40);
		b1.addActionListener(this);
		add(b1);
		
		b2= new JButton("Reemplazar");
		b2.setBounds(350, 100, 110, 40);
		b2.addActionListener(this);
		add(b2);
		
		b3= new JButton("Salir");
		b3.setBounds(250, 150, 80, 40);
		b3.addActionListener(this);
		add(b3);
		
		b4= new JButton("Limpiar");
		b4.setBounds(350, 150, 110, 40);
		b4.addActionListener(this);
		add(b4);
		
		
		
		//p1.setVisible(true);
		
		try {
			s= new Scanner(fichero);
			
			while(s.hasNextLine()) {
				linea = s.nextLine();
				parrafo=parrafo+linea;
			}
			//ta1.JTextArea(parrafo);
			ta1.setText(parrafo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(s!=null) {
					s.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public void replaceRange() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cad1=tf1.getText();
		String cad2=ta1.getText();
		
		if(e.getSource()==b1) {
			
			if(cad2.indexOf(cad1)!=-1) {
				setTitle("Encontrada \" "+cad1+" \"");
			}else {
				setTitle("No encontrada");
			}
		}
		
		if(e.getSource()==b2) {
			try {
				ta1.replaceRange("Probando el cambio de texto", 10, 50);
			} catch (IllegalArgumentException a) {
				// TODO: handle exception
				setTitle("Escribe une texto");
			}
		}
		
		if (e.getSource()==b3) {
			System.exit(0);
		}
		
		if(e.getSource()==b4){
			ta1.setText(null);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextAreaTest window = new TextAreaTest();
		window.m1();
		window.setBounds(50, 50, 500, 300);
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	

}
