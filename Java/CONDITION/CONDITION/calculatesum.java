package CONDITION;

import java.util.*;
public class calculatesum {
	public static int calculateSum(int a, int b) {
		int product=a*b;
		System.out.print("product is :" + product);
		return product;
	}
	public static void main(String args [])
	{
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		calculateSum(a,b);
		sc.close();
	}
}
