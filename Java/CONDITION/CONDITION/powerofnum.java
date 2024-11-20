package CONDITION;
import java.util.Scanner;
import java.lang.Math;
public class powerofnum {

	public static void main(String[] args) {
		System.out.print("Enter  1st num");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		System.out.print("Enter  2nd num");
		double b=sc.nextInt();
	     System.out.println(Math.pow(a,b));
			sc.close();
	}
		
}

