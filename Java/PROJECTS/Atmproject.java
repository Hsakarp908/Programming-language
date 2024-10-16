package PROJECTS;

import java.util.*;
public class Atmproject {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=500;
		System.out.println("Enter pin");
		int pin=75004;
		int pinnum =sc.nextInt();
		
		if(pin!=pinnum) {
			System.out.println("Wrong pin");
		}
		else if(pin==pinnum){
			int click1=1;
			System.out.print("Click 1 to Check Balance=");
			int s=sc.nextInt();
			if(click1==s) {
				System.out.print("Balance Available=");
				System.out.println(a);
				}
			int click2=2;
			System.out.print("Click 2 to withdraw=");
			int w=sc.nextInt();
			if(click2==w){
				System.out.print("Enter amount=");
				int i=sc.nextInt();
				a=a-i;
					if(a<=0) {
						System.out.println("Entered amount can not be dispensed");
					}
					else {
						System.out.print("Balance Available=");
						System.out.println(a);
						}
			}
			if(a>0) {
				int click3=3;
				System.out.print("Click 3 to deposit cash=");
				int u=sc.nextInt();
				if(click3==u) {
					System.out.print("Enter amount=");
					int c=sc.nextInt();
					a=a+c;
					System.out.print("Balance Available=");
					System.out.print(a);
					}
			}
		}
		sc.close();
	}
}
