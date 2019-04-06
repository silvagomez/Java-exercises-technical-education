package ejercicios;

public class Ejercicio1_20 {
	
	// EJERCICIO 20
	/*------------------------------------------------
	 * Utilizando variables locales, 
	 * realizar un programa que intercambie los valores entre 2 variables.
	 * Mostrar los valores iniciales y los valores una vez intercambiados.
	 *------------------------------------------------*/

	Ejercicio1_20() {

	}

	void intercambio() {
		int n1 = 4, n2 = 6, n3;
		boolean cambio = false;
		view(n1, n2, cambio);
		n3 = n2;
		n2 = n1;
		n1 = n3;
		cambio = true;
		view(n1, n2, cambio);

	}

	void view(int n1, int n2, boolean cambio) {
		if (cambio == false) {
			System.out.println("Valores iniciales n1= " + n1 + " n2= " + n2);
		} else {
			System.out.println("Valores finales n1= " + n1 + " n2= " + n2);
		}

	}

	public static void main(String[] args) {

		Ejercicio1_20 obj = new Ejercicio1_20();
		obj.intercambio();

	}

}
