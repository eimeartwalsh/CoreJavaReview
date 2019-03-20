package chapter01;

/*What happens when you cast a double to an int that is larger than the largest possible int value? Try it out.
 */

public class ex05 {
    public static void main(String[] args){
        System.out.println(Double.MAX_VALUE);
        System.out.println((int)Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}

// If we try to cast a number bigger than any type int to int, program returns the largest int.