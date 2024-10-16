package OBJECT;
import java.util.Scanner;
import java.lang.String;
class Bankinfo{
	String name;
	private int pin;
	private long accountnum;
	long Balance;
	String type;

	void setPin(int pin) {
		this.pin = pin;
	}
	
	
	void setaccountnum(long accountnum1) {
		this.accountnum = accountnum1;
	}
	
	
	void function(int pin1) {
		if(pin!=pin1) {
			System.out.println("Wrong pin");
		}else{

		}
	}
	
	


	

}

public class Bankfunction{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 Bankinfo f1 = new Bankinfo();
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter  type : ");
		String type  = sc.nextLine();

		System.out.println("Enter Pin Number : ");
		final int pin = sc.nextInt();

		System.out.println("Enter Balance : ");
		long accountnum1 = sc.nextLong();
		
		System.out.println("Enter Balance : ");
		int  Balance = sc.nextInt();
		
		f1.setPin(pin);
		f1.setaccountnum(accountnum1);
		f1.function(pin);
	

	}

}
