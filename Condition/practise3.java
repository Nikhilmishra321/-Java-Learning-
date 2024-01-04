package Condition;

import java.util.Scanner;

public class practise3 {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        //Input week number from user

        System.out.println("Enter week number (1-7)");
        int week=obj.nextInt();

        switch(week) {

            case 1:
            System.out.println("mondays");
            break;

            case 2:
            System.out.println("Tuesdays");
            break;

            case 3:
            System.out.println("wednesday");
            break;

            case 4:
            System.out.println("thrusdays");
            break;

            case 5:
            System.out.println("fridays");
            break;

            case 6:
            System.out.println("satardays");
            break;



        }


        


    }
    
}
