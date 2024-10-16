package STRING;

import java.util.Scanner;

public class STRING3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("State Bank Of India");
	String s1="State Bank Of India";
	System.out.println("ENTER STRING 2 : ");
	String s2 =sc.nextLine();
        if (s1.equals(s2)) {
           
            System.out.println("SBI");
        } else {
            System.out.println("The input is not 'State Bank of India'.");
        }
        sc.close();
    }


}


