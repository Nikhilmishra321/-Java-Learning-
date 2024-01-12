

public class functionOverloading {
    public static void main(String[] args) {
        // System.out.println(sum(10, 3));
        // System.out.println(sum(10.5f, 2.1f));

        isPrime(5);
        
    }
    //sum of two numbers
    public static int sum(int a,int b){
        return a+b;

    }
    //sum of three numbers
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    //func to calculate int sum

    public static float sum(float a,float b ){
        return a +b;
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n %  i==0){
                isPrime=false;

            }
        }
        return isPrime;
        
    }
    

    
}
