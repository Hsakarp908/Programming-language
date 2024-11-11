import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nEntered numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        scanner.close();
    }
}