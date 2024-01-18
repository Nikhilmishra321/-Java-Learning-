package FunctionComplete;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // greeting();
        // greeting();

        int ans =sum2();
        System.out.println(ans);
        
    }

     //return the value

    static int  sum2(){
         Scanner sc =new Scanner(System.in);
        System.out.println("take a number 1");
        int a=sc.nextInt();
        System.out.println("Take number of 2");
        int b=sc.nextInt();
        int sum= a+b;
        sc.close();
        return sum;
    }
    static void greeting(){
        System.out.println("Good evening");
    }
    
}
