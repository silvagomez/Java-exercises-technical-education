package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CheckBoxAcepto extends JFrame implements ChangeListener, ActionListener {
	
	private JLabel l1;
	private JCheckBox chk1;
	private JButton b1;

	public CheckBoxAcepto() {
		// TODO Auto-generated constructor stub
		setLayout(null);
	}
	
	void m1() {
		l1=new JLabel("Está de acuerdo con las normas?");
		l1.setBounds(40, 10, 200, 40);
		add(l1);
		
		chk1=new JCheckBox("Acepto");
		chk1.setBounds(40, 40, 100, 40);
		chk1.addChangeListener(this);
		add(chk1);
		
		b1=new JButton("Continuar");
		b1.setBounds(40, 80, 100, 30);
		b1.addActionListener(this);
		b1.setEnabled(false);
		add(b1);
		
		
	}
	
	@Override
	public void stateChanged(ChangeEvent a) {
		// TODO Auto-generated method stub
		if (chk1.isSelected()==true) {
			b1.setEnabled(true);
		}else {
			b1.setEnabled(false);
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxAcepto box=new CheckBoxAcepto();
		box.m1();
		box.setBounds(100, 100, 300, 300);
		box.setVisible(true);
		box.setResizable(false);
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	

	

	

}
