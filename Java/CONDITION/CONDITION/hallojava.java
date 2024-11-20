package CONDITION;
import java.util.*;
public class hallojava {

	
	public static void main(String[] args) { // main method
		System.out.print("hello gays \n Please enter name");
		Scanner sc = new Scanner(System.in);
		 int name=sc.nextInt();
		 
		 if(name == 1) {
			 System.out.print("Hello");
		 }
		 else if(name == 2) {
			 System.out.print("Namaste");
		 }
		 else if(name == 3){
			 System.out.print("Bonjour");
		 }
		 sc.close();
	}

}
