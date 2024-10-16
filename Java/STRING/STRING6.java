package STRING;

import java.util.Scanner;

public class STRING6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String rev = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + rev);
        scanner.close();
        if(input.equals(rev)) {
        	System.out.println("PRINT PALINDROME");
        }
        else {
        	System.out.println("PRINT NOT A PALINDROME");
        }
    }
}