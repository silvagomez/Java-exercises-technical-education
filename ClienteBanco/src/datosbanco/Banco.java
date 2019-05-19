package datosbanco;


public class Banco {
	
	private Cliente c1;
	private Cliente c2;
	private Cliente c3;
	
	Banco(){
		c1 = new Cliente("Diego");
		c2 = new Cliente("Camilo");
		c3 = new Cliente("Alicia");
		
	}
	
	void operation() {
		c1.deposite(100f);
		c1.withdraw(50f);
		
		c2.deposite(200f);
		c2.withdraw(100f);
		
		c3.deposite(450f);
		c3.withdraw(500f);
	}
	
	
	void view() {
		c1.viewData();
		c2.viewData();
		c3.viewData();
		
		System.out.println("Total money in the bank \t " +c1.balance());
		System.out.println("Total money in the bank \t " +c2.balance());
		System.out.println("Total money in the bank \t " +c3.balance());
		
		c1.viewBalance();
		c2.viewBalance();
		c3.viewBalance();

		System.out.println("Total money in the bank \t " +(c3.balance()+c2.balance()+c1.balance()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco bk = new Banco();
		bk.operation();
		bk.view();

	}

}
