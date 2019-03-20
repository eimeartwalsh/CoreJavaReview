package chapter01;

/* Write a program that computes the factorial n! = 1 × 2 × ... × n, using BigInteger. Compute the factorial of 1000.

 */

import java.math.BigInteger;

public class ex06 {
    public static BigInteger factorial(BigInteger n) {
        if (n.intValue() == 1)
            return n;
        else
            return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }

    public static void main(String[] args){
        System.out.println(factorial(BigInteger.valueOf(1000)));
    }
}
