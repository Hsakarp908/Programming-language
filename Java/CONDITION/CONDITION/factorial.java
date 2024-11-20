package CONDITION;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		System.out.print("Enter num");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int a=1;
		while(i<=n){
			a=a*i;
			i++;
			System.out.println("print factorial");
			System.out.println(a);
		}
		sc.close();
	}

}
