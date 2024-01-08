package javaBasic;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three number");
        int A,B,C;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();

        int sum=(A+B+C)/3;
        System.out.println("average is : " +  sum);
        

    }
    
}
