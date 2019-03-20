package chapter01;
/*
  Write a program that produces a random string of letters and digits by generating a random long value and
  printing it in base 36.
 */

import java.util.Random;

public class ex10 {
    public static void main(String[] args){
        Random rand = new Random();
        long longValue = rand.nextLong();
        System.out.println(Long.toString(longValue, 36));
    }
}
