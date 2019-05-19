package packprimero.inicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Bola6 extends JFrame{
	
	Timer tiempo;
	Bola5 bola=new Bola5();
	
	Bola6(){
	add(bola);
	tiempo=new Timer(100,new Accion());
	tiempo.start();
	}
	
	public class Accion implements ActionListener {

		public Accion() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			bola.moverBola();
			bola.repaint();

		}

	}
	
	public static void main(String[] args)  {	
			
				Bola6 obj = new Bola6();				
				obj.setBounds(0,0,300, 300);
				obj.setVisible(true);
                obj.setResizable(false);
				obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				}			
		}
