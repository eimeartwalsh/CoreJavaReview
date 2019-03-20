package chapter01;

/*Write a program that reads an integer and prints it in binary, octal, and hexadecimal. Print the reciprocal as a
  hexadecimal floating-point number.
 */

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer you wish to convert: ");
        int i = in.nextInt();

        System.out.print("Binary: " + Integer.toBinaryString(i) + "\nOctal: " + Integer.toOctalString(i) + "\nHexadecimal: " + Integer.toHexString(i) + "\n");
        System.out.println("Float: " + Float.toHexString((float)1/i));
    }
}