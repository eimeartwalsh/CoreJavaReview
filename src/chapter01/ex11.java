package chapter01;
/* Write a program that reads a line of text and prints all characters that are not ASCII,
   together with their Unicode values.
 */

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String myString = in.nextLine();
        int[] codePoints = myString.codePoints().toArray();
        for (int codepoint : codePoints) {
            if (codepoint > 127) {
                System.out.printf("%c : %X\n", codepoint, codepoint);
            }

        }
    }
}

