package STRING;

import java.util.Scanner;

public class STRING4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuffer sb= new StringBuffer(input);
        sb.reverse();
        System.out.println("Reversed string: " + sb);
        scanner.close();
    }
}