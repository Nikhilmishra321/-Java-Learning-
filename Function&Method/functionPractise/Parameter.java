package functionPractise;

import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int a= sc.nextInt();
       int b=sc.nextInt();
       calcuateSum(a ,b);
        
    }
    static void calcuateSum(int a , int b){
        int sum = a+ b;
        System.out.println("sum of total " + sum);



    }
    
}
