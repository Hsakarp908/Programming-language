import java.util.Scanner;

public class Array2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / 10;

        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        scanner.close();
    }
}
