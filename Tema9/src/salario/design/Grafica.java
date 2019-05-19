package salario.design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import salario.sql.OracleBD;

public class Grafica extends JFrame implements ActionListener{
	
	private JLabel l1, l2;
	private static JPanel p1;
	private JPanel p2;
	public JLabel l3;
	private JTextField tf1, tf2;
	private JButton b1,b2;

	public Grafica() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		
		p1=new JPanel();
		p1.setBounds(0, 0, 300, 300);
		p1.setVisible(false);
		add(p1);
		
		l1=new JLabel("Introduce dni");
		l1.setBounds(20, 20, 100, 40);
		add(l1);
		
		tf1=new JTextField();
		tf1.setBounds(140, 30, 100, 20);
		add(tf1);
		
		l2=new JLabel("Introduce salario");
		l2.setBounds(20, 60, 100, 40);
		add(l2);
		
		tf2=new JTextField();
		tf2.setBounds(140, 70, 100, 20);
		add(tf2);
		
		b1=new JButton("Enviar");
		b1.setBounds(30, 120, 80, 30);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Salir");
		b2.setBounds(150, 120, 80, 30);
		b2.addActionListener(this);
		add(b2);
		
		l3=new JLabel("Modificado correctamente");
		l3.setBounds(100, 150, 100, 40);
		l3.setVisible(true);
		p1.add(l3);
	}
	
	public static void mensaje() {
		p1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		OracleBD bd=new OracleBD();
		
		if(e.getSource()==b1) {
			String dni=tf1.getText();
			String salario=tf2.getText();
			String sentencia="update empleados set salario="+salario+" where dni='"+dni+"'";
			System.out.println(sentencia);
			bd.actualizar(sentencia);
			
			
		}else {
			
		}
		
		if(e.getSource()==b2) {
			try {
				bd.cerrarConexion();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(0);
		}
		
	}

}
