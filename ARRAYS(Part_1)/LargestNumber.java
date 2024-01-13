// import java.util.*;

public class LargestNumber {

    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest =numbers[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int numbers[] ={1,3,4,6,10};
        System.out.println("Largest value is : " + largest(numbers));
        
    }
    
}
