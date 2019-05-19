package memoriaDinamica;
import java.util.*;
public class PilaEje1 {
	
	Scanner sc = new Scanner(System.in);
	
	class Node {
		int number;
		Node next;
	}
	
	Node root;
	
	public PilaEje1() {
		root=null;
	}
	
	void setNum() {
		
		char c;
		do {
			Node nod = new Node();
			
			System.out.print("Ingrese un n�mero: ");
			nod.number=sc.nextInt();
			nod.next=root;
			root=nod;
			System.out.print("Quiere ingresar m�s n�meros (s/n): ");
			c=sc.next().charAt(0);
		} while (c=='s');
	}
	
	void view() {
		Node wroot= root;
		System.out.println("Los n�meros almacenados son:");
		while(wroot!=null) {
			System.out.print(wroot.number+" ");
			wroot=wroot.next;
		}
		System.out.println();
	}

	
	void extract() {
		char delete='n';
		System.out.println("Se elimin� el �ltimo dato de la pila");
		root=root.next;
		do {
			System.out.print("Desea eliminar otro dato de la pila (s/n): ");
			delete=sc.next().charAt(0);
			if(delete=='s') {
				root=root.next;
			}
		} while (delete=='s');
		
		//System.out.println(root.number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaEje1 obj = new PilaEje1();
		obj.setNum();
		obj.view();
		obj.extract();
		obj.view();

	}

}
