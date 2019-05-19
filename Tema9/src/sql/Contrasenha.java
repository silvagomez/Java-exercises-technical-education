package sql;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Contrasenha  extends JFrame implements ActionListener, KeyListener{
	
	private JLabel l1, l2;
	private JTextField tf1;
	private JPasswordField pf1;
	private JButton b1;
	private String usuarios[][] = {{"Diego","123a"},{"Camilo","321a"},{"Alicia","456a"},{"Paula","654a"}};;
	String usuario,pass;

	public Contrasenha() {
		// TODO Auto-generated constructor stub
		setLayout(null);
	}
	
	void disenho() {
		l1=new JLabel("Usuario:");
		l1.setBounds(10, 20, 100, 40);
		add(l1);
		
		l2=new JLabel("Contraseña:");
		l2.setBounds(10, 60, 100, 40);
		add(l2);
		
		tf1=new JTextField();
		tf1.setBounds(110, 30, 100, 20);
		tf1.addActionListener(this);
		add(tf1);
		
		pf1=new JPasswordField();
		pf1.setBounds(110, 70, 100, 20);
		pf1.addActionListener(this);
		add(pf1);
		
		b1=new JButton("Confirmar");
		b1.setBounds(70, 110, 100, 30);
		b1.addActionListener(this);
		b1.addKeyListener(this);
		add(b1);
		
	}
	
	void comparar() {
		boolean forward1=false;

		for (int i = 0 ; i < usuarios.length && forward1==false; i++) {
			if(usuario.equals(usuarios[i][0])) {
					if(pass.equals(usuarios[i][1])) {
						setTitle("Correcto");
						forward1=true;
					}else{
						setTitle("Incorrecto");
					}
				}
				
			else {
				setTitle("Usu Incorrecto");
			}
			
		}
	}
	
	void accionBoton() {
		// TODO Auto-generated method stub
		
		usuario=tf1.getText();
		//String pass=pf1.getText(); //Esto es obsoleto WARNING
		pass=new String(pf1.getPassword());
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		
		if(e.getSource()==tf1) {
			tf1.transferFocus();
		}else if(e.getSource()==pf1) {
			pf1.transferFocus();
		}else if(e.getSource()==b1) {
			accionBoton();
			comparar();

		}
	
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		accionBoton();
		comparar();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contrasenha contra=new Contrasenha();
		contra.setTitle("Programa");
		contra.disenho();
		contra.setBounds(100, 100, 400, 200);
		contra.setVisible(true);
		contra.setResizable(false);
		contra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}



}
