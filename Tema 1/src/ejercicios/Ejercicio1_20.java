package ejercicios;

public class Ejercicio20 {

	Ejercicio20() {

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
		// TODO Auto-generated method stub

		Ejercicio20 obj = new Ejercicio20();
		obj.intercambio();

	}

}
