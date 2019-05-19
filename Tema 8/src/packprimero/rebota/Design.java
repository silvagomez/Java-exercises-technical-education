package packprimero.rebota;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import packprimero.inicial.Bola6.Accion;

public class Design extends JFrame implements ActionListener{
	
	JButton ini;
	JButton stop;
	JPanel p1,p2;
	Timer tiempo;
	Bola ball;

	public Design() {
		// TODO Auto-generated constructor stub
		//setLayout(null);
		setLayout(new BorderLayout());
		p1=new JPanel();
		ini=new JButton("Start");
		ini.setBounds(30, 20, 100, 40);
		p1.setBounds(0, 0, 300, 100);
		p1.add(ini);
		
		stop=new JButton("Stop");
		stop.setBounds(160, 20, 100, 40);
		p1.add(stop);
		
		add(p1, BorderLayout.NORTH);
		
		p2=new JPanel();
		ball=new Bola();
		tiempo=new Timer(100,new Axx());
		tiempo.start();
		add(ball);
		p2.setBounds(0, 100, 300, 700);
		
		
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public class Axx implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ball.movimiento();
			ball.repaint();

		}

	}

}
