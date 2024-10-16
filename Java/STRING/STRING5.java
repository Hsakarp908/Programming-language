package STRING;

import java.util.Scanner;

public class STRING5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

      
        String capitalized = capitalizeFirstLetter(input);

      
        System.out.println("Capitalized string: " + capitalized);

       
        scanner.close();
    }
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
