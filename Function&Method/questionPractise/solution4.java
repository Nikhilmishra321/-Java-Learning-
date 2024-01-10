import java.util.Scanner;

public class solution4 {
    public static int averageNumber(int a, int b,int c){
        int average=(a+b+c)/3;
        System.out.println("The number of average");
        return average;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number 1");
       int a= sc.nextInt();
        
       System.out.println("Enter the number 2");
       int b=sc.nextInt();

       System.out.println("Enter the number 3");
       int c= sc.nextInt();

       System.out.println(averageNumber(a,b,c));
       
    }
    
}
