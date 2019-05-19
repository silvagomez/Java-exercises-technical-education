package empleados;

public class Empleado {
	
	/*Clase Empleado:
		Atributos de instancia: nombre y apellidos, tel�fono, edad, casado tipo de variable booleana y salario.
		Atributo de clase: total de personas.
		El constructor inicializa, con los par�metros que recibe.
		M�todo clasificaci�n(), dependiendo si es <21 a�os debe retornar: �Principiante�, el rango de 22 -35 debe retornar �Intermedio� y >35 a�os �Senior�.
		M�todo visualizarDatosEmpleado(), visualizar� todos los datos y al visualizar el estado civil aparecer�: �casado� � �estado sin especificar�.
		M�todo aumentarSalario() recibe el porcentaje deincremento del salario.*/
	
	private String nombre;
	private String apellido;
	private int telefono;
	private byte edad;
	private boolean casado;
	private float salario;
	
	static int totalPersonas;

	public Empleado(String n, String a, int t, byte e, boolean c, float s) {
		// TODO Auto-generated constructor stub
		totalPersonas++;
		
		nombre=n;
		apellido=a;
		telefono=t;
		edad=e;
		casado=c;
		salario=s;
	}
	
	protected String clasificacion() {
		String cargo = null;
		
		if(edad<21) {
			cargo="Principiante";
		}
		else {
			if(edad>=22 && edad<=35) {
				cargo="Intermedio";
			}
			else {
				cargo="Senior";
			}
		}
		return cargo;
		
	}
	
	public void visualizarDatosEmpleado() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Telefono: "+telefono);
		System.out.println("Edad: "+edad);
		if(casado==true) {
			System.out.println("Estado civil casado");
		}
		else {
			System.out.println("Estado civil sin especificar");
		}
		System.out.println("Salario: "+salario);
		System.out.println("Cargo"+clasificacion());
	}
	
	public void aumentarSalario(float incremento) {
		System.out.print(salario*=incremento);
	}

}
