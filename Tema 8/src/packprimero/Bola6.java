package packprimero;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bola6 extends JFrame implements ActionListener {

	Bola5 bola=new Bola5();	
	JPanel p1,p2;
	JLabel lb1;
	JTextField tf1;
	Scanner key=new Scanner(System.in);
	private long spd;
	
	Bola6(){
		/*
	p1=new JPanel();
	p1.setLayout(null);
	p1.setBounds(0, 0, 300, 300);
	add(p1);
	
	p2=new JPanel();
	p2.setLayout(null);
	p2.setBounds(0, 0, 300, 300);
	add(p2);
	
	lb1=new JLabel("Ingrese contraseña");
	lb1.setBounds(10,10,100,40);
	tf1=new JTextField();
	tf1.setBounds(40, 20, 100, 40);
	
	p1.add(lb1);
	p1.add(tf1);
	p1.setVisible(true);
	add(p1);
	*/
	
	
		
		System.out.println("Ingrese la contraseña");
		String passw=key.nextLine();
		bola.setContra(passw);
		bola.setC(new Color(25,50,170));
		//bola.password();
	add(bola);
	
	}
	
	void repetir() {
	for(;;) {
	//for(int x=0;x<230;x++) { //colocar un bucle infinito for(;;) es lo mismo while(true)
	for(;;) {
		bola.moverBola();
		bola.repaint();
		
		try {
			Thread.sleep(getSpd());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*for(int x=230;x>0;x--) {
		bola.volverBola();
		bola.repaint();
		try {
			Thread.sleep(getSpd());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	}	
	
	
		
		
	}
	/*
	public static void main(String[] args)  {	
			
				Bola6 obj = new Bola6();
				obj.setBounds(0,0,300, 300);
				obj.setVisible(true);
                obj.setResizable(false);
				obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				obj.repetir();
				
				}
	*/
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public long getSpd() {
		return spd;
	}

	public void setSpd(long spd) {
		this.spd = spd;
	}			
		}
