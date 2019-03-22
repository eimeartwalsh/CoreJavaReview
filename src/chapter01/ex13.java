package chapter01;

/*  Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49.
    To pick six distinct numbers, start with an array list filled with 1...49. Pick a random index and remove the element.
    Repeat six times. Print the result in sorted order.
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ex13 {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= 49; i++){
            numList.add(i);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 1; i <= 6; i++){
            int num = rand.nextInt(49);
            resultList.add(numList.get(num));
            numList.remove(num);
        }
        Collections.sort(resultList);
        System.out.println(resultList);

    }
}
