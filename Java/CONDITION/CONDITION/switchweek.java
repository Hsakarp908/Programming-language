package CONDITION;

import java.util.Scanner;

public class switchweek {

	public static void main(String[] args) {
		System.out.print("Please enter  case num");
		Scanner scr = new Scanner(System.in);
		int week=scr.nextInt();
		
		switch(week){
			case 1:System.out.print("monday ");
			break;
			case 2:System.out.print("tuesday");
			break;
			case 3:System.out.print("wednesday ");
			break;
			case 4:System.out.print("thusday");
			break;
			case 5:System.out.print("friday ");
			break;
			case 6:System.out.print("saturday");
			break;
			case 7:System.out.print("sunday ");
			break;
			default:System.out.print("other day");
		}
		scr.close();
	}
		
}
