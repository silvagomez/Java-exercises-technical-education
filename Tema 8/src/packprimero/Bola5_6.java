package packprimero;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

import javax.swing.JFrame;

public class Bola5_6 {
	
	
	public Bola5_6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		System.out.println("Ingrese la velocidad");
		long v=key.nextLong();
		
		Bola6 obj = new Bola6();
		obj.setSpd(v);
		
		obj.setBounds(0,0,300, 300);
		obj.setVisible(true);
        obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.repetir();
		
		}

	

}
