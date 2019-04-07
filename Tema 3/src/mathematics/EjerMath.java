package mathematics;

public class EjerMath {
	
	double a, b, c, r, t1, t2;
	
	EjerMath(){
		
	}
	
	double raiz(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		r=Math.sqrt(Math.pow(b, 2)-(4*a*c));
		return r;
	}
	
	void total() {
		if(r<0) {
			System.out.println("La raíz es compleja "+r);
			
		}
		else {
			System.out.println("La raíz NO es compleja "+r);
			t1=(-b-r)/(2*a);
			t2=(-b+r)/(2*a);
		}
		
	}
	
	void view() {
		System.out.println("Los resultado son: "+t1+"\t\t"+t2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EjerMath obj1 = new EjerMath();
		EjerMath obj2 = new EjerMath();
		obj1.raiz(1d, -5d, 6d);
		obj1.total();
		obj1.view();
		obj2.raiz(1, 3, 6);
		obj2.total();
		obj2.view();
		
		

	}

}
