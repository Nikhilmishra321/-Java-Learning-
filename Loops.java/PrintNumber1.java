import java.util.Scanner;

public class PrintNumber1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of range");
            int range = sc.nextInt();
            int counter = 1;

            while (counter <=range) {
                System.out.println(counter + "");
                counter++;

            }
        }
        System.out.println();

    }
    
}
