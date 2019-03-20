package chapter01;

/*Section 1.5.3, “String Comparison” (page 25) has an example of two strings s and t so that s.equals(t)
  but s != t. Come up with a different example that doesn't use substring).*/

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String string1 = in.nextLine();
        System.out.println("Enter second string: ");
        String string2 = in.nextLine();

        if (string1.equals(string2))
            System.out.println("Strings are equal");
        else
            System.out.println("String are different");
    }
}
