package chapter01;
 /* Write a program that prints the smallest and largest positive double values.
    Hint: Look up Math.nextUp in the Java API.
  */

public class ex04 {
    public static void main(String[] args){
        System.out.println("Smallest: " + Math.nextUp((double) 0) + "\nLargest: " + Double.MAX_VALUE);
    }
}
