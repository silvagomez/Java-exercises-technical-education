package aves;


public class Ave{
	protected char sexo;
	protected byte edad;
	static int num;
	
	public Ave(char sexo, byte edad) {
		this.sexo=sexo;
		this.edad=edad;
		num++;
	}
	
	public static void visualizar() {
		System.out.println("El número de aves creadas es: "+num++);
	}
	
	public void quienSoy() {
		System.out.println("Soy "+sexo+" y tengo "+edad+" años");
	}
}
