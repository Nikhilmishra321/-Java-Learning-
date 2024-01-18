package FunctionComplete;

public class StringExample {
    public static void main(String[] args) {
        // String message =greet();
        // System.out.println(message);

        int ans =sum3(10, 5);
        System.out.println(ans);
        
    }
    // passing the value of number when you are calling the method is main()

    static int sum3(int x, int y){
        int sum =x+y;
        return sum;


    }

    static String greet(){
        String greeting="hey men how are you ";
        return greeting;
    }
    
}
