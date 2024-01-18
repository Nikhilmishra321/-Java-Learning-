package FunctionComplete;

public class PrimeNo {
    public static void main(String[] args) {
         System.out.println(isPrime(5));
        
        
    }
    static boolean isPrime(int n){
        int isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
    
}
