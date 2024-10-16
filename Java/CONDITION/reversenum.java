package CONDITION;
import java.util.Scanner;


public class reversenum {

	public static void main(String[] args) {
		System.out.print("Enter num");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		do {
			int rem=n%10;
			n=n/10;
			int rev=rem;
			System.out.print(rev);
		}
		while(n>=1);
		sc.close();
	}
}	