//Q2:you have fever if your tempreature is above 100 other wise  print you do not have fever

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write down your tempreature:");
        double a= sc.nextDouble();

        //Possible 1
        String s = a>100 ? "you have fever " : "you dont have fever";
        System.out.println(s);

        //Possible 2

        if(a>100){
            System.out.println("you have fever");
        }else
        {
            System.out.println("you are not sick");
        }
        sc.close();
        
    }
    
}
