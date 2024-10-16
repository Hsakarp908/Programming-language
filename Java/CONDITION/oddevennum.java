package CONDITION;
import java.util.Scanner;

public class oddevennum {

	public static void main(String[] args) {
		
		System.out.print("Enter num = ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		for(int i=0;i<=a;i++) {
			if(i%2!=0){
			b=b+i;	
			}
		}
		System.out.println("Odd num = "+b);
		sc.close();
	}

}
