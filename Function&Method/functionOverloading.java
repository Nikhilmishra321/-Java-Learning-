public class functionOverloading {
    public static void main(String[] args) {
        System.out.println(sum(10, 3));
        System.out.println(sum(10, 2, 1));
        
    }
    //sum of two numbers
    public static int sum(int a,int b){
        return a+b;

    }
    //sum of three numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    
}
