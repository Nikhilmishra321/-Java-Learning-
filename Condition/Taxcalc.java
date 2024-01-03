package Condition;

import java.util.Scanner;

public class Taxcalc {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int income=obj.nextInt();
        int tax;

        if(income < 50000){
            tax=0;

        }else if(income >= 50000  && income < 10000){
            tax = (int) (income * 0.2);

        }
        else{
            tax = (int) (income * 0.3);

        }
        System.out.println(tax);

    }
    
}
