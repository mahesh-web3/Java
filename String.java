// Java code to illustrate String
import java.io.*;
import java.lang.*;

class Test {
    public static void main(String[] args)
    {
        // Declare String without using new operator
        String name = "Language";

        // Prints the String.
        System.out.println("String name = " + name);

        // Declare String using new operator
        String newString = new String("Language");

        // Prints the String.
        System.out.println("String newString = " + newString);
    }
}
