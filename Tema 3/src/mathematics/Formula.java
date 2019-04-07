package mathematics;

public class Formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=1f, b=3f, c=6, f, t;
		
		f=Math.sqrt(Math.pow(b, 2)-(4*a*c));
		System.out.println(f);
		if(f<=0) {
			System.out.println("Las raices son complejas "+f);
			t=(-b-f);
			System.out.println(t);
			t=t/(2*a);
			System.out.println("Total :" +t);
		}
		else {
			System.out.println("Las raices  no son complejas " +f);
			t=(-(b)+f)/(2*a);
			System.out.println("Total :" +t);
		}

	}

}
