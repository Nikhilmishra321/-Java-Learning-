package String;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // char arr[]={'a' ,'b','c','d','e'};
        // String str="abcd";
        // String str2=new String("xyz");

        //string are immutable
        // Scanner sc= new Scanner(System.in);
        //  String name =sc.next();
        //  System.out.println(name);

        String fullname="TonyStark";
        System.out.println(fullname.length());

        //concatination
        String firstName="Nikhil";
        String lastName="Mishra";
        String fullName= firstName + " " + lastName;
        System.out.println(fullName);

    }
    
}
