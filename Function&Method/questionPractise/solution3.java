import java.util.Scanner;



public class solution3 {
    public static int sumofProduct(int a , int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a=sc.nextInt();

        System.out.println("Enter the number b");
        int b=sc.nextInt();
       
       int  product= sumofProduct(a, b);
       System.out.println("Product of two number " + product);

       

    }
    
}
