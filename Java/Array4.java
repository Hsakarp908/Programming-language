import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}
