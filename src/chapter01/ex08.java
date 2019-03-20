package chapter01;

/*Write a program that reads a string and prints all of its nonempty substrings.*/

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        System.out.println("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String myString = in.nextLine();
        for (String returnString : myString.split("\\s")){
            System.out.println(returnString);
        }
    }
}
