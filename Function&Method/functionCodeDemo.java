import java.util.Scanner;

public class functionCodeDemo {
    public static void printHelloWorld(){
        System.out.println("Hello world");
    }

    public static void calculateSum(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println("Print total sum " + sum);
        sc.close();
    }   
    public static void main(String[] args) {
        calculateSum();
    

        
    }
    
}
