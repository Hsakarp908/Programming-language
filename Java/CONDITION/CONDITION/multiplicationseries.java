package CONDITION;
import java.util.*;
public class multiplicationseries {

	public static void main(String[] args) {
		System.out.println("Enter num");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int i=0;
		while(i<10){
			i++;
			int n=a*i;
			System.out.println(n);
		}
		sc.close();
	}
}

