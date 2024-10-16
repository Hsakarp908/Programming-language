package CONDITION;
import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        double a = sc.nextInt();

        System.out.print("Enter 2nd num: ");
        double b = sc.nextInt();

        System.out.print("Enter 3rd num: ");
        double c = sc.nextInt();

        double result = Math.pow(a, Math.pow(b, c));
        System.out.println("Result: " + result);

        sc.close();
    }
}