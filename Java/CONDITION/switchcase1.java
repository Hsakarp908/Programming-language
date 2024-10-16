package CONDITION;

import java.util.Scanner;
public class switchcase1 {

	public static void main(String[] args) {
		System.out.print("Please enter  case num");
		Scanner scr = new Scanner(System.in);
		int calculation=scr.nextInt();
		System.out.print("Enter 1st num");
		int a=scr.nextInt();
		System.out.print("Enter 2nd num");
		int b=scr.nextInt();
		
		switch(calculation){
			case 1:System.out.print("Addition= ");
				System.out.print(a+b);
			break;
			case 2:System.out.print("Substraction= ");
				System.out.print(a-b);
			break;
			case 3:System.out.print("Multiplication= ");
				System.out.print(a*b);
			break;
			case 4:System.out.print("Divison= ");
				System.out.print(a/b);
			break;
			case 5:System.out.print("Reminder= ");
				System.out.print(a%b);
			break;
			default:System.out.print("other calculation");
	}
		scr.close();

 }

}
