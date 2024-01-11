import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Sum();
        
        
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
