package CONDITION;
import java.util.*;
public class dowhilloop1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
				
		do 
		{
		System.out.println(ch);
		++ch;
		}while(ch<='z');
		sc.close();
	}

}
