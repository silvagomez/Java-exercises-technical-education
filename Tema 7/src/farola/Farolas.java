package farola;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;

public class Farolas extends JFrame implements ActionListener{
	
	private JLabel mapa;
	private JButton start;
	private ImageIcon img;
	private Icon icono;
	private Color colour1=new Color(223,223,223);
	private Color colour2=new Color(255,218,68);

	public Farolas() {
		// TODO Auto-generated constructor stub
		setLayout(null);
	}
	
	private void mapaParque() {
		
		JLabel nom=new JLabel("MAPA");
		nom.setBounds(10, 10, 100, 100);
		add(nom);
		/*
		mapa = new JLabel();
		mapa.setBounds(10, 10, 757, 442);
		img=new ImageIcon("Parque_93.jpg");
		icono=new ImageIcon(img.getImage().getScaledInstance(mapa.getWidth(), mapa.getHeight(), Image.SCALE_DEFAULT));
		mapa.setBorder(BorderFactory.createLineBorder(Color.black));
		mapa.setIcon(icono);
		add(mapa);
		*/
		mapa = new JLabel();
		mapa.setBounds(10, 10, 960, 540);
		img=new ImageIcon("Parque93.jpg");
		icono=new ImageIcon(img.getImage().getScaledInstance(mapa.getWidth(), mapa.getHeight(), Image.SCALE_DEFAULT));
		mapa.setBorder(BorderFactory.createLineBorder(Color.black));
		mapa.setIcon(icono);
		add(mapa);
		
		
	}
	private void postesLuz() {
		start=new JButton();
		start.setBounds(430, 90, 15, 15);
		//start.setIcon(new ImageIcon("luz1.PNG"));
		start.setBackground(colour2);;
		start.setBorder(new RoundedBorder(15));
		
		add(start);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farolas ciudad=new Farolas();
		ciudad.mapaParque();
		ciudad.postesLuz();
		
		ciudad.setSize(1600, 800);
		ciudad.setVisible(true);
		ciudad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}



}
