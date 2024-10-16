package CONDITION;
import java.util.Scanner;
public class fibonacciseries {
	
	public static void main(String[] args) {
		
		int num1=0,num2=1,num3=1;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(num1);
		for(int i=0;i<=n;i++)
		{
			System.out.println(num3);
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}	
		sc.close();
	}

}
