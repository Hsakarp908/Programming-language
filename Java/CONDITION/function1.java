package CONDITION;

public class function1 {
 static int plusMethodInt(int x, int y) {
    int  a=x+y;
    System.out.println("int: " + a);
    return 0;
  }
  
 static double plusMethodDouble(double x, double y) {
	  double a=x+y;
	  System.out.println("double: " + a);
    return 0;
  }

  public static void main(String[] args) {
    plusMethodInt(8, 5);
     plusMethodDouble(4.3, 6.26);
    
    
  }
}