package FunctionComplete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //take input of two number and print sum
        Scanner sc =new Scanner(System.in);
        System.out.println("take a number 1");
        int a=sc.nextInt();
        System.out.println("Take number of 2");
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println("sum of two number : " + sum);
        sc.close();
    }

    
}
    

