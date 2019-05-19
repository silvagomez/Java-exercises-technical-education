package datosbanco;

public class Cliente {
	
	 private String name;
	 private float balance;
	 
	 
	 Cliente(String name){
		 this.name=name;
		 balance=0;
	 }
	 
	 void deposite(float depositeMoney) {
		 balance+=depositeMoney;
	 }
	 
	 void withdraw(float withdrawMoney) {
		 balance-=withdrawMoney;
	 }
	 
	 float balance() {
		 return balance;
	 }
	 
	 void viewBalance() {
		 System.out.println("Total money in the bank is: "+balance);
	 }
	 
	 void viewData() {
		 System.out.println(name+" your balance is: "+balance);
	 }

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
