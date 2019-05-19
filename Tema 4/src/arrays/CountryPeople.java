package arrays;

public class CountryPeople {
	
	String[] country= {"Colombia", "Venezuela", "Brasil", "Argentina", "España"};
	int[] people= {10, 1, 1000, 100, 5};
	
	CountryPeople(){
		
	}
	
	void view1() {
		for (int i = 0; i < country.length; i++) {
			System.out.println("The country "+country[i]+" has "+people[i]+ " person(s)");
		}
	}
	
	void c() {
		String aux;
		//for (int i = 0; i < country.length-1; i++) {
			for (int j = 0; j < country.length-1; j++) {
				if(country[j].compareTo(country[j+1])>1);
				aux=country[j];
                country[j]=country[j+1];
                country[j+1]=aux;
			}
			
		//}
		for (int i = 0; i < country.length; i++) {
			System.out.println(country[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountryPeople op = new CountryPeople();
		op.view1();
		op.c();
	}

}
