//write a java program input week number(1-7) and print days of week name using switch case

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day)
        {
            case 1:
               System.out.println("Mondays");
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
               System.out.println("fridays : saturdays");          


        }


        
        

    }
}
