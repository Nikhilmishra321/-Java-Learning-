
public class ProductOfNumber {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int prod=multiply(a, b);
        System.out.println("multiply of two number" + prod);
        
    }

    public static int factorial(int n){
        int f =1;
        for(int i=1; i<=n; i++){
            f= f*i;
            return f;

        }

    }

    public static int multiply(int a, int b){
        // int product=a * b;
        // return product;
        System.out.println(factorial(4));
    }

    
}
