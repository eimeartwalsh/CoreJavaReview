package chapter01;

/* Write a program that reads in two integers between 0 and 4294967295, stores them in int variables, and computes
   and displays their unsigned sum, difference, product, quotient, and remainder. Do not convert them to long values.
 */
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        short int1 = in.nextShort();
        System.out.println("Enter second integer: ");
        short int2 = in.nextShort();

        System.out.println("Sum of integers: " + (Short.toUnsignedInt(int1) + Short.toUnsignedInt(int2)));
        System.out.println("Difference between integers: " + (Short.toUnsignedInt(int1) - Short.toUnsignedInt(int2)));
        System.out.println("Product of integers: " + (Short.toUnsignedInt(int1) * Short.toUnsignedInt(int2)));
        System.out.println("Quotient of integers: " + (Short.toUnsignedInt(int1) / Short.toUnsignedInt(int2)));
        System.out.println("Remainder of integers: " + (Short.toUnsignedInt(int1) % Short.toUnsignedInt(int2)));
    }


}
