package Condition;

import java.util.Scanner;

public class addTwo {
    public static void main(String[] args) {
        
        System.out.println("enter the two number");
        int a,b,c;

        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();

        c= a+b;

        System.out.println("Sum of two number" + c);
    }
    
}
