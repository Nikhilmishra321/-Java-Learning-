package javaBasic;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pencils cost");
        float Pencil=sc.nextInt();

        System.out.println("Enter the pen cosr");
        float Pen=sc.nextInt();
        
        System.out.println("Enter the Eraser cost");
        float Eraser=sc.nextInt();

        float total= Pencil + Pen +Eraser;
        System.out.println("Total cost of item bills: " + total);

        //Add on with tax
        float newTotal= total +(0.18f * total);
        System.out.println(newTotal);

        sc.close();
    }
    
}
