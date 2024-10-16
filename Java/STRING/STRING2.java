package STRING;

import java.util.Scanner;
public class STRING2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STRING 1 : ");
		String s1=sc.nextLine();
		System.out.println("ENTER STRING 2 : ");
		String s2 =sc.nextLine();
		int s3 = s1.compareTo(s2);
		System.out.println("AFTER COMPARE : " + s3);
		sc.close();

	}

}
