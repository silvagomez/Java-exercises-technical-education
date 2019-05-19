package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldNumeros extends JFrame implements ActionListener{
	
	private JLabel l1, l2, l3;
	private JTextField t1, t2, t3;
	private JButton b1, b2,b3;

	public TextFieldNumeros() {
		// TODO Auto-generated constructor stub
		
		setLayout(null);
		
		l1=new JLabel("Primer número");
		l2=new JLabel("Segundo número");
		l3=new JLabel("Resultado");
		l1.setBounds(20, 20, 100, 40);
		l2.setBounds(20, 50, 100, 40);
		l3.setBounds(250, 20, 100, 40);;
		add(l1);
		add(l2);
		add(l3);
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t1.setBounds(120, 30, 50, 20);
		t2.setBounds(120,60,50,20);
		t3.setBounds(320, 30, 50, 20);
		add(t1);
		add(t2);
		add(t3);
		
		b1=new JButton("Sumar");
		b2=new JButton("Salir");
		b3=new JButton("Borrar");
		b1.setBounds(20, 100, 100, 20);
		b2.setBounds(250, 100, 100, 20);
		b3.setBounds(135, 100, 100, 20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cad1=t1.getText();
		String cad2=t2.getText();
		//String cad3=t3.getText();
		
		if(e.getSource()==b1) {
			try {
				int x1=Integer.parseInt(cad1);
				int x2=Integer.parseInt(cad2);
				String total =String.valueOf(x1+x2);
				t3.setText(total);
			}catch(NumberFormatException ex){
				setTitle("Teclea números");
			}
		}
		
		if(e.getSource()==b3) {
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
		}
		
		if (e.getSource()==b2) {
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextFieldNumeros window = new TextFieldNumeros();
		window.setBounds(100, 100, 500, 500);
		window.setVisible(true);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	

}
