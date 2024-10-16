package OBJECT;
import java.util.Scanner;

 class  Electrycity{
	 int cn;
	 float units;
	 String name;
	 Electrycity(String a,int n){
		 name = a;
		 cn = n;
		
	 }
	 void display() {
		 System.out.println("NAME : " + name);
		 System.out.println("CONTACT NUMBER : " + cn);
	 }
	 void unit(float u) {
		 units = u;
		 if(u < 80) {
			 u = (u * 80)/100;
			 System.out.println("UNITS : " + u);
		 }
		 else if(u>100 && u<200) {
			 u=(u * 100) / 100;
			 System.out.println("UNITS : " + u);
		 }
		 else {
			 u= (u * 125)/100;
			 System.out.println("UNITS : " + u);
		 }
	 }
	
 }
public class OBJECT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Contact Number");
		int cn =  sc.nextInt();
		System.out.println("Enter Units");
		float u=sc.nextFloat();
		Electrycity e1= new Electrycity(name,cn);
		e1.display();
		e1.unit(u);
		sc.close();
	}

}
