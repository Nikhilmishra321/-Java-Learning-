import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc =new Scanner(System.in);

         //Input of marks
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("physics " + marks[0]);
        System.out.println("chemestry " + marks[1]);
        System.out.println("Maths " + marks[2]);

        //update of marks
        marks[2] =80;
        System.out.println( "Maths marks " + marks[2]);
        
        //Percentage

        int Percentage =(marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage=" + Percentage + "%");

        sc.close();

    }
    
}
