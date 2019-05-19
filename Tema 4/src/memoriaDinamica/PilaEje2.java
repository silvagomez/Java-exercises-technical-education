package memoriaDinamica;
import java.util.*;

public class PilaEje2 {
	
	Scanner sc = new Scanner(System.in);
	int aux=0;
	class Node{
		int info;
		Node next;
	}
	
	Node root;
	
	public PilaEje2() {
		root = null;
		
	}
	
	void setInfo(){
		char c;
		do {
			Node nd= new Node();
			System.out.print("Ingrese un número: ");
			nd.info=sc.nextInt();
			nd.next=root;
			root=nd;
			System.out.print("Desea ingresar más números (s/n): ");
			c=sc.next().charAt(0);
			
		}
		while(c=='s');
	}
	
	void view() {
		Node wroot= root;
		
		System.out.println("Los números almacenados son:");
		while(wroot!=null) {
			System.out.print(wroot.info+" ");
			aux=wroot.info;
			wroot=wroot.next;
			
			
		}
		System.out.println();
		System.out.println("El primer número a ingresar a la pila fue: "+aux);
	}
	
	void extract() {
		char delete='n';
		Node root2=null, wroot2;
		do {		
			System.out.print("Desea eliminar el "+root.info+" de la pila (s/n): ");
			delete=sc.next().charAt(0);
			if(delete=='s') {
				
				Node nodito = new Node();
				nodito.info=root.info;
				nodito.next=root2;
				root2=nodito;
						
				root=root.next;
				
				System.out.println("Se elimino el dato: "+nodito.info);
			}
		} while (delete=='s');
		wroot2=root2;
		System.out.println("Los números almacenados en la nueva pila son:");
		while(wroot2!=null) {
			System.out.print(wroot2.info+" ");
			wroot2=wroot2.next;
		}
		System.out.println();
		
		//System.out.println(root.info);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaEje2 obj = new PilaEje2();
		obj.setInfo();
		obj.view();
		obj.extract();
		obj.view();

	}

}
