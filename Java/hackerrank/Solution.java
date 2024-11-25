package hackerrank;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                if(x>=100 && x<=999){
                   
                  System.out.printf("%-15s %d \n",s1,x);   
                 }
                 else{
                   System.out.printf("%-15s 0%d \n",s1,x);
                 }
            }
            sc.close();
            System.out.println("================================");

    }
}


