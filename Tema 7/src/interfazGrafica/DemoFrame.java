package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JRadioButton;
import java.awt.Color;

public class DemoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame frame = new DemoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("Aceptar");
		b1.setEnabled(false);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1){
					System.exit(0);
				}
			}
		});
		b1.setBounds(287, 181, 115, 29);
		contentPane.add(b1);
		
		JCheckBox chk1 = new JCheckBox("Acepto");
		chk1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(chk1.isSelected()==true) {
					b1.setEnabled(true);
				}else {
					b1.setEnabled(false);
				}
			}
		});
		chk1.setBounds(61, 87, 139, 29);
		contentPane.add(chk1);
		
		JLabel l1 = new JLabel("Desea continuar?");
		l1.setBounds(61, 27, 121, 20);
		contentPane.add(l1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBackground(Color.PINK);
		rdbtnNewRadioButton.setForeground(Color.RED);
		rdbtnNewRadioButton.setBounds(239, 87, 155, 29);
		contentPane.add(rdbtnNewRadioButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setForeground(Color.BLUE);
		chckbxNewCheckBox.setBackground(Color.PINK);
		chckbxNewCheckBox.setBounds(49, 159, 139, 29);
		contentPane.add(chckbxNewCheckBox);
	}
}
