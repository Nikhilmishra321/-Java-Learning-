package ArraysBasic;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        int a[] =new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter element of arrays");
        for(int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Arrays Element");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i] + "");
            
            
        }
        System.out.println("Arrays length" +a.length);

    }
    
}
