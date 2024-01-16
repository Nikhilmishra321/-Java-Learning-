//Q1.write a java program to get a number from the user and print whether it is postive and negative

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a nuber");
        int a=sc.nextInt();
        
        if(a>=0){
            System.out.println("Postive number");
        }else
        {
            System.out.println("negative number");
        }
        sc.close();
        
    }
    
}
