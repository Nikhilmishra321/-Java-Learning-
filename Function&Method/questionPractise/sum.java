import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
          // Sum();
          int ans= sum3(20, 10);
          System.out.println(ans);
        
        
    }
    public static int sum3(int num1, int num2){
        int sum=num1 + num2;
        return sum;


    }
    public static void Sum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a=sc.nextInt();
        System.out.println("Enter the numbr b");
        int b=sc.nextInt();
        int Sum=a+b;
        System.out.println("total " + Sum);
    }
    
}
