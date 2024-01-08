package Patterns_Part1;

public class pattern1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=5; i++)         //outer for loops in finds a rows 
        {
            for(j=1; j<=i; j++)    //inner for loops in finds a columns 
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
        
}
