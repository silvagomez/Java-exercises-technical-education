package salario.principal;

import javax.swing.JFrame;

import salario.design.Grafica;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grafica obj=new Grafica();
		obj.setBounds(100, 100, 300, 300);
		obj.setVisible(true);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
